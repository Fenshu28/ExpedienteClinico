/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 20 may 2023                     *
 * Fecha de actualización: 21 may 2023                *
 * Descripción: Clase Clase para el medico
 **************************************************** */

package model;


public class Medico extends Persona{
    private String RFC;

    public Medico() {
    }

    public Medico(String RFC, String nombreCompleto, String fechaNacimiento, String genero, String direccion, String numeroTelefono) {
        super(nombreCompleto, fechaNacimiento, genero, direccion, numeroTelefono);
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }  
}
