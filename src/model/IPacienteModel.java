/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Interfaz para el módulo Paciente en Model.
 **************************************************** */
package model;

import entity.Paciente;
import java.util.List;

public interface IPacienteModel {    
    public void agregarRegistro(Paciente paciente);
    public void eliminarRegistro(String id);
    public void actualizarRegistro(Paciente paciente);
    public void mostrarRegistros(List<Paciente> listaPacientes);
    public Paciente recuperarRegistro(List<Paciente> listaPacientes,String id);
}
