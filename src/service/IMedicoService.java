/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 29 may 2023                     *
 * Fecha de actualización: 29 may 2023                *
 * Descripción: Interfaz para el módulo Paciente en Service.
 **************************************************** */

package service;

import entity.Medico;
import javax.swing.table.DefaultTableModel;


public interface IMedicoService {
    void agregarRegistro(Medico medico);
    void eliminarRegistro(String id);
    void actualizarRegistro(Medico medico);
    void mostrarRegistros(DefaultTableModel modeloTabla);
    Medico recuperarRegistro(String id);
}
