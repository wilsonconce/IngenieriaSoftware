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
public class Guardar {

	Conexion cnx = new Conexion();

	Statement s;
	ResultSet rs = null;

	public Boolean guardar_cliente() {
		Boolean resultado = false;

		String INSERT_TBL_PERSONA = "INSERT INTO TBL_PERSONA"
				+ "	(PERS_ID, PERS_NOMBRES, PERS_APELLIDOS, PERS_TELEFONO1, "
				+ "PERS_TELEFONO2, PERS_DIRECCION1,PERS_DIRECCION2, PERS_EMAIL1) " + "VALUES"
				+ "	(?, ?, ?, ?, ?, ?, ?, ?);";

		// String SELECT_ID_PERSONA = "SELECT COUNT(*) FROM TBL_PERSONA;";
		String SELECT_ID_PERSONA = "SELECT PERS_ID FROM TBL_PERSONA WHERE " + "PERS_NOMBRES LIKE '"
				+ rgCliente.getPERS_NOMBRES() + "';";

		String INSERT_TBL_CLIENTE = "INSERT INTO TBL_CLIENTES (CLI_ID, CLI_CEDULA_RUC, CLI_TIPO, PERS_ID) " + " VALUES "
				+ "(?, ?, ?, ?);";

		try {
			// Ejecucion del insert para la tabla persona
			PreparedStatement insert_persona = cnx.conexion().prepareStatement(INSERT_TBL_PERSONA);
			insert_persona.setInt(1, rgCliente.getPERS_ID());
			insert_persona.setString(2, rgCliente.getPERS_NOMBRES());
			insert_persona.setString(3, rgCliente.getPERS_APELLIDOS());
			insert_persona.setString(4, rgCliente.getPERS_TELEFONO1());
			insert_persona.setString(5, rgCliente.getPERS_TELEFONO2());
			insert_persona.setString(6, rgCliente.getPERS_DIRECCION1());
			insert_persona.setString(7, rgCliente.getPERS_DIRECCION2());
			insert_persona.setString(8, rgCliente.getPERS_EMAIL1());
			insert_persona.execute();

			// Obteniendo ID de la persona al que pertenece el cliente
			this.s = cnx.conexion().createStatement();
			rs = s.executeQuery(SELECT_ID_PERSONA);
			rs.next();

			// GUARDADO DEL CLIENTE
			if (rs != null) {
				// Ejecucion del insert para la tabla clientes
				PreparedStatement insert_tblclientes = cnx.conexion().prepareStatement(INSERT_TBL_CLIENTE);
				insert_tblclientes.setInt(1, rgCliente.getCLI_ID());
				insert_tblclientes.setString(2, rgCliente.getCLI_CEDULA_RUC());
				insert_tblclientes.setString(3, rgCliente.getCLI_TIPO());
				insert_tblclientes.setInt(4, rs.getInt(1));
				insert_tblclientes.execute();
				resultado = true;
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}

		return resultado;
	}
}
