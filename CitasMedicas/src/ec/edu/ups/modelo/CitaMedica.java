package ec.edu.ups.modelo;

import java.util.Date;

public class CitaMedica {


	private int cm_id;
	private String cm_hora_inicio;
	private int cm_duracion;
	private String cm_hora_fin;
	private String paciente;
	private String cliente;
	
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getCm_id() {
		return cm_id;
	}
	public void setCm_id(int cm_id) {
		this.cm_id = cm_id;
	}
	public String getCm_hora_inicio() {
		return cm_hora_inicio;
	}
	public void setCm_hora_inicio(String cm_hora_inicio) {
		this.cm_hora_inicio = cm_hora_inicio;
	}
	public int getCm_duracion() {
		return cm_duracion;
	}
	public void setCm_duracion(int cm_duracion) {
		this.cm_duracion = cm_duracion;
	}
	public String getCm_hora_fin() {
		return cm_hora_fin;
	}
	public void setCm_hora_fin(String cm_hora_fin) {
		this.cm_hora_fin = cm_hora_fin;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	
	
	
}
