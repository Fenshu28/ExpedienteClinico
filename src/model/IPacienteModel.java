/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Interfaz para el módulo Paciente en Model.
 **************************************************** */
package model;

import entity.Paciente;
import javax.swing.table.DefaultTableModel;

public interface IPacienteModel {    
    void agregarRegistro(Paciente paciente);
    void eliminarRegistro(String id);
    void actualizarRegistro(Paciente paciente);
    void mostrarRegistros(DefaultTableModel modeloTabla);
    Paciente recuperarRegistro(String id);
}
