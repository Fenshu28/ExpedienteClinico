/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 29 may 2023                     *
 * Fecha de actualización: 29 may 2023                *
 * Descripción: Clase para el controlador del módulo
 * Paciente.
 **************************************************** */

package controller;

import entity.Paciente;
import java.util.List;
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
    public void mostrarRegistros(List<Paciente> listaPaciente){
        modelo.mostrarRegistros(listaPaciente);
    }
    public Paciente recuperarRegistro(List<Paciente> listaPaciente,String id){
        return modelo.recuperarRegistro(listaPaciente,id);
    }
}
