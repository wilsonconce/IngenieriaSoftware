package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.ups.controlador.ControladorLoguearse;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Loguearse extends JFrame {

	private JPanel contentPane;
	public static JTextField usuarioTextfield;
	public static JPasswordField contraseñaField;
	public static JButton btnIniciar;
	public static JButton btnSalir;
	private JLabel lblfondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loguearse frame = new Loguearse();
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
	public Loguearse() {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Loguearse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Loguearse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Loguearse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Loguearse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblUsuario.setBounds(56, 93, 106, 16);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblContrasea.setBounds(56, 139, 106, 16);
		contentPane.add(lblContrasea);

		usuarioTextfield = new JTextField();
		usuarioTextfield.setBounds(174, 88, 183, 22);
		contentPane.add(usuarioTextfield);
		usuarioTextfield.setColumns(10);

		contraseñaField = new JPasswordField();
		contraseñaField.setBounds(174, 135, 183, 22);
		contentPane.add(contraseñaField);

		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				loguearUsuarios();

			}
		});
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIniciar.setBounds(260, 196, 97, 25);
		contentPane.add(btnIniciar);

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalir.setBounds(56, 196, 97, 25);
		contentPane.add(btnSalir);

		JLabel Credenciales = new JLabel("Credenciales");
		Credenciales.setHorizontalAlignment(SwingConstants.CENTER);
		Credenciales.setFont(new Font("Palatino Linotype", Font.BOLD, 30));
		Credenciales.setBounds(85, 13, 239, 43);
		contentPane.add(Credenciales);

		lblfondo = new JLabel("");
		lblfondo.setIcon(
				new ImageIcon(Loguearse.class.getResource("/ec/edu/ups/sources/images/fondoSistemaMedico.jpg")));
		lblfondo.setBounds(0, 0, 409, 253);
		contentPane.add(lblfondo);
	}

	protected void loguearUsuarios() {

		String nombreTextField = usuarioTextfield.getText().trim();
		String contraseñaTextField = contraseñaField.getText().trim();

		ControladorLoguearse cl = new ControladorLoguearse();
		cl.Usuarios(nombreTextField, contraseñaTextField);

		if (ControladorLoguearse.rol == 1) {
			VentanaPrincipal ob = new VentanaPrincipal();
			ob.setVisible(true);
		}
		if (ControladorLoguearse.rol == 2) {
			VentanaPrincipal ob = new VentanaPrincipal();
			ob.setVisible(true);
			VentanaPrincipal.btnAdministrador.setEnabled(false);
		}
	}
}
