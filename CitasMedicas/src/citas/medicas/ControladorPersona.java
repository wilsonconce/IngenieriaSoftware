package citas.medicas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import modelo.Persona;

public class ControladorPersona {
	

	public void insertarPersona(Persona persona) {
    Conexion cnx = new Conexion();
	    
	    Statement s;
	    ResultSet rs = null;
	
		  String INSERT_TBL_PERSONA = "INSERT INTO PERSONA"
	                + "	(PER_CEDULA, PER_NOMBRE, PER_APELLIDO, PER_EDAD, "
	                + "PER_DIRECCIION, PER_TELEFONO) "
	                + "VALUES"
	                + "	(?, ?, ?, ?, ?, ?);";

	        try {
	      
	            PreparedStatement insert_persona = cnx.conexion().prepareStatement(INSERT_TBL_PERSONA);
	         
	            insert_persona.setString(1, persona.getPer_cedula());
	            insert_persona.setString(2, persona.getPer_nombre());
	            insert_persona.setString(3, persona.getPer_apellido());
	            insert_persona.setInt(4, persona.getPer_edad());
	            insert_persona.setString(5, persona.getPer_direccion());
	            insert_persona.setString(6, persona.getPer_telefono());
	            insert_persona.execute();

	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
	        }
	}
	}

