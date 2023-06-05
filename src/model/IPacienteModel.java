/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Interfaz para el módulo Paciente en Model.
 **************************************************** */
package model;

import entity.Paciente;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public interface IPacienteModel {
    HashMap<String,Paciente> pacientes = new HashMap<>();
    
    void agregarRegistro(Paciente paciente);
    void eliminarRegistro(String id);
    void actualizarRegistro(Paciente paciente);
    void mostrarRegistros(DefaultTableModel modeloTabla);
    Paciente recuperarRegistro(String id);
}
