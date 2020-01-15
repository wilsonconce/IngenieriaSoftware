package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Persona;

public class ControladorPaciente {

	private Persona persona;

	public ControladorPaciente(Persona persona) {
		this.persona = persona;
	}

}
