/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 19 jun 2023                        *
 * Fecha de actualización: 19 jun 2023                   *
 * Descripción: Clase para almacenar los datos de inicio de sesión.
 *****************************************************/

package entity;

public class DatosConfig {
    private String usuario;
    private String contraseña;
    private int intentos = 3;
    private static DatosConfig este;

    public DatosConfig() {
        este = this;
    }    
    
    public DatosConfig(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        este = this;
    }

    public static void setUsuario(String usuario) {
        este.usuario = usuario;
    }

    public static void setContraseña(String contraseña) {
        este.contraseña = contraseña;
    }
    
    public static String getUsuario() {
        return este.usuario;
    }

    public static String getContraseña() {
        return este.contraseña;
    }
    
    public static void setIntentos(int intento){
        este.intentos -= intento;
    }
    
    public static int getIntentos(){
        return este.intentos;
    }
    
    public static void resetIntentos(){
        este.intentos = 3;
    }
}
