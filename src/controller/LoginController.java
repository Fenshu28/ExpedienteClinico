/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                        *
 * Fecha de actualización: 9 jun 2023                   *
 * Descripción: Clase para el controlador del Login
 *****************************************************/

package controller;

import entity.DatosConfig;
import javax.swing.JOptionPane;
import model.ILoginModel;
import model.LoginModelImpl;


public class LoginController {
    ILoginModel modelo= new LoginModelImpl();
    
    public boolean iniciarSesion(String usuario, String contraseña) {
       
        if(DatosConfig.getIntentos()>0){
            return modelo.iniciarSesion(usuario, contraseña);
        }else{
            JOptionPane.showMessageDialog(null,
                        "Se excedió el número de intentos. {@hola}", 
                        "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }        
    }
}
