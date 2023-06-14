/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 23 may 2023                     *
 * Fecha de actualización: 23 may 2023                *
 * Descripción: Clase para la consulta médica.
 **************************************************** */

package entity;

import java.util.Date;

public class ConsultaMedica {
    private int idConsulta;
    private Expediente expediente;
    private Medico medico;
    private Date FechaConsulta;
    private String sintomas;
    private String diagnostico; 
    private String tratamiento; 
    private String NotasAdicionales;

    public ConsultaMedica() {
    }

    public ConsultaMedica(int idConsulta, Expediente expediente, Medico medico, Date FechaConsulta, String sintomas, String diagnostico, String tratamiento, String NotasAdicionales) {
        this.idConsulta = idConsulta;
        this.expediente = expediente;
        this.medico = medico;
        this.FechaConsulta = FechaConsulta;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.NotasAdicionales = NotasAdicionales;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getFechaConsulta() {
        return FechaConsulta;
    }

    public void setFechaConsulta(Date FechaConsulta) {
        this.FechaConsulta = FechaConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getNotasAdicionales() {
        return NotasAdicionales;
    }

    public void setNotasAdicionales(String NotasAdicionales) {
        this.NotasAdicionales = NotasAdicionales;
    }
    
}
