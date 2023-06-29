/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 8 jun 2023                        *
 * Fecha de actualización: 8 jun 2023                   *
 * Descripción: Clase para implementación de la interfaz
 * del Login en Model.
 *****************************************************/

package model;

import conexion.Conexion;

public class LoginModelImpl implements ILoginModel {      
    @Override
    public boolean iniciarSesion(String usuario, String contraseña) {
        boolean isCon;
        Conexion con = new Conexion(usuario,contraseña);
        isCon =  con.getEstado();
        con.disponse();
        return isCon;
    }

}
