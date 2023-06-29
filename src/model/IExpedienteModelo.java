/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                     *
 * Fecha de actualización: 26 jun 2023                *
 * Descripción: Interfaz de la clase 
 *****************************************************/

package model;

import entity.Expediente;
import java.util.List;


public interface IExpedienteModelo {
    void agregarRegistro(Expediente expediente);
    void actualizarRegistro(Expediente expediente);
    void mostrarRegistros(List<Expediente> listaExpedientes);
    Expediente recuperarRegistro(List<Expediente> listaExpedientes,int id);
}
