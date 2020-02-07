package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	public static JButton btnAdministrador;
	Icon pressedIcon = new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/admin96.png"));

	Icon pressedIcon2 = new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/agendarG.png"));
	
	Icon pressedIcon3 = new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/histo96.png"));
	
	Icon pressedIcon4 = new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/ordenMG.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1450, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/ordenMP.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setPressedIcon(pressedIcon4);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(710, 397, 99, 60);
		contentPane.add(btnNewButton_1);
		
		JLabel lblOrdenMdica = new JLabel("Orden M\u00E9dica");
		lblOrdenMdica.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOrdenMdica.setBounds(710, 353, 116, 16);
		contentPane.add(lblOrdenMdica);
		
		JLabel lblHistorialMdico = new JLabel("Historial M\u00E9dico");
		lblHistorialMdico.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHistorialMdico.setBounds(506, 352, 133, 16);
		contentPane.add(lblHistorialMdico);
		btnNewButton.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/histo64.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setPressedIcon(pressedIcon3);
		btnNewButton.setBounds(527, 383, 86, 85);
		contentPane.add(btnNewButton);

		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 99));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(12, 36, 563, 114);
		contentPane.add(lblBienvenido);

		JLabel lblAgendarCita = new JLabel("Agendar Cita");
		lblAgendarCita.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAgendarCita.setBounds(327, 345, 116, 30);
		contentPane.add(lblAgendarCita);

		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdministrador.setBounds(131, 345, 116, 30);
		contentPane.add(lblAdministrador);

		JButton btnAgendarCita = new JButton("");
		btnAgendarCita
				.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/agendarP.png")));
		btnAgendarCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgendarCita.setBounds(288, 327, 174, 185);
		btnAgendarCita.setContentAreaFilled(false);
		btnAgendarCita.setPressedIcon(pressedIcon2);
		btnAgendarCita.setBorder(null);
		contentPane.add(btnAgendarCita);

		btnAdministrador = new JButton("");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Personas p = new Personas();
				p.setVisible(true);

			}
		});
		btnAdministrador
				.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/admin 64.png")));
		btnAdministrador.setBounds(102, 355, 174, 138);
		btnAdministrador.setBorder(null);
		btnAdministrador.setContentAreaFilled(false);
		btnAdministrador.setPressedIcon(pressedIcon);
		contentPane.add(btnAdministrador);

		lblNewLabel = new JLabel("Administrador");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ec/edu/ups/sources/images/fondoSistemaMedico.jpg")));
		lblNewLabel.setBounds(0, 0, 1432, 703);
		contentPane.add(lblNewLabel);
	}
}
