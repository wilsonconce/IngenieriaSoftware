package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;

public class VistaCitaMedica extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCitaMedica frame = new VistaCitaMedica();
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
	public VistaCitaMedica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 391);
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(VistaOrdenMedica.class.getResource("/Img/FondoSistema.png"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTransparente = new JPanel();
		panelTransparente.setForeground(SystemColor.inactiveCaptionBorder);
		panelTransparente.setBackground(new Color(108,100,100,158));
		panelTransparente.setBounds(20, 11, 576, 273);
		contentPane.add(panelTransparente);
		panelTransparente.setLayout(null);
		
		JLabel label = new JLabel("Cedula Paciente");
		label.setBounds(24, 27, 117, 14);
		panelTransparente.add(label);
		
		JLabel label_1 = new JLabel("Determinar Fecha");
		label_1.setBounds(24, 76, 117, 14);
		panelTransparente.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(151, 27, 130, 20);
		panelTransparente.add(textField);
		
		JButton button = new JButton("Buscar");
		button.setBounds(291, 26, 89, 23);
		panelTransparente.add(button);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(152, 73, 129, 20);
		panelTransparente.add(dateChooser);
		
		JLabel label_2 = new JLabel("Hora");
		label_2.setBounds(24, 131, 117, 14);
		panelTransparente.add(label_2);
		
		JLabel label_3 = new JLabel("Medico id");
		label_3.setBounds(24, 198, 117, 14);
		panelTransparente.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 198, 130, 20);
		panelTransparente.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(151, 131, 130, 20);
		panelTransparente.add(textField_2);
		
		table = new JTable();
		table.setBounds(291, 79, 275, 159);
		panelTransparente.add(table);
	}
}
