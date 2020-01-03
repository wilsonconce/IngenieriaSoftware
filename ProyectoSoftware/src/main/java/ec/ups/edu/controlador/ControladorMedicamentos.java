package ec.ups.edu.controlador;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import ec.ups.edu.clases.Medicamento;

public class ControladorMedicamentos{
	
	

	public void insertar(Medicamento m) {

		Conectar con = null;

		String sql = "INSERT INTO medicamentos (codigoMedicamento, nombreMedicamento, dosisMedicamento)"
				+ "VALUES (?,?,?);";
		try {
			con = new Conectar();
			Connection reg = con.getConnection();

			PreparedStatement ps = (PreparedStatement) reg.prepareStatement(sql);
			ps.setString(1, m.getIdMedicamento());
			ps.setString(2, m.getNombre());
			ps.setString(3, m.getDosis());
			ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			con.desconectar();
		}

	}

}
