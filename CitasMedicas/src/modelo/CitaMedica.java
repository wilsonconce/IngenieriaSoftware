package modelo;

import java.util.Date;

public class CitaMedica {

	private int cm_id;
	private Date cm_hora_inicio;
	private int cm_duracion;
	private Date cm_hora_fin;
	public int getCm_id() {
		return cm_id;
	}
	public void setCm_id(int cm_id) {
		this.cm_id = cm_id;
	}
	public Date getCm_hora_inicio() {
		return cm_hora_inicio;
	}
	public void setCm_hora_inicio(Date cm_hora_inicio) {
		this.cm_hora_inicio = cm_hora_inicio;
	}
	public int getCm_duracion() {
		return cm_duracion;
	}
	public void setCm_duracion(int cm_duracion) {
		this.cm_duracion = cm_duracion;
	}
	public Date getCm_hora_fin() {
		return cm_hora_fin;
	}
	public void setCm_hora_fin(Date cm_hora_fin) {
		this.cm_hora_fin = cm_hora_fin;
	}
}
