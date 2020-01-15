package ec.edu.ups.modelo;

import java.util.Date;

public class Empleado {

	private int emp_id;
	private Date emp_fecha_ingreso;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public Date getEmp_fecha_ingreso() {
		return emp_fecha_ingreso;
	}

	public void setEmp_fecha_ingreso(Date emp_fecha_ingreso) {
		this.emp_fecha_ingreso = emp_fecha_ingreso;
	}
}
