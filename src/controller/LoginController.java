/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                        *
 * Fecha de actualización: 9 jun 2023                   *
 * Descripción: Clase para el controlador del Login
 *****************************************************/

package controller;

import model.ILoginModel;
import model.LoginModelImpl;


public class LoginController {
    ILoginModel modelo= new LoginModelImpl();
    
    public boolean iniciarSesion(String usuario, String contraseña) {
        return modelo.iniciarSesion(usuario, contraseña);
    }
}
