package ec.edu.ups.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ec.edu.ups.controlador.reloj;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HistorialMedico extends JPanel {
	
	ImageIcon img;
	public 	JLabel lblFecha ;
	Date fecha=new Date();
	SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
	String fechaMostrar;
	private JLabel lblCiPersona;
	public JTextField txtCIHM;
	private JTextField txtNombreHM;
	private JTextField txtFechaNacHM;
	private JTextField txtEdadHM;
	private JTable tblPatologia;
	private JTextField txtIdPato;
	private JTextField txtNombrePatolo;
	private JTextField textField;
	public JButton btnActualizarHM;
	public JLabel lblHora_1;
	public JLabel label;
	public JButton btn_buscarPersona;
	 /**
	 * Create the panel.
	 */
	public HistorialMedico()  {
	 	setLayout(null);
	 	
	 	try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	 	
	 	try {
			fechaMostrar=formato.format(fecha);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
			JPanel panelPersona = new JPanel();
			panelPersona.setBorder(new TitledBorder(null, "Persona", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelPersona.setBackground(new Color(0,0,0,60));
			panelPersona.setBounds(12, 25, 539, 239);
			
			add(panelPersona);
			panelPersona.setLayout(null);
			
			lblCiPersona = new JLabel("C.I. Persona:");
			lblCiPersona.setHorizontalAlignment(SwingConstants.CENTER);
			lblCiPersona.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblCiPersona.setForeground(Color.WHITE);
			lblCiPersona.setBounds(41, 33, 93, 27);
			panelPersona.add(lblCiPersona);
			
			txtCIHM = new JTextField();
			txtCIHM.setFont(new Font("Tahoma", Font.BOLD, 13));
			txtCIHM.setHorizontalAlignment(SwingConstants.CENTER);
			txtCIHM.setBounds(146, 35, 116, 30);
			panelPersona.add(txtCIHM);
			txtCIHM.setColumns(10);
			
			btn_buscarPersona= new JButton("");
			btn_buscarPersona.setIcon(new ImageIcon(HistorialMedico.class.getResource("/ec/edu/ups/sources/images/lupa.png")));
			btn_buscarPersona.setBounds(267, 34, 29, 31);
			panelPersona.add(btn_buscarPersona);
			
			txtNombreHM = new JTextField();
			txtNombreHM.setHorizontalAlignment(SwingConstants.CENTER);
			txtNombreHM.setBounds(146, 93, 313, 30);
			panelPersona.add(txtNombreHM);
			txtNombreHM.setColumns(10);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
			lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNombre.setForeground(Color.WHITE);
			lblNombre.setBounds(78, 100, 56, 16);
			panelPersona.add(lblNombre);
			
			JLabel lblAoDeNacimiento = new JLabel("A\u00F1o de Nacimiento: ");
			lblAoDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
			lblAoDeNacimiento.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblAoDeNacimiento.setForeground(Color.WHITE);
			lblAoDeNacimiento.setBounds(12, 151, 137, 16);
			panelPersona.add(lblAoDeNacimiento);
			
			txtFechaNacHM = new JTextField();
			txtFechaNacHM.setHorizontalAlignment(SwingConstants.CENTER);
			txtFechaNacHM.setBounds(146, 148, 150, 30);
			panelPersona.add(txtFechaNacHM);
			txtFechaNacHM.setColumns(10);
			
			JLabel lblEdad = new JLabel("Edad: ");
			lblEdad.setForeground(Color.WHITE);
			lblEdad.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblEdad.setBounds(308, 151, 56, 16);
			panelPersona.add(lblEdad);
			
			txtEdadHM = new JTextField();
			txtEdadHM.setHorizontalAlignment(SwingConstants.CENTER);
			txtEdadHM.setBounds(353, 148, 107, 30);
			panelPersona.add(txtEdadHM);
			txtEdadHM.setColumns(10);
			
			JPanel panelFechas = new JPanel();
			panelFechas.setBorder(new TitledBorder(null, "Fecha de Actuaizaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelFechas.setBounds(12, 306, 539, 175);
			panelFechas.setBackground(new Color(0,0,0,60));
			add(panelFechas);
			panelFechas.setLayout(null);
			
			
			label= new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Tahoma", Font.BOLD, 17));
			label.setBounds(265, 104, 147, 47);
			panelFechas.add(label);

			
			
			lblFecha = new JLabel("");
			lblFecha.setForeground(Color.WHITE);
			lblFecha.setBounds(265, 28, 185, 63);
			panelFechas.add(lblFecha);
			lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
			lblFecha.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblFecha.setText(fechaMostrar);
			
			JLabel lblFecha_1 = new JLabel("Fecha:");
			lblFecha_1.setForeground(Color.WHITE);
			lblFecha_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblFecha_1.setBounds(122, 53, 56, 16);
			panelFechas.add(lblFecha_1);
			

			
			
			JPanel panelPatologia = new JPanel();
			panelPatologia.setBorder(new TitledBorder(null, "Patolog\u00EDa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelPatologia.setBounds(636, 25, 755, 564);
			panelPatologia.setBackground(new Color(0,0,0,60));
			add(panelPatologia);
			panelPatologia.setLayout(null);
			
			
			
			tblPatologia = new JTable(new DefaultTableModel( 
				new Object[][] {
					
				},
				new String [] {
						"Id", "Patología","Alergía","Nombre", "Tipo", "Medicamento", "Estado"
				}
			));
			
			JScrollPane jspPatologia = new JScrollPane(tblPatologia );
			jspPatologia.setBounds(37, 199, 689, 323);
			panelPatologia.add(jspPatologia);
			panelPatologia.add(jspPatologia);
			
			JPanel panelNewPatologia = new JPanel();
			panelNewPatologia.setBorder(new TitledBorder(null, "Agregar Nueva Patolog\u00EDa", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panelNewPatologia.setBounds(37, 68, 689, 118);
			panelNewPatologia.setBackground(new Color(0,0,200,0));
			panelPatologia.add(panelNewPatologia);
			panelNewPatologia.setLayout(null);
			
			JLabel lblIdPatologa = new JLabel("Id patolog\u00EDa:");
			lblIdPatologa.setForeground(Color.WHITE);
			lblIdPatologa.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblIdPatologa.setBounds(12, 23, 111, 22);
			panelNewPatologia.add(lblIdPatologa);
			
			txtIdPato = new JTextField();
			txtIdPato.setBounds(113, 20, 116, 30);
			panelNewPatologia.add(txtIdPato);
			txtIdPato.setColumns(10);
			
			JButton btnBuscarPAtologia = new JButton("");
			btnBuscarPAtologia.setIcon(new ImageIcon(HistorialMedico.class.getResource("/ec/edu/ups/sources/images/lupa.png")));
			btnBuscarPAtologia.setBounds(230, 20, 46, 30);
			panelNewPatologia.add(btnBuscarPAtologia);
			
			txtNombrePatolo = new JTextField();
			txtNombrePatolo.setBounds(113, 72, 116, 30);
			panelNewPatologia.add(txtNombrePatolo);
			txtNombrePatolo.setColumns(10);
			
			JLabel lblNombre_1 = new JLabel("Nombre:");
			lblNombre_1.setForeground(Color.WHITE);
			lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNombre_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNombre_1.setBounds(12, 72, 89, 30);
			panelNewPatologia.add(lblNombre_1);
			
			JLabel lblTipo = new JLabel("Tipo:");
			lblTipo.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblTipo.setForeground(Color.WHITE);
			lblTipo.setBounds(288, 79, 56, 16);
			panelNewPatologia.add(lblTipo);
			
			textField = new JTextField();
			textField.setBounds(356, 72, 116, 30);
			panelNewPatologia.add(textField);
			textField.setColumns(10);
			
			JButton btnAgregarPatologia = new JButton("");
			btnAgregarPatologia.setIcon(new ImageIcon(HistorialMedico.class.getResource("/ec/edu/ups/sources/images/add.png")));
			btnAgregarPatologia.setBounds(496, 64, 39, 38);
			panelNewPatologia.add(btnAgregarPatologia);
			
			btnActualizarHM = new JButton("");
			btnActualizarHM.setIcon(new ImageIcon(HistorialMedico.class.getResource("/ec/edu/ups/sources/images/botonGuardar.png")));
			btnActualizarHM.setBounds(496, 503, 61, 62);
			add(btnActualizarHM);
		
		
		
			lblHora_1 = new JLabel("Hora:");
			lblHora_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblHora_1.setForeground(Color.WHITE);
			lblHora_1.setBounds(122, 124, 56, 16);
			panelFechas.add(lblHora_1);
			
	}
	
	public void paintComponent(Graphics g) {
		Dimension tamanio= getSize();
		File archivoImagen = new File("src\\ec\\edu\\ups\\sources\\images\\fondoSistemaMedico.png");
		img=new ImageIcon(archivoImagen.getPath());//getClass().getResource(nombre)
		g.drawImage(img.getImage(), 0, 0, tamanio.width, tamanio.height,null);
		setOpaque(false);
	    super.paintComponent(g);
	  }
}
