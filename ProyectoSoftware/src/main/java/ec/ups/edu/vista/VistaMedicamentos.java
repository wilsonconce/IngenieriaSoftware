package ec.ups.edu.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VistaMedicamentos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		textField = new JTextField();
		textField.setBounds(140, 23, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 58, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 93, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(12, 26, 56, 16);
		contentPane.add(lblId);
		
		JLabel lblMedicamento = new JLabel("Medicamento:");
		lblMedicamento.setBounds(12, 61, 98, 16);
		contentPane.add(lblMedicamento);
		
		JLabel lblDosis = new JLabel("Dosis:");
		lblDosis.setBounds(12, 96, 56, 16);
		contentPane.add(lblDosis);
	}
}
