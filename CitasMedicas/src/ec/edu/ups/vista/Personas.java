package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.Persona;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Personas extends JFrame {

	private JPanel contentPane;
	public static JTextField txtEdad;
	public static JTextField txtNombre;
	public static JTextField txtCedula;
	public static JTextField txtDireccion;
	public static JTextField txtApellido;
	public static JTextField txtTelefono;
	private JLabel lblCdula;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDireccion;
	private JLabel lblEdad;
	private JLabel lblTelefono;
	private JLabel label;
	public static JButton btnModificar;
	public static JButton btnEliminar;
	private JScrollPane scrollPane;
	public static JTable table;
	private JScrollPane scrollPane_1;
	public static ArrayList<Persona> recibir;
	public static JButton btnAgregar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personas frame = new Personas();
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
	public Personas() {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				agregarPaciente();
				limpiarCampos();
				listarPers();
				JOptionPane.showMessageDialog(null, "Gracias");
			
			}
		});
		btnOk.setBounds(491, 36, 97, 25);
		contentPane.add(btnOk);
		
		JButton btnAgregarPaciente = new JButton("Agregar Paciente");
		btnAgregarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblCdula.setText("Id Paciente");
				lblNombre.setText("Id Pac Persona");
				lblApellidos.setText("Pac Fecha Registro");
				
				txtEdad.setEnabled(false);
				txtDireccion.setEnabled(false);
				txtTelefono.setEnabled(false);
			
				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
				btnModificar.setEnabled(false);
		
				
				
			}
		});
		btnAgregarPaciente.setBounds(343, 36, 136, 25);
		contentPane.add(btnAgregarPaciente);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 384, 638, 189);
		contentPane.add(scrollPane_1);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				seleccionarFila();
			}
		});
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Cédula", "Nombre", "Apellido", "Edad", "Direccion", "Telefono" }));
		scrollPane_1.setViewportView(table);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 499, 376, -111);
		contentPane.add(scrollPane);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar esta persona?", "Alerta!",
						JOptionPane.YES_NO_OPTION);

				if (resp == JOptionPane.YES_OPTION) {
					eliminarPersona();
					limpiarCampos();
					listarPers();
				} else {
					JOptionPane.showMessageDialog(null, "Gracias");
				}
			}
		});
		btnEliminar.setBounds(155, 586, 97, 25);
		contentPane.add(btnEliminar);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar esta persona?", "Alerta!",
						JOptionPane.YES_NO_OPTION);

				if (resp == JOptionPane.YES_OPTION) {
					modificarPersona();
					limpiarCampos();
					listarPers();
				} else {
					JOptionPane.showMessageDialog(null, "Gracias");
				}
			}
		});
		btnModificar.setBounds(22, 586, 97, 25);
		contentPane.add(btnModificar);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona persona = new Persona();
				guardarPersona();
				limpiarCampos();
				listarPers();
				JOptionPane.showMessageDialog(null, "Gracias");
			}
		});
		btnAgregar.setBounds(288, 300, 97, 25);
		contentPane.add(btnAgregar);

		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(111, 247, 166, 27);
		contentPane.add(txtEdad);

		txtNombre = new JTextField();
		txtNombre.setBounds(111, 88, 508, 27);
		contentPane.add(txtNombre);

		txtCedula = new JTextField();
		txtCedula.setBounds(111, 35, 166, 27);
		contentPane.add(txtCedula);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(111, 191, 508, 27);
		contentPane.add(txtDireccion);

		txtApellido = new JTextField();
		txtApellido.setBounds(111, 138, 508, 27);
		contentPane.add(txtApellido);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(111, 299, 166, 27);
		contentPane.add(txtTelefono);

		lblCdula = new JLabel("C\u00E9dula:");
		lblCdula.setBounds(12, 40, 123, 16);
		contentPane.add(lblCdula);

		lblNombre = new JLabel("Nombres:");
		lblNombre.setBounds(12, 93, 123, 16);
		contentPane.add(lblNombre);

		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(12, 143, 123, 16);
		contentPane.add(lblApellidos);

		lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(12, 196, 69, 16);
		contentPane.add(lblDireccion);

		lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(12, 252, 56, 16);
		contentPane.add(lblEdad);

		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(12, 304, 56, 16);
		contentPane.add(lblTelefono);

		label = new JLabel("");
		label.setIcon(new ImageIcon(Personas.class.getResource("/ec/edu/ups/sources/images/fondoSistemaMedico.jpg")));
		label.setBounds(0, 0, 664, 635);
		contentPane.add(label);
		listarPers();
	}

	protected void agregarPaciente() {
		
		ControladorPersona cp = new ControladorPersona();
		Paciente p = new Paciente();
	
		p.setPac_per_id(Integer.parseInt(txtNombre.getText()));
		p.setPac_fecha_registro(txtApellido.getText());
		

		cp.insertarPaciente(p);
		
	}

	protected void seleccionarFila() {

		int seleccion = table.getSelectedRow();

		DefaultTableModel modelo = (DefaultTableModel) table.getModel();

		String id = table.getValueAt(seleccion, 0) + "";
		String cedula = table.getValueAt(seleccion, 1) + "";
		String nombre = table.getValueAt(seleccion, 2) + "";
		String apellido = table.getValueAt(seleccion, 3) + "";
		String edad = table.getValueAt(seleccion, 4) + "";
		String direccion = table.getValueAt(seleccion, 5) + "";
		String telefono = table.getValueAt(seleccion, 6) + "";

		txtCedula.setText(cedula);
		txtNombre.setText(nombre);
		txtApellido.setText(apellido);
		txtEdad.setText(edad);
		txtDireccion.setText(direccion);
		txtTelefono.setText(telefono);

	}

	protected void eliminarPersona() {

		ControladorPersona cp = new ControladorPersona();
		String cedula = txtCedula.getText();
		String comilla = "\"";
		String parametroEnviado = (comilla.concat(cedula).concat(comilla)).trim();
		cp.eliminarPersona(parametroEnviado);

	}

	protected void modificarPersona() {

		ControladorPersona cp = new ControladorPersona();
		Persona persona = new Persona();

		persona.setPer_nombre(txtNombre.getText());
		persona.setPer_apellido(txtApellido.getText());
		persona.setPer_edad(Integer.parseInt(txtEdad.getText()));
		persona.setPer_direccion(txtDireccion.getText());
		persona.setPer_telefono(txtTelefono.getText());

		String codigo = txtCedula.getText().trim();
		String comilla = "\"";
		String parametroEnviado = (comilla.concat(codigo).concat(comilla)).trim();
		cp.Actualizar(persona, parametroEnviado);
		JOptionPane.showMessageDialog(null, "Registro Modificado");

	}

	public void guardarPersona() {

		ControladorPersona cp = new ControladorPersona();
		Persona p = new Persona();
		p.setPer_cedula(txtCedula.getText());
		p.setPer_nombre(txtNombre.getText());
		p.setPer_apellido(txtApellido.getText());
		p.setPer_edad(Integer.parseInt(txtEdad.getText()));
		p.setPer_direccion(txtDireccion.getText());
		p.setPer_telefono(txtTelefono.getText());

		cp.insertarPersona(p);
	}

	public static void listarPers() {

		ControladorPersona ob = new ControladorPersona();
		String ced = txtCedula.getText().trim();
		recibir = (ArrayList<Persona>) ob.listarPersona();

		for (int i = 0; i < recibir.size(); i++) {

			DefaultTableModel modelo = (DefaultTableModel) table.getModel();
			Object[] fila = new Object[7];

			fila[0] = recibir.get(i).getPer_id();
			fila[1] = recibir.get(i).getPer_cedula();
			fila[2] = recibir.get(i).getPer_nombre();
			fila[3] = recibir.get(i).getPer_apellido();
			fila[4] = recibir.get(i).getPer_edad();
			fila[5] = recibir.get(i).getPer_direccion();
			fila[6] = recibir.get(i).getPer_telefono();

			modelo.addRow(fila);
			table.setModel(modelo);

		}
	}

	public static void limpiarCampos() {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();

		for (int i = table.getRowCount() - 1; i >= 0; i--) {
			modelo.removeRow(i);
		}

		txtCedula.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtDireccion.setText("");
		txtEdad.setText("");
		txtTelefono.setText("");
		table.setEnabled(true);
	}
}
