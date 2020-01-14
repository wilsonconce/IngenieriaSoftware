/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas.medicas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
/**
 *
* @author Wilson Conce
 * @author David Egas
 * @author Leandro Leon
 * @author Bryan Pintado
 */
public class Buscar {
    Conexion cnx = new Conexion();
    Statement s;
    ResultSet rs = null;
    
    public Boolean busqueda_loguin(String usuario, String pass){
        Boolean resultado = false;
        int cont = 0;
        
        try {
            s = cnx.conexion().createStatement();

            String sql = "SELECT EMPL_USUARIO, EMPL_PASS FROM TBL_EMPLEADOS "
                    + "WHERE EMPL_USUARIO = ? AND EMPL_PASS = ?;";


            PreparedStatement consulta = cnx.conexion().prepareStatement(sql);
            consulta.setString(1, usuario);
            consulta.setString(2, pass);

            rs = consulta.executeQuery();
            while (rs.next()) {
                resultado = true;
            }

        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        
        return resultado;
    }
}
