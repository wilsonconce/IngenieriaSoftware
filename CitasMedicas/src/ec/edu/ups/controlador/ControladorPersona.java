package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.modelo.Persona;

public class ControladorPersona {

	public void insertarPersona(Persona persona) {
	//	 Conexion cnx = new Conexion();
		Conexion con = null;

//		  String INSERT_TBL_PERSONA = "INSERT INTO PERSONA"
//	                + "	(PER_CEDULA, PER_NOMBRE, PER_APELLIDO, PER_EDAD, "
//	                + "PER_DIRECCIION, PER_TELEFONO) "
//	                + "VALUES"
//	                + "	(?, ?, ?, ?, ?, ?);";
		String INSERT_TBL_PERSONA = "INSERT INTO persona ( per_cedula, per_nombre, per_apellido, per_edad, per_direccion, per_telefono)"
				+ "VALUES (?,?,?,?,?,?);";

		try {

			con = new Conexion();
			Connection reg = con.getConnection();

			PreparedStatement insert_persona = (PreparedStatement) reg.prepareStatement(INSERT_TBL_PERSONA);

			insert_persona.setString(1, persona.getPer_cedula());
			insert_persona.setString(2, persona.getPer_nombre());
			insert_persona.setString(3, persona.getPer_apellido());
			insert_persona.setInt(4, persona.getPer_edad());
			insert_persona.setString(5, persona.getPer_direccion());
			insert_persona.setString(6, persona.getPer_telefono());
			insert_persona.execute();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			con.desconectar();
		}

	}
}
