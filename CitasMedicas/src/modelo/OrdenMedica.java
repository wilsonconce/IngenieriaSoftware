package modelo;

import java.util.Date;

public class OrdenMedica {

	private int om_id;
	private String om_diagnostico;
	private Date om_fecha_inicio;
	private Date om_fecha_fin;
	public int getOm_id() {
		return om_id;
	}
	public void setOm_id(int om_id) {
		this.om_id = om_id;
	}
	public String getOm_diagnostico() {
		return om_diagnostico;
	}
	public void setOm_diagnostico(String om_diagnostico) {
		this.om_diagnostico = om_diagnostico;
	}
	public Date getOm_fecha_inicio() {
		return om_fecha_inicio;
	}
	public void setOm_fecha_inicio(Date om_fecha_inicio) {
		this.om_fecha_inicio = om_fecha_inicio;
	}
	public Date getOm_fecha_fin() {
		return om_fecha_fin;
	}
	public void setOm_fecha_fin(Date om_fecha_fin) {
		this.om_fecha_fin = om_fecha_fin;
	}
}
