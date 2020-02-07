/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class ControladorCitasMedicas {
    private Persona persona;
	private Conexion cnx;

	public ControladorCitasMedicas(Persona persona) {
		this.persona = persona;
	}

	public boolean agregar() {

		PreparedStatement ps = null;
		

		String sql = "INSERT INTO citamedica (cm_duracion, cm_hora_fin, cm_hora_inicio, cm_id, cm_med_id, cm_pac_id)"
				+ "VALUES(?,?,?,?,?,?)";
		try {
			cnx = new Conexion();
			Connection con = cnx.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, 5);
			ps.setString(2, "12:50");
			ps.setString(3, "15:50");
			ps.setInt(4, 5);
			ps.setInt(5, 6);
			ps.setInt(6, 8);
			ps.execute();
			con.close();
			return true;
		} catch (SQLException e) {
			System.out.println(""+ e);
			return false;
		}
	}

}
