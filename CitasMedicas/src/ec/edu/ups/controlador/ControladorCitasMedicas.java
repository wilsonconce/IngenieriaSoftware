/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.modelo.CitaMedica;
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

	public ControladorCitasMedicas() {
	
	}

	public boolean agregar(CitaMedica m) {

		PreparedStatement ps = null;
		

		String sql = "INSERT INTO citamedica (cm_duracion, cm_hora_fin, cm_hora_inicio, cm_id, cm_med_id, cm_pac_id)"
				+ "VALUES(?,?,?,?,?,?)";
		try {
			cnx = new Conexion();
			Connection con = cnx.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, m.getCm_duracion());
			ps.setString(2, m.getCm_hora_fin());
			ps.setString(3, m.getCm_hora_inicio());
			ps.setInt(4, m.getCm_id());
			ps.setString(5, m.getPaciente());
			ps.setString(6, m.getCliente());
			ps.execute();
			con.close();
			return true;
		} catch (SQLException e) {
			System.out.println(""+ e);
			return false;
		}
	}

}
