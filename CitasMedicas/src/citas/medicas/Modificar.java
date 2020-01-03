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
 * @author chita
 */
public class Modificar {
    Conexion cnx = new Conexion();
    Statement s;
    ResultSet rs = null;

    public Boolean actualizar_empleado() {
        Boolean resultado = false;

//        String actualizar_emp_persona = "UPDATE TBL_PERSONA SET "
//                + "PERS_NOMBRES = ?, "
//                + "PERS_APELLIDOS = ?, "
//                + "PERS_TELEFONO1 = ?, "
//                + "PERS_TELEFONO2 = ?, "
//                + "PERS_DIRECCION1 = ?, "
//                + "PERS_DIRECCION2 = ?, "
//                + "PERS_EMAIL1 = ?  WHERE PERS_ID = ?";
//
//        String actualizar_emp_cargo = "UPDATE TBL_EMPLEADOS SET "
//                + "EMPL_CARGO = ? ,"
//                + "EMPL_CEDULA_RUC = ?, "
//                + "EMPL_USUARIO = ?, "
//                + "EMPL_PASS = ?  "
//                + "WHERE PERS_ID = ? ;";
//        try {
//            //Obtencion del id de persona para la tabla de persona
//            this.s = cnx.conexion().createStatement();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
//
//        try {
//            try (PreparedStatement insert_tblpersona = cnx.conexion().prepareStatement(actualizar_emp_persona)) {
//                insert_tblpersona.setString(1, obEm.getPERS_NOMBRES());
//                insert_tblpersona.setString(2, obEm.getPERS_APELLIDOS());
//                insert_tblpersona.setString(3, obEm.getPERS_TELEFONO1());
//                insert_tblpersona.setString(4, obEm.getPERS_TELEFONO2());
//                insert_tblpersona.setString(5, obEm.getPERS_DIRECCION1());
//                insert_tblpersona.setString(6, obEm.getPERS_DIRECCION2());
//                insert_tblpersona.setString(7, obEm.getPERS_EMAIL1());
//                insert_tblpersona.setInt(8, obEm.getPERS_ID());
//
//                insert_tblpersona.executeUpdate();
//                insert_tblpersona.close();
//                resultado = true;
//            }
//
//            try (PreparedStatement insert_tblempleado = cnx.conexion().prepareStatement(actualizar_emp_cargo)) {
//                insert_tblempleado.setString(1, obEm.getEMPL_CARGO());
//                insert_tblempleado.setString(2, obEm.getEMPL_CEDULA_RUC());
//                insert_tblempleado.setString(3, obEm.getEMPL_USUARIO());
//                insert_tblempleado.setString(4, obEm.getEMPL_PASS());
//                insert_tblempleado.setInt(5, obEm.getPERS_ID());
//
//                insert_tblempleado.executeUpdate();
//                insert_tblempleado.close();
//                resultado = true;
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }

        return resultado;
    }
}
