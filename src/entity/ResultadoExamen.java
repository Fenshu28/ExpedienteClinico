/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 23 may 2023                     *
 * Fecha de actualización: 23 may 2023                *
 * Descripción: Clase para el resultado de cada examen.
 **************************************************** */

package entity;

import java.util.Date;

public class ResultadoExamen extends Interaccion {
    private int idResultado;
    private String TipoExamen;
    private String Resultados;

    public ResultadoExamen() {
        super();
    }

    public ResultadoExamen(int idResultado, String TipoExamen, String Resultados, Expediente expediente, Date fecha) {
        super(expediente, fecha);
        this.idResultado = idResultado;
        this.TipoExamen = TipoExamen;
        this.Resultados = Resultados;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public String getTipoExamen() {
        return TipoExamen;
    }

    public void setTipoExamen(String TipoExamen) {
        this.TipoExamen = TipoExamen;
    }

    public String getResultados() {
        return Resultados;
    }

    public void setResultados(String Resultados) {
        this.Resultados = Resultados;
    }
    
}
