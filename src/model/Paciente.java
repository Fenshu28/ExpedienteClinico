/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/03/2023                     *
 * Fecha de actualización: 22/03/2023                *
 * Descripción: Clase para el paciente		 
 *****************************************************/
package model;

public class Paciente extends Persona {
    public Paciente(String nombreCompleto, String fechaNacimiento, String genero, String direccion, String numeroTelefono) {
        super(nombreCompleto,fechaNacimiento,  genero,  direccion,  numeroTelefono);
    }
}
