/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                        *
 * Fecha de actualización: 9 jun 2023                   *
 * Descripción: Clase para los Farmacos recetados.
 *****************************************************/

package entity;

public class Tratamiento {
    private int idConsulta;
    private int idFarmaco;
    private String dosis; 
    private String frecuencia; 
    private String duracion;

    public Tratamiento() {
    }

    public Tratamiento(int idConsulta, int idFarmaco) {
        this.idConsulta = idConsulta;
        this.idFarmaco = idFarmaco;
    }  
    
    public Tratamiento(int idConsulta, int idFarmaco, String dosis, String frecuencia, String duracion) {
        this.idConsulta = idConsulta;
        this.idFarmaco = idFarmaco;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdFarmaco() {
        return idFarmaco;
    }

    public void setIdFarmaco(int idFarmaco) {
        this.idFarmaco = idFarmaco;
    }
    
    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
    
}
