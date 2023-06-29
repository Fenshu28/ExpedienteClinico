/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 8 jun 2023                        *
 * Fecha de actualización: 8 jun 2023                   *
 * Descripción: Clase para el expediente médico.
 *****************************************************/

package entity;

import java.util.Date;

public class Expediente {
    private int idExpediente;
    private Paciente paciente;
    private Date fechaCreacion;
    private Date fechaActualizacion;

    public Expediente(int idExpediente, Paciente paciente, Date fechaCreacion, 
            Date fechaActualizacion) {
        this.idExpediente = idExpediente;
        this.paciente = paciente;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Expediente() {
    }
    
    public int getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    
    
}
