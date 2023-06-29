/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 25 jun 2023                        *
 * Fecha de actualización: 25 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package entity;

import java.util.List;


public class DatosTemp {
    private static DatosTemp este;
    private List<Medico> listaMedicos;
    private List<Paciente> listaPacientes;

    public DatosTemp() {
        este = this;
    }

    public DatosTemp(List<Medico> listaMedicos, List<Paciente> listaPacientes) {
        este.listaMedicos = listaMedicos;
        este.listaPacientes = listaPacientes;
    }

    public List<Medico> getListaMedicos() {
        return este.listaMedicos;
    }

    public void setListaMedicos(List<Medico> listaMedicos) {
        este.listaMedicos = listaMedicos;
    }

    public List<Paciente> getListaPacientes() {
        return este.listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        este.listaPacientes = listaPacientes;
    }
    
    
    
}
