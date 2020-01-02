/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

import java.util.Date;

/**
 *
 * @author wilso
 */
public class RegistroCitas {
    
    private int idRegistro_Citas;
    private Date fecha_Emision;

    public int getIdRegistro_Citas() {
        return idRegistro_Citas;
    }

    public void setIdRegistro_Citas(int idRegistro_Citas) {
        this.idRegistro_Citas = idRegistro_Citas;
    }

    public Date getFecha_Emision() {
        return fecha_Emision;
    }

    public void setFecha_Emision(Date fecha_Emision) {
        this.fecha_Emision = fecha_Emision;
    }
    
}
