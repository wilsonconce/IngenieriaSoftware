package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.modelo.ModeloLoguearse;

public class ControladorLoguearse {

	public static int rol;

	public List<ModeloLoguearse> Usuarios(String nombreTextField, String contraseñaTextField) {

		rol = 0;
		Conexion con = null;
		List<ModeloLoguearse> listaUsuarios = new ArrayList<>();
		System.out.println("Llego hasta aquí");

		String sql = "SELECT nombre, contraseña FROM usuarios" + " WHERE nombre = '" + nombreTextField
				+ "' and contraseña = '" + contraseñaTextField + "'";

		try {
			con = new Conexion();
			Connection reg = con.getConnection();
			PreparedStatement rs = (PreparedStatement) reg.prepareStatement(sql);
			ResultSet ps = rs.executeQuery();

			while (ps.next()) {

				ModeloLoguearse mo = new ModeloLoguearse();

				mo.setNombre(ps.getString("nombre"));
				System.out.println("El nombre que envía es: " + ps.getString("nombre"));
				mo.setContraseña(ps.getString("contraseña"));
				listaUsuarios.add(mo);

				if (ps.getString("nombre").equals("admin")) {
					rol = 1;
					System.out.println("Se logueo como administrador" + rol);

				}

				if (ps.getString("nombre").equals("user")) {
					rol = 2;
					System.out.println("Se logueo como usuario" + rol);

				}

			}

			ps.close();

		} catch (Exception e) {

		} finally {
			con.desconectar();
		}

		return listaUsuarios;

	}

}
