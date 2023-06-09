/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia           *
 * Fecha de creación: 17 may 2023                     *
 * Fecha de actualización: 17 may 2023                *
 * Descripción: Clase con los atributos de una persona
 **************************************************** */

package entity;

import java.util.Date;

public class Persona {
    String nombreCompleto;
    Date fechaNacimiento;
    String genero;
    String direccion;
    String numeroTelefono;
       
    public Persona(){
        
    }
    
    public Persona(String nombreCompleto, Date fechaNacimiento, String genero, 
            String direccion, String numeroTelefono) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
