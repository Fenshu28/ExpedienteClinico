/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package controller;

import entity.Expediente;
import java.util.List;
import model.ExpedienteModelImpl;
import model.IExpedienteModelo;

public class ExpedienteController {
    IExpedienteModelo modelo = new ExpedienteModelImpl();
    
    public void agregarRegistro(Expediente expediente){
        modelo.agregarRegistro(expediente);
    }
    public void actualizarRegistro(Expediente expediente){
        modelo.actualizarRegistro(expediente);
    }
    public void mostrarRegistros(List<Expediente> listaExpedientes){
        modelo.mostrarRegistros(listaExpedientes);
    }
    public Expediente recuperarRegistro(List<Expediente> listaExpedientes,int id){
        return modelo.recuperarRegistro(listaExpedientes, id);
    }
}
