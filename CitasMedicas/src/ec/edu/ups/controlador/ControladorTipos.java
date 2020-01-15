package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.modelo.ModeloTipo;

public class ControladorTipos {

	public List<ModeloTipo> listarTipos() {

		Conexion con = null;
		List<ModeloTipo> listaDeTipos = new ArrayList<>();

		String sql = "select * from tipos";

		try {
			con = new Conexion();
			Connection reg = con.getConnection();
			PreparedStatement rs = (PreparedStatement) reg.prepareStatement(sql);
			ResultSet ps = rs.executeQuery();

			while (ps.next()) {

				ModeloTipo mo = new ModeloTipo();

				mo.setTipId(ps.getInt("tipo_id"));
				System.out.println("envia" + ps.getInt("tipo_id"));
				mo.setTipNombre(ps.getString("tipo_descripcion"));
				System.out.println("envia" + ps.getString("tipo_descripcion"));
				listaDeTipos.add(mo);

			}
			ps.close();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			con.desconectar();
		}

		return listaDeTipos;

	}
}
