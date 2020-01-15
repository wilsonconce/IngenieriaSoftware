package modelo;

import java.util.Date;

public class Certificado {

	private int cert_id;
	private Date cert_fecha_emision;

	public int getCert_id() {
		return cert_id;
	}

	public void setCert_id(int cert_id) {
		this.cert_id = cert_id;
	}

	public Date getCert_fecha_emision() {
		return cert_fecha_emision;
	}

	public void setCert_fecha_emision(Date cert_fecha_emision) {
		this.cert_fecha_emision = cert_fecha_emision;
	}

}
