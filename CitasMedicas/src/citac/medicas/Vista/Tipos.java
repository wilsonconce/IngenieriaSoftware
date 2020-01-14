package citac.medicas.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import citas.medicas.ControladorTipos;
import modelo.ModeloTipo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tipos extends JFrame {

	private JPanel contentPane;
	public static JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tipos frame = new Tipos();
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
	public Tipos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 362, 176);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				seleccionarTipo();
				dispose();
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nombre"
			}
		));
		scrollPane.setViewportView(table);
		listaTipos();
	
	}
	
	
	
	public static void listaTipos() {

		List<ModeloTipo> recibir;
		
		ControladorTipos ob = new ControladorTipos();
		recibir = ob.listarTipos();
		
		
		

		for (int i = 0; i < recibir.size(); i++) {

			DefaultTableModel modelo = (DefaultTableModel) table.getModel();
			Object[] fila = new Object[6];

			fila[0] = recibir.get(i).getTipId();
			fila[1] = recibir.get(i).getTipNombre();

			modelo.addRow(fila);
			table.setModel(modelo);

		}
	}
	public  void seleccionarTipo(){
		 int seleccion = table.getSelectedRow();
		String tipoNombre = table.getValueAt(seleccion, 1)+"";
		System.out.println("DAVID " + tipoNombre);
	
		 PACIENTES.textTipo.setText(tipoNombre);
	
	}
}
