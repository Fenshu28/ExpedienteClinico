/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 8 jun 2023                        *
 * Fecha de actualización: 8 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package entity;

public class Usuario {
    private String nombre;
    private String Usuario;
    private String Contraseña;

    public Usuario(String Usuario, String Contraseña,String nombre) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.nombre = nombre;
    }
    
    public Usuario(String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
