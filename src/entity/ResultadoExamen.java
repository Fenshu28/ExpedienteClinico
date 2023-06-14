/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 23 may 2023                     *
 * Fecha de actualización: 23 may 2023                *
 * Descripción: Clase para el resultado de cada examen.
 **************************************************** */

package entity;

import java.util.Date;

public class ResultadoExamen {
    private int idResultado;
    private Expediente expediente; 
    private String TipoExamen;
    private Date FechaExamen;
    private String Resultados;

    public ResultadoExamen() {
    }

    public ResultadoExamen(int idResultado, Expediente expediente, String TipoExamen, Date FechaExamen, String Resultados) {
        this.idResultado = idResultado;
        this.expediente = expediente;
        this.TipoExamen = TipoExamen;
        this.FechaExamen = FechaExamen;
        this.Resultados = Resultados;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public String getTipoExamen() {
        return TipoExamen;
    }

    public void setTipoExamen(String TipoExamen) {
        this.TipoExamen = TipoExamen;
    }

    public Date getFechaExamen() {
        return FechaExamen;
    }

    public void setFechaExamen(Date FechaExamen) {
        this.FechaExamen = FechaExamen;
    }

    public String getResultados() {
        return Resultados;
    }

    public void setResultados(String Resultados) {
        this.Resultados = Resultados;
    }
    
}
