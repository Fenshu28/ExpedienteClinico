/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 29 may 2023                     *
 * Fecha de actualización: 29 may 2023                *
 * Descripción: Clase para el controlador del módulo
 * Paciente.
 **************************************************** */

package controller;

import entity.Paciente;
import javax.swing.table.DefaultTableModel;
import model.IPacienteModel;
import model.PacienteModelImpl;

public class PacienteController {
    IPacienteModel modelo = new PacienteModelImpl();
    
    public void agregarRegistro(Paciente paciente){
        modelo.agregarRegistro(paciente);
    }
    public void eliminarRegistro(String id){
        modelo.eliminarRegistro(id);
    }
    public void actualizarRegistro(Paciente paciente){
        modelo.actualizarRegistro(paciente);
    }
    public void mostrarRegistros(DefaultTableModel modeloTabla){
        modelo.mostrarRegistros(modeloTabla);
    }
    public Paciente recuperarRegistro(String id){
        return modelo.recuperarRegistro(id);
    }
}
