package modelo;

public class Medicamento {

	private int mdmt_id;
	private int mdmt_dosis;
	private String mdmt_estado;
	private String mdmt_nombre;
	public int getMdmt_id() {
		return mdmt_id;
	}
	public void setMdmt_id(int mdmt_id) {
		this.mdmt_id = mdmt_id;
	}
	public int getMdmt_dosis() {
		return mdmt_dosis;
	}
	public void setMdmt_dosis(int mdmt_dosis) {
		this.mdmt_dosis = mdmt_dosis;
	}
	public String getMdmt_estado() {
		return mdmt_estado;
	}
	public void setMdmt_estado(String mdmt_estado) {
		this.mdmt_estado = mdmt_estado;
	}
	public String getMdmt_nombre() {
		return mdmt_nombre;
	}
	public void setMdmt_nombre(String mdmt_nombre) {
		this.mdmt_nombre = mdmt_nombre;
	}
}
