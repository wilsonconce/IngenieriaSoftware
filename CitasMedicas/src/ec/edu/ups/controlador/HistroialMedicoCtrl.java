package ec.edu.ups.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.w3c.dom.events.MouseEvent;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.vista.HistorialMedico;
import ec.edu.ups.vista.HistorialMedicoPrincipal;

public class HistroialMedicoCtrl implements ActionListener, MouseListener{

	private HistorialMedico hisMed;
	private ControladorPersona ctrlPersona;
	private Persona persona;
	private HistorialMedicoPrincipal hmp;
	 public HistroialMedicoCtrl(HistorialMedico hisMed, ControladorPersona ctrlPersona, Persona persona, HistorialMedicoPrincipal hmp) {
		// TODO Auto-generated constructor stub
		 this.hisMed=hisMed;
		 this.ctrlPersona=ctrlPersona;
		 this.persona=persona;
		 this.hisMed.btn_buscarPersona.addActionListener(this);
		 this.hisMed.txtCIHM.addActionListener(this);
		
	}
	 
	 public void iniciar() {
			hmp.setTitle("Historial Médico");
			hmp.setLocationRelativeTo(null);
			hmp.setVisible(false);
		}
	 
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==hisMed.btn_buscarPersona || e.getSource()==hisMed.txtCIHM) {
			//System.out.println("holaaaa");
			listarPersona();
		}
	}

	public  void listarPersona() {
		
		 ArrayList<Persona> recibir =(ArrayList<Persona>) ctrlPersona.buscarPersona(persona) ;
		
		persona.setPer_cedula(hisMed.txtCIHM.getText()); 
		
		
		
		for(Persona persona:recibir) {
			//System.out.println(persona.getPer_cedula()+persona.getPer_edad());
			
			hisMed.txtNombreHM.setText(persona.getPer_nombre()+" "+persona.getPer_apellido());
			hisMed.txtEdadHM.setText(String.valueOf(persona.getPer_edad()));
			//hisMed.txtFechaNacHM.setText(String.valueOf(persona.get));
			/*Object[] fila = new Object[7];

			fila[0] = recibir.get(i).getPer_id();
			fila[1] = recibir.get(i).getPer_cedula();
			fila[2] = recibir.get(i).getPer_nombre();
			fila[3] = recibir.get(i).getPer_apellido();
			fila[4] = recibir.get(i).getPer_edad();
			fila[5] = recibir.get(i).getPer_direccion();
			fila[6] = recibir.get(i).getPer_telefono();*/

		
		}
	}
}
