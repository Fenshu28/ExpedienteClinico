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
import service.*;

public class PacienteController {
    IPacienteService servicio = new PacienteServiceImpl();
    
    public void agregarRegistro(Paciente paciente){
        servicio.agregarRegistro(paciente);
    }
    public void eliminarRegistro(String id){
        servicio.eliminarRegistro(id);
    }
    public void actualizarRegistro(Paciente paciente){
        servicio.actualizarRegistro(paciente);
    }
    public void mostrarRegistros(DefaultTableModel modeloTabla){
        servicio.mostrarRegistros(modeloTabla);
    }
    public Paciente recuperarRegistro(String id){
        return servicio.recuperarRegistro(id);
    }
}
