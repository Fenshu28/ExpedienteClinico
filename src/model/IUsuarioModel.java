/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                     *
 * Fecha de actualización: 9 jun 2023                *
 * Descripción: Interfaz del módulo de usuarios.
 *****************************************************/

package model;

import entity.Usuario;
import javax.swing.table.DefaultTableModel;


public interface IUsuarioModel {
    void agregarRegistro(Usuario usuario);
    void eliminarRegistro(int id);
    void actualizarRegistro(Usuario usuario);
    void mostrarRegistros(DefaultTableModel modeloTabla);
    Usuario recuperarRegistro(int id);
}
