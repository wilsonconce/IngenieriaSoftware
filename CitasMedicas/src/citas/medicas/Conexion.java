/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas.medicas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author chita
 */
public class Conexion {
     // Librería de MySQL
        public String driver = "com.mysql.cj.jdbc.Driver";
        // Nombre de la base de datos
        public String database = "empleados";
        // Host
        public String hostname = "localhost"; //localhost";
        // Puerto
        public String port = "3306";
        // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
        public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?use Timezone=true&serverTimezone=UTC";
        // Nombre de usuario
        public String username = "root";
        // Clave de usuario
        public String password = "cuenca";
        // Variable para la conexion con la base de datos
        static Connection conn = null;    
    
    public Connection conexion(){
        try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
                
                if(conn != null){
                    //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
                }
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "NO CONECTADO, OCURRIO UN ERROR: " + e.getMessage());
            }
        return conn;
    }//Fin de la funcion conexion
    
    public static int terminarConexionMysql() throws SQLException {
        try {
            if(conn != null){
               conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO CONECTADO, OCURRIO UN ERROR: " + e.getMessage());
        }
        
        return 0;
    }//Fin de la funcion terminarConexionMysql
}
