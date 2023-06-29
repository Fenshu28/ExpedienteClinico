/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 20 may 2023                     *
 * Fecha de actualización: 21 may 2023                *
 * Descripción: Clase Clase para el medico
 **************************************************** */

package entity;

import java.util.Date;


public class Medico extends Persona{
    private String RFC;
    private String especialidad;

    public Medico() {
    }

    public Medico(String RFC, String nombreCompleto, Date fechaNacimiento, 
            String genero, String direccion, String numeroTelefono,String especialidad) {
        super(nombreCompleto, fechaNacimiento, genero, direccion, numeroTelefono);
        this.RFC = RFC;
        this.especialidad = especialidad;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }  

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
