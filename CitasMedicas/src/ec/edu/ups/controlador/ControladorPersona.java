package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.Persona;

public class ControladorPersona {

	public void insertarPersona(Persona persona) {

		Conexion con = null;

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

			e.printStackTrace();
		} finally {
			con.desconectar();
		}

	}

	public void Actualizar(Persona persona, String cedula) {

		Conexion con = null;

		String sql = "update  persona  set per_nombre=?, per_apellido=?, per_edad=?, per_direccion=?, per_telefono=?  where per_cedula like "
				+ cedula;

		try {

			con = new Conexion();
			Connection reg = con.getConnection();

			PreparedStatement rs = (PreparedStatement) reg.prepareStatement(sql);
			rs.setString(1, persona.getPer_nombre());
			rs.setString(2, persona.getPer_apellido());
			rs.setInt(3, persona.getPer_edad());
			rs.setString(4, persona.getPer_direccion());
			rs.setString(5, persona.getPer_telefono());
			rs.executeUpdate();

		} catch (Exception e) {

		} finally {
			con.desconectar();
		}

	}

	public void eliminarPersona(String cedula) {
		Conexion con = null;
		int res = 0;

		String sql = "delete from persona where per_cedula like" + cedula;

		try {

			con = new Conexion();
			Connection reg = con.getConnection();
			PreparedStatement rs = (PreparedStatement) reg.prepareStatement(sql);
			int ps = rs.executeUpdate();

		} catch (Exception exe) {
			exe.printStackTrace();
		} finally {
			con.desconectar();
		}

	}

	public List<Persona> listarPersona() {

		Conexion con = null;
		List<Persona> listar = new ArrayList<>();
		System.out.println("llego");

		String sql = "select * from persona";

		try {
			con = new Conexion();
			Connection reg = con.getConnection();
			PreparedStatement rs = (PreparedStatement) reg.prepareStatement(sql);
			ResultSet ps = rs.executeQuery();
			while (ps.next()) {
				Persona mo = new Persona();

				mo.setPer_id(ps.getInt("per_id"));
				mo.setPer_cedula(ps.getString("per_cedula"));
				mo.setPer_nombre(ps.getString("per_nombre"));
				mo.setPer_apellido(ps.getString("per_apellido"));
				mo.setPer_edad(ps.getInt("per_edad"));
				mo.setPer_direccion(ps.getString("per_direccion"));
				mo.setPer_telefono(ps.getString("per_telefono"));
				listar.add(mo);

			}

		} catch (Exception e) {
		} finally {
			con.desconectar();
		}

		return listar;

	}
	
<<<<<<< HEAD

=======
>>>>>>> 4f88877956603242683642401d3d87670124c4f9

	public List<Persona> buscarPersona(Persona persona) {

		Conexion con = null;
		List<Persona> listar = new ArrayList<>();
		String cedula=persona.getPer_cedula();

		String sql = "select per_cedula, per_nombre, per_apellido, per_edad "
				+ " from persona"
				+ " Where per_cedula like '"+cedula+"'";

		try {
			con = new Conexion();
			Connection reg = con.getConnection();
			PreparedStatement rs = (PreparedStatement) reg.prepareStatement(sql);
			ResultSet ps = rs.executeQuery();
			while (ps.next()) {
				Persona mo = new Persona();
				System.out.println(ps.getString(2)+ps.getInt(4));
				mo.setPer_nombre(ps.getString(2));
				mo.setPer_apellido(ps.getString(3));
				mo.setPer_edad(ps.getInt(4));
				
				listar.add(mo);

			}

		} catch (Exception e) {
		} finally {
			con.desconectar();
		}

		return listar;

<<<<<<< HEAD
	}
=======
		}

	
>>>>>>> 4f88877956603242683642401d3d87670124c4f9
	public void insertarPaciente(Paciente paciente) {

		Conexion con = null;

		String INSERT_TBL_PERSONA = "INSERT INTO paciente ( pac_per_id, pac_fecha_registro)"
				+ "VALUES (?,?);";

		try {

			con = new Conexion();
			Connection reg = con.getConnection();

			PreparedStatement insert_persona = (PreparedStatement) reg.prepareStatement(INSERT_TBL_PERSONA);

		
			insert_persona.setInt(1, paciente.getPac_per_id());
			insert_persona.setString(2, paciente.getPac_fecha_registro());
			
			insert_persona.execute();

		} catch (Exception e) {
<<<<<<< HEAD
=======

			e.printStackTrace();
>>>>>>> 4f88877956603242683642401d3d87670124c4f9
		} finally {
			con.desconectar();
		}

<<<<<<< HEAD
	}
	}
	
	

=======
		}
	
	
}
>>>>>>> 4f88877956603242683642401d3d87670124c4f9
