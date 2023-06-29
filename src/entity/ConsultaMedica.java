/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia           *
 * Fecha de creación: 23 may 2023                     *
 * Fecha de actualización: 23 may 2023                *
 * Descripción: Clase para la consulta médica.
 **************************************************** */

package entity;

import java.util.Date;

public class ConsultaMedica extends Interaccion {
    private int idConsulta;
    private Medico medico;
    private String sintomas;
    private Diagnostico diagnostico; 
    private String NotasAdicionales;

    public ConsultaMedica() {
    }

    public ConsultaMedica(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public ConsultaMedica(int idConsulta, Medico medico,String sintomas, 
            Diagnostico diagnostico, String NotasAdicionales,
            Expediente expediente, Date fecha) {
        super(expediente, fecha);
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.NotasAdicionales = NotasAdicionales;
    }

    

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getNotasAdicionales() {
        return NotasAdicionales;
    }

    public void setNotasAdicionales(String NotasAdicionales) {
        this.NotasAdicionales = NotasAdicionales;
    }
}
