package ec.ups.edu.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.clases.JPAUtil;
import ec.ups.edu.clases.Medicamento;



public class ClienteDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	// guardar cliente
	public void guardar(Medicamento medicamento) {
		entity.getTransaction().begin();
		entity.persist(medicamento);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// editar cliente
	public void editar(Medicamento medicamento) {
		entity.getTransaction().begin();
		entity.merge(medicamento);
		entity.getTransaction().commit();
		/// JPAUtil.shutdown();
	}

	// buscar cliente
	public Medicamento buscar(Long idMedicamento) {
		Medicamento c = new Medicamento();
		c = entity.find(Medicamento.class, idMedicamento);
		// JPAUtil.shutdown();
		return c;
	}

	/// eliminar cliente
	public void eliminar(Long idMedicamento) {
		Medicamento c = new Medicamento();
		c = entity.find(Medicamento.class, idMedicamento);
		entity.getTransaction().begin();
		entity.remove(c);
		entity.getTransaction().commit();
	}

	// obtener todos los cliente
	public List<Medicamento> obtenerClientes() {
		List<Medicamento> listaClientes = new ArrayList<>();
		Query q = entity.createQuery("SELECT c FROM Cliente c");
		listaClientes = q.getResultList();
		return listaClientes;
	}

}