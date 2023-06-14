/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 12 jun 2023                        *
 * Fecha de actualización: 12 jun 2023                   *
 * Descripción: Clase para el controlador de los usuarios.
 *****************************************************/

package controller;

import entity.Usuario;
import javax.swing.table.DefaultTableModel;
import model.IUsuarioModel;
import model.UsuarioModelImpl;


public class UsuarioController {    
    IUsuarioModel modelo = new UsuarioModelImpl();
    
    public void agregarRegistro(Usuario medico) {
        modelo.agregarRegistro(medico);
    }

    public void eliminarRegistro(int id) {
        modelo.eliminarRegistro(id);
    }
  
    public void actualizarRegistro(Usuario medico) {
        modelo.actualizarRegistro(medico);
    }

    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        modelo.mostrarRegistros(modeloTabla);
    }

    public Usuario recuperarRegistro(int id) {
        return modelo.recuperarRegistro(id);
    }
}
