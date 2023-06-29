/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                    *
 * Fecha de actualización: 26 jun 2023               *
 * Descripción: Clase para 
 *****************************************************/

package controller;

import entity.Tratamiento;
import java.util.List;
import model.ITratamientoModel;
import model.TratamientoModelImpl;


public class TratamientoController {
    ITratamientoModel modelo = new TratamientoModelImpl();
    
    public void agregarRegistro(List<Tratamiento> tratamiento){
        modelo.agregarRegistro(tratamiento);
    }
    
    public Tratamiento recuperarRegistro(List<Tratamiento> tratamiento,int idConsulta,int idFarmaco){
        return modelo.recuperarRegistro(tratamiento,idConsulta, idFarmaco);
    }
}
