package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.controlador.HistroialMedicoCtrl;
import ec.edu.ups.controlador.reloj;
import ec.edu.ups.modelo.Persona;

public class HistorialMedicoPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistorialMedicoPrincipal frame = new HistorialMedicoPrincipal();
					HistorialMedico hm= new HistorialMedico();
					ControladorPersona ctrlPersona=new ControladorPersona();
					Persona persona=new Persona();
					reloj rlj=new reloj();
					rlj.generarHora(hm);
					HistroialMedicoCtrl hmc=new HistroialMedicoCtrl(hm, ctrlPersona,persona,frame);
					
					frame.getContentPane().add(hm);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HistorialMedicoPrincipal() {
		setTitle("Historial Médico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1450, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
