package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.modelo.OrdenMedica;

public class ControladorOrdenMedica {

	public void insertarOrdenMedica(OrdenMedica ordenMedica) {
		Conexion con = null;
		ResultSet result = null;
		ResultSet result1 = null;
		ResultSet result2 = null;
		ResultSet result3 = null;
		String sql = "INSERT INTO ordenmedica (om_med_id,om_pac_id, om_diagnostico, om_cm_id, om_mdmt_id, om_fecha_inicio, om_fecha_fin)"
				+ "VALUES (?,?,?,?,?,?,?)";

		String sql_idMedico = "SELECT med_id FROM medico WHERE 1";
		String sql_idPaciente = "SELECT pac_id FROM paciente WHERE 1";
		String sql_idMedicamento = "SELECT mdmt_id FROM medicamento WHERE 1";
		String sql_idcitaMedica = "SELECT cm_id FROM citamedica WHERE 1";

		try {

			con = new Conexion();
			Connection reg = con.getConnection();
			PreparedStatement insert_idMedico = (PreparedStatement) reg.prepareStatement(sql_idMedico);
			PreparedStatement insert_idPaciente = (PreparedStatement) reg.prepareStatement(sql_idPaciente);
			PreparedStatement insert_idMedicamento = (PreparedStatement) reg.prepareStatement(sql_idMedicamento);
			PreparedStatement insert_idCitaMedica = (PreparedStatement) reg.prepareStatement(sql_idcitaMedica);

			result = insert_idMedicamento.executeQuery(sql_idMedicamento);
			result1 = insert_idMedico.executeQuery(sql_idMedico);
			result2 = insert_idPaciente.executeQuery(sql_idPaciente);
			result3 = insert_idCitaMedica.executeQuery(sql_idcitaMedica);

			PreparedStatement insert_ordenMedica = (PreparedStatement) reg.prepareStatement(sql);

			while (result1.next()) {
				int med_id_bd = Integer.parseInt(result1.getString("med_id"));
				insert_ordenMedica.setInt(1, med_id_bd);
			}
			while (result2.next()) {
				int pac_id_bd = Integer.parseInt(result2.getString("pac_id"));
				insert_ordenMedica.setInt(2, pac_id_bd);
			}
			insert_ordenMedica.setString(3, ordenMedica.getOm_diagnostico());
			while (result3.next()) {
				int cm_id_bd = Integer.parseInt(result3.getString("cm_id"));
				insert_ordenMedica.setInt(4, cm_id_bd);
			}
			while (result.next()) {
				int mdmt_id_bd = Integer.parseInt(result.getString("mdmt_id"));
				insert_ordenMedica.setInt(5, mdmt_id_bd);
			}
			insert_ordenMedica.setString(6, ordenMedica.getOm_fecha_inicio());
			insert_ordenMedica.setString(7, ordenMedica.getOm_fecha_fin());

			insert_ordenMedica.execute();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			con.desconectar();
		}

	}
	
}
