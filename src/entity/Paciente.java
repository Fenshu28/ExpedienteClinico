/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/03/2023                     *
 * Fecha de actualización: 22/03/2023                *
 * Descripción: Clase para el paciente.
 *****************************************************/
package entity;

import java.util.Date;

public class Paciente extends Persona {
    private String nss;    
    
    public Paciente(String nss, String nombreCompleto, Date fechaNacimiento, 
            String genero, String direccion, String numeroTelefono) {
        super(nombreCompleto, fechaNacimiento, genero, direccion, numeroTelefono);
        this.nss = nss;
    }   
    
    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }
}
