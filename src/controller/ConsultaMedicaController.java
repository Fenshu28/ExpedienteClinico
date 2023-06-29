/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 24 jun 2023                        *
 * Fecha de actualización: 24 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package controller;

import entity.ConsultaMedica;
import entity.Tratamiento;
import java.util.List;
import model.ConsultaMedicaModelImpl;
import model.IConsultaMedicaModel;


public class ConsultaMedicaController {
    IConsultaMedicaModel modelo = new ConsultaMedicaModelImpl();
    TratamientoController tratamientoController = new TratamientoController();
    
    public void agregarRegistro(ConsultaMedica consultaMedica,
            List<Tratamiento> tratamiento){
        modelo.agregarRegistro(consultaMedica);
        tratamientoController.agregarRegistro(tratamiento);
    }
    
    public ConsultaMedica recuperarRegistro(int id){
        return modelo.recuperarRegistro(id);
    }
    
    public int newKey(){
        return modelo.newKey();
    }
    
}
