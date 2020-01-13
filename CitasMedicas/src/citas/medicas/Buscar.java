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
    //Instancias de otras clases
    Conexion  cnx = new Conexion();
    //Variables para el trabajo de sentencias
    Statement s;
    //Variable para mantener datos en cache
    ResultSet rs = null;
    
    public Boolean busqueda_loguin(String usuario, String pass){
        Boolean resultado = false;
        int cont = 0;
        
        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            s = cnx.conexion().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT EMPL_USUARIO, EMPL_PASS FROM TBL_EMPLEADOS "
                    + "WHERE EMPL_USUARIO = ? AND EMPL_PASS = ?;";

            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = cnx.conexion().prepareStatement(sql);
            consulta.setString(1, usuario);
            consulta.setString(2, pass);
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                resultado = true;
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda

        } //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        
        return resultado;
    }
}
