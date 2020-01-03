package ec.ups.edu.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.ups.edu.modelo.Medicamento;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMedicamentos extends JFrame {

	private JPanel contentPane;
	public static JTextField id_medicamento;
	public static JTextField nombre_medicamento;
	public static JTextField dosis_medicamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaMedicamentos frame = new VistaMedicamentos();
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
	public VistaMedicamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		id_medicamento = new JTextField();
		id_medicamento.setBounds(140, 23, 116, 22);
		contentPane.add(id_medicamento);
		id_medicamento.setColumns(10);
		
		nombre_medicamento = new JTextField();
		nombre_medicamento.setBounds(140, 58, 116, 22);
		contentPane.add(nombre_medicamento);
		nombre_medicamento.setColumns(10);
		
		dosis_medicamento = new JTextField();
		dosis_medicamento.setBounds(140, 93, 116, 22);
		contentPane.add(dosis_medicamento);
		dosis_medicamento.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(12, 26, 56, 16);
		contentPane.add(lblId);
		
		JLabel lblMedicamento = new JLabel("Medicamento:");
		lblMedicamento.setBounds(12, 61, 98, 16);
		contentPane.add(lblMedicamento);
		
		JLabel lblDosis = new JLabel("Dosis:");
		lblDosis.setBounds(12, 96, 56, 16);
		contentPane.add(lblDosis);
		
		JButton btnGuardarMedicamento = new JButton("Guardar");
		btnGuardarMedicamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				guardarMedicamentoRecetado();
			}
		});
		btnGuardarMedicamento.setBounds(268, 92, 97, 25);
		contentPane.add(btnGuardarMedicamento);
	}

	protected void guardarMedicamentoRecetado() {
		// TODO Auto-generated method stub
		/*ControladorMedicamentos c = new ControladorMedicamentos();
		Medicamento objetoMedicamento = new Medicamento();
		objetoMedicamento.setIdMedicamento(id_medicamento.getText());
		objetoMedicamento.setNombre(nombre_medicamento.getText());
		objetoMedicamento.setDosis(dosis_medicamento.getText());
		c.insertar(objetoMedicamento);*/
	}
}
