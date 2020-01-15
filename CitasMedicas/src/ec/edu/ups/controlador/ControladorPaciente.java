package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.modelo.Persona;

public class ControladorPaciente {

	private Persona persona;
	private Conexion cnx;

	public ControladorPaciente(Persona persona) {
		this.persona = persona;
	}

	public boolean agregar() {

		PreparedStatement ps = null;
		

		String sql = "INSERT INTO persona (per_id, per_cedula, per_nombre, per_apellido, per_edad, per_direccion, per_telefono)"
				+ "VALUES(?,?,?,?,?,?,?)";
		try {
			cnx = new Conexion();
			Connection con = cnx.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setString(2, "0105801567");
			ps.setString(3, "Wilson");
			ps.setString(4, "conce");
			ps.setInt(5, 27);
			ps.setString(6, "Gualaceo");
			ps.setString(7, "0980461832");
			ps.execute();
			con.close();
			return true;
		} catch (SQLException e) {
			System.out.println(""+ e);
			return false;
		}
	}

}
