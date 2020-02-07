package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.controlador.ControladorOrdenMedica;
import ec.edu.ups.modelo.OrdenMedica;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class VistaOrdenMedica extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaOrdenMedica frame = new VistaOrdenMedica();
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
	public VistaOrdenMedica() {
		setTitle("Orden Medica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 411);
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit()
						.getImage(VistaOrdenMedica.class.getResource("/Img/FondoSistema.png"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(VistaOrdenMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VistaOrdenMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VistaOrdenMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VistaOrdenMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		contentPane.setToolTipText("Orden Medica");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelTransparente = new JPanel();
		panelTransparente.setForeground(SystemColor.inactiveCaptionBorder);
		panelTransparente.setBackground(new Color(108, 100, 100, 158));
		panelTransparente.setBounds(27, 23, 587, 303);
		contentPane.add(panelTransparente);
		panelTransparente.setLayout(null);

		JLabel lblMedicamento = new JLabel("Medicamento");
		lblMedicamento.setForeground(new Color(255, 255, 255));
		lblMedicamento.setBounds(26, 35, 89, 14);
		panelTransparente.add(lblMedicamento);

		JLabel label_2 = new JLabel("Diagnostico");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBounds(26, 148, 75, 14);
		panelTransparente.add(label_2);

		JTextArea txt_Diagnostico = new JTextArea();
		txt_Diagnostico.setBounds(111, 143, 408, 86);
		panelTransparente.add(txt_Diagnostico);

		JDateChooser fecha_2 = new JDateChooser();
		fecha_2.setBounds(431, 86, 118, 20);
		panelTransparente.add(fecha_2);

		JDateChooser fecha_1 = new JDateChooser();
		fecha_1.setDateFormatString("yyyy/MM/dd");
		fecha_1.setBounds(431, 26, 118, 20);
		panelTransparente.add(fecha_1);

		JLabel label_3 = new JLabel("Fecha inicio tratamiento");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBounds(294, 32, 127, 14);
		panelTransparente.add(label_3);

		JLabel label_4 = new JLabel("Fecha fin tratamiento");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setBounds(294, 84, 127, 14);
		panelTransparente.add(label_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(111, 32, 127, 20);
		panelTransparente.add(comboBox);
		llenarComboBox(comboBox);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String medicamento = comboBox.getSelectedItem() + "";
				String diagnostico = txt_Diagnostico.getText();

				String dia = Integer.toString(fecha_1.getCalendar().get(Calendar.DAY_OF_MONTH));
				String mes = Integer.toString(fecha_1.getCalendar().get(Calendar.MONTH) + 1);
				String year = Integer.toString(fecha_1.getCalendar().get(Calendar.YEAR));
				String fechaInicio = (year + "/" + mes + "/" + dia);

				String dia_2 = Integer.toString(fecha_2.getCalendar().get(Calendar.DAY_OF_MONTH));
				String mes_2 = Integer.toString(fecha_2.getCalendar().get(Calendar.MONTH) + 1);
				String year_2 = Integer.toString(fecha_2.getCalendar().get(Calendar.YEAR));
				String fechaFin = (year + "/" + mes + "/" + dia);

				OrdenMedica ordenMedica = new OrdenMedica(1, medicamento, diagnostico, fechaInicio, fechaFin);
				ControladorOrdenMedica ctlOrdenMedica = new ControladorOrdenMedica();
				ctlOrdenMedica.insertarOrdenMedica(ordenMedica);

			}
		});
		btnGuardar.setBounds(111, 257, 89, 23);
		panelTransparente.add(btnGuardar);

		JLabel lblMedico = new JLabel("Medico");
		lblMedico.setForeground(Color.WHITE);
		lblMedico.setBounds(26, 100, 75, 14);
		panelTransparente.add(lblMedico);

		JComboBox comboBox_Medicos = new JComboBox();
		comboBox_Medicos.setBounds(111, 97, 127, 20);
		panelTransparente.add(comboBox_Medicos);
		llenarComboBoxMedicos(comboBox_Medicos);

	}

	public void llenarComboBox(JComboBox combo_Box) {
		Conexion conexion = null;
		PreparedStatement pst = null;
		ResultSet result = null;

		String sql = "SELECT mdmt_nombre FROM medicamento ORDER BY mdmt_nombre ASC";
		try {
			conexion = new Conexion();
			Connection reg = conexion.getConnection();

			PreparedStatement llenar_combo_box = (PreparedStatement) reg.prepareStatement(sql);
			result = llenar_combo_box.executeQuery(sql);
			combo_Box.addItem("Seleccione una opcion");

			while (result.next()) {

				combo_Box.addItem(result.getString("mdmt_nombre"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			conexion.desconectar();
		}

	}
	public void llenarComboBoxMedicos(JComboBox combo_Box) {
		Conexion conexion = null;
		PreparedStatement pst = null;
		ResultSet result = null;

		String sql = "Select m.med_id, m.med_per_id, p.per_id, p.per_nombre \r\n" + 
				"From Persona p, Medico m\r\n" + 
				"Where m.med_per_id=p.per_id;";
		try {
			conexion = new Conexion();
			Connection reg = conexion.getConnection();

			PreparedStatement llenar_combobox = (PreparedStatement) reg.prepareStatement(sql);
			result = llenar_combobox.executeQuery(sql);
			combo_Box.addItem("Seleccione una opcion");

			while (result.next()) {

				combo_Box.addItem(result.getString(4));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			conexion.desconectar();
		}
	}
}
