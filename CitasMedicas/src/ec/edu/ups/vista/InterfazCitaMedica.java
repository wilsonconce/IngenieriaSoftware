package ec.edu.ups.vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.ups.controlador.ControladorCitasMedicas;
import ec.edu.ups.modelo.CitaMedica;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazCitaMedica extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("New label");
	public static TextField textField;
	public static TextField textField_1 ;
	public static TextField textField_2 ;
	public static TextField textField_3;
	public static TextField textField_4;
    public static TextField textField_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCitaMedica frame = new InterfazCitaMedica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public void guardarCita() {
		ControladorCitasMedicas cm=new ControladorCitasMedicas();
		CitaMedica cita=new CitaMedica();
		
		cita.setCm_duracion(Integer.parseInt(textField.getText()));
		cita.setCm_hora_fin( textField_5.getText()  );
		cita.setCm_hora_inicio(textField_1.getText() );
		cita.setCm_id(Integer.parseInt(textField_3.getText()));
		cita.setPaciente(textField_4.getText());
		cita.setCliente(textField_2.getText());
		cm.agregar(cita);
		
	}

	/**
	 * Create the frame.
	 */
	public InterfazCitaMedica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 textField_5 = new TextField();
		textField_5.setBounds(407, 142, 116, 24);
		contentPane.add(textField_5);
		
		textField_3 = new TextField();
		textField_3.setBounds(103, 188, 123, 24);
		contentPane.add(textField_3);
		
		 textField_2 = new TextField();
		textField_2.setBounds(407, 91, 122, 24);
		contentPane.add(textField_2);
		
		 textField_1 = new TextField();
		textField_1.setBounds(99, 132, 127, 24);
		contentPane.add(textField_1);
		
		textField_4 = new TextField();
		textField_4.setBounds(134, 228, 116, 24);
		contentPane.add(textField_4);
		
		textField = new TextField();
		textField.setBounds(99, 91, 127, 24);
		contentPane.add(textField);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha Fin");
		lblNewLabel_7.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_7.setBounds(294, 140, 107, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre Paciente");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_6.setBounds(12, 228, 116, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Id");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_5.setBounds(12, 188, 33, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre Cliente");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4.setBounds(294, 91, 116, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha Actual");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setBounds(12, 132, 102, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Duracion");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(12, 91, 65, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("RESERVAR CITA MEDICA");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(193, 13, 199, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("RESERVAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardarCita();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(291, 318, 127, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(50, 318, 134, 25);
		contentPane.add(btnNewButton);
		lblNewLabel.setIcon(new ImageIcon(InterfazCitaMedica.class.getResource("/ec/edu/ups/sources/images/fondoSistemaMedico.png")));
		lblNewLabel.setBounds(0, -1, 563, 343);
		contentPane.add(lblNewLabel);
	}
}
