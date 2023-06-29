/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                    *
 * Fecha de actualización: 26 jun 2023               *
 * Descripción: Clase para el farmaco.
 *****************************************************/

package entity;


public class Farmaco {
    private int id;
    private String prinicipioAct;
    private String marcaRegistrada;
    private String forma;
    private String presentacion;

    public Farmaco() {
    }

    public Farmaco(int id, String prinicipioAct, String marcaRegistrada, String forma, String presentacion) {
        this.id = id;
        this.prinicipioAct = prinicipioAct;
        this.marcaRegistrada = marcaRegistrada;
        this.forma = forma;
        this.presentacion = presentacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrinicipioAct() {
        return prinicipioAct;
    }

    public void setPrinicipioAct(String prinicipioAct) {
        this.prinicipioAct = prinicipioAct;
    }

    public String getMarcaRegistrada() {
        return marcaRegistrada;
    }

    public void setMarcaRegistrada(String marcaRegistrada) {
        this.marcaRegistrada = marcaRegistrada;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    
    
}
