package ec.ups.edu.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="medicamento")
public class Medicamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idMedicamento;
	@Column
	private String nombre;
	@Column
	private String dosis;


	
	public String getIdMedicamento() {
		return idMedicamento;
	}



	public void setIdMedicamento(String idMedicamento) {
		this.idMedicamento = idMedicamento;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDosis() {
		return dosis;
	}



	public void setDosis(String dosis) {
		this.dosis = dosis;
	}



	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + idMedicamento + ", nombre=" + nombre + ", dosis=" + dosis 
				+  "]";
	}
	
}