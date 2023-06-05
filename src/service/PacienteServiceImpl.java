/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Clase para implementar la interfaz del
 * módulo Paciente en Service.
 **************************************************** */

package service;

import entity.Paciente;
import javax.swing.table.DefaultTableModel;
import model.*;

public class PacienteServiceImpl implements IPacienteService{
    IPacienteModel modelo = new PacienteModelImpl();

    @Override
    public void agregarRegistro(Paciente paciente) {
        modelo.agregarRegistro(paciente);
    }

    @Override
    public void eliminarRegistro(String id) {
        modelo.eliminarRegistro(id);
    }

    @Override
    public void actualizarRegistro(Paciente paciente) {
        modelo.actualizarRegistro(paciente);    
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        modelo.mostrarRegistros(modeloTabla);
    }

    @Override
    public Paciente recuperarRegistro(String id) {
        return modelo.recuperarRegistro(id);
    }
    
}
