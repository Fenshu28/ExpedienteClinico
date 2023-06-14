/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 8 jun 2023                     *
 * Fecha de actualización: 8 jun 2023                *
 * Descripción: Interfaz del modulo Login.
 *****************************************************/

package model;

public interface ILoginModel {
    public boolean iniciarSesion(String usuario, String contraseña);
}
