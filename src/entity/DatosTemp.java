/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 25 jun 2023                        *
 * Fecha de actualización: 25 jun 2023                   *
 * Descripción: Clase para guardar datos temporales.
 **************************************************** */
package entity;

import java.util.ArrayList;
import java.util.List;

public class DatosTemp {

    private static DatosTemp este;
    private List<Medico> listaMedicos;
    private List<Paciente> listaPacientes;
    private Medico medicoActual;

    public DatosTemp() {
        this.este =  this;
        este.listaMedicos = new ArrayList<>();
        este.listaPacientes = new ArrayList<>();
        este.medicoActual = new Medico();
    }

    public static List<Medico> getListaMedicos() {
        return este.listaMedicos;
    }

    public static void setListaMedicos(List<Medico> listaMedicos) {
        este.listaMedicos = listaMedicos;
    }

    public static List<Paciente> getListaPacientes() {
        return este.listaPacientes;
    }

    public static void setListaPacientes(List<Paciente> listaPacientes) {
        este.listaPacientes = listaPacientes;
    }

    public static Medico getMedicoActual() {
        return este.medicoActual;
    }

    public static void setMedicoActual(Medico medicoActual) {
        este.medicoActual = medicoActual;
    }

}
