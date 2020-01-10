/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citac.medicas.Vista;

import java.awt.event.KeyEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import citas.medicas.ControladorPersona;
import modelo.Persona;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
* @author Wilson Conce
 * @author David Egas
 * @author Leandro Leon
 * @author Bryan Pintado
 */
public class PACIENTES extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReservarCita
     */
    public PACIENTES() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(0, 0, 772, 43);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(12, 93, 71, 33);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(12, 50, 71, 33);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(12, 179, 71, 33);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(12, 139, 71, 33);
        txtCedula = new javax.swing.JTextField();
        txtCedula.setBounds(88, 53, 124, 27);
        txtNombres = new javax.swing.JTextField();
        txtNombres.setBounds(88, 96, 427, 27);
        txtDireccion = new javax.swing.JTextField();
        txtDireccion.setBounds(88, 182, 427, 27);
        txtApellidos = new javax.swing.JTextField();
        txtApellidos.setBounds(88, 142, 427, 27);
        btnRegistrar = new javax.swing.JButton();
        btnRegistrar.setBounds(636, 346, 115, 25);
        btnRegistrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		guardarPersona();        	
        	}
        });
        btnCancelar = new javax.swing.JButton();
        btnCancelar.setBounds(436, 346, 93, 25);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR PACIENTES");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOMBRES");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("C\u00C9DULA");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DIRECCI\u00D3N");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("APELLIDOS");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });

        btnRegistrar.setText("REGISTRARSE");

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        
        JLabel lblNewLabel = new JLabel("Edad");
        lblNewLabel.setBounds(12, 229, 71, 15);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        txtEdad = new JTextField();
        txtEdad.setBounds(88, 225, 116, 27);
        txtEdad.setColumns(10);
        
        JLabel lblDireccin = new JLabel("Direcci\u00F3n");
        lblDireccin.setBounds(12, 268, 59, 16);
        lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        texDire = new JTextField();
        texDire.setBounds(88, 265, 428, 27);
        texDire.setColumns(10);
        
        JLabel lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(12, 311, 55, 16);
        lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        textTelefono = new JTextField();
        textTelefono.setBounds(88, 305, 136, 27);
        textTelefono.setColumns(10);
        
        JLabel lblRol = new JLabel("Rol");
        lblRol.setBounds(614, 228, 18, 16);
        
        textRol = new JTextField();
        textRol.setBounds(644, 225, 116, 27);
        textRol.setColumns(10);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        getContentPane().add(lblNewLabel);
        getContentPane().add(lblDireccin);
        getContentPane().add(jLabel5);
        getContentPane().add(jLabel6);
        getContentPane().add(jLabel3);
        getContentPane().add(jLabel4);
        getContentPane().add(lblTelefono);
        getContentPane().add(txtEdad);
        getContentPane().add(lblRol);
        getContentPane().add(textRol);
        getContentPane().add(txtNombres);
        getContentPane().add(txtCedula);
        getContentPane().add(txtDireccion);
        getContentPane().add(txtApellidos);
        getContentPane().add(btnCancelar);
        getContentPane().add(btnRegistrar);
        getContentPane().add(texDire);
        getContentPane().add(textTelefono);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void guardarPersona() {
		// TODO Auto-generated method stub
    	
    	ControladorPersona cp = new ControladorPersona();
    	Persona p = new Persona();
    	p.setPer_cedula(txtCedula.getText());
    	p.setPer_nombre(txtNombres.getText());
    	p.setPer_apellido(txtApellidos.getText());
    	p.setPer_edad(Integer.parseInt(txtEdad.getText()));
    	p.setPer_direccion(txtDireccion.getText());
    	p.setPer_telefono(textTelefono.getText());
    	
		cp.insertarPersona(p);
	}

	private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();
        }
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtApellidos.requestFocus();
        }
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
           // txtFecha.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JTextField txtApellidos;
    private static javax.swing.JTextField txtCedula;
    private static javax.swing.JTextField txtDireccion;
    private static javax.swing.JTextField txtNombres;
    private static JTextField txtEdad;
    private static JTextField texDire;
    private static JTextField textTelefono;
    private static JTextField textRol;
}
