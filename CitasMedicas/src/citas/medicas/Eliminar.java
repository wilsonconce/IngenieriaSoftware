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

/**
 *
* @author Wilson Conce
 * @author David Egas
 * @author Leandro Leon
 * @author Bryan Pintado
 */
public class Eliminar {
    Conexion cnx = new Conexion();
    Statement s;
    ResultSet rs = null;

    public Boolean eliminar_empleado_id() {
        Boolean resultado = false;
//        String eliEmpleado = "DELETE FROM TBL_EMPLEADOS WHERE PERS_ID = ?";
//        String elipersona = "DELETE FROM TBL_PERSONA WHERE PERS_ID = ?";
//
//        try {
//            try (PreparedStatement eliminar_empleado = cnx.conexion().prepareStatement(eliEmpleado)) {
//                eliminar_empleado.setInt(1, id.getPERS_ID());
//                eliminar_empleado.executeUpdate();
//                eliminar_empleado.close();
//            }
//            try (PreparedStatement eliminar_persona = cnx.conexion().prepareStatement(elipersona)) {
//                eliminar_persona.setInt(1, id.getPERS_ID());
//                eliminar_persona.executeUpdate();
//                eliminar_persona.close();
//            }
//
//            resultado = true;
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }

        return resultado;
    }
}
