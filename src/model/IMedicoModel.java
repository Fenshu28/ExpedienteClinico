/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Interfaz para el módulo Médico en Model.
 **************************************************** */

package model;

import entity.Medico;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public interface IMedicoModel {
    HashMap<String,Medico> medicos = new HashMap<>();    
    
    void agregarRegistro(Medico medico);
    void eliminarRegistro(String id);
    void actualizarRegistro(Medico medico);
    void mostrarRegistros(DefaultTableModel modeloTabla);
    Medico recuperarRegistro(String id);
}
