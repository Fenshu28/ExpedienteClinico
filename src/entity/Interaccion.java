/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 24 jun 2023                        *
 * Fecha de actualización: 24 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package entity;

import java.util.Date;


public class Interaccion {
    private Expediente expediente;
    private Date fecha;

    public Interaccion() {
    }

    public Interaccion(Expediente expediente, Date fecha) {
        this.expediente = expediente;
        this.fecha = fecha;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
