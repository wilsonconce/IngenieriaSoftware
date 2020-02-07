package ec.edu.ups.modelo;

import java.util.Date;

public class OrdenMedica {

	private int om_id;
	private String medicamento;
	private String om_diagnostico;
	private String om_fecha_inicio;
	private String om_fecha_fin;
	
	public OrdenMedica(int om_id, String medicamento, String om_diagnostico, String om_fecha_inicio, String om_fecha_fin) {
		super();
		this.om_id = om_id;
		this.medicamento = medicamento;
		this.om_diagnostico = om_diagnostico;
		this.om_fecha_inicio = om_fecha_inicio;
		this.om_fecha_fin = om_fecha_fin;
	}
	public int getOm_id() {
		return om_id;
	}
	public void setOm_id(int om_id) {
		this.om_id = om_id;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public String getOm_diagnostico() {
		return om_diagnostico;
	}
	public void setOm_diagnostico(String om_diagnostico) {
		this.om_diagnostico = om_diagnostico;
	}
	public String getOm_fecha_inicio() {
		return om_fecha_inicio;
	}
	public void setOm_fecha_inicio(String om_fecha_inicio) {
		this.om_fecha_inicio = om_fecha_inicio;
	}
	public String getOm_fecha_fin() {
		return om_fecha_fin;
	}
	public void setOm_fecha_fin(String om_fecha_fin) {
		this.om_fecha_fin = om_fecha_fin;
	}

	
	
}
