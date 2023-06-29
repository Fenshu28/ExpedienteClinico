/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package controller;

import entity.Farmaco;
import java.util.List;
import model.FarmacoModelImpl;
import model.IFarmacoModel;


public class FarmacoController {
    IFarmacoModel modelo = new FarmacoModelImpl();
    
    public void mostrarRegistros(List<Farmaco> listaFarmacos){
        modelo.mostrarRegistros(listaFarmacos);
    }
    public Farmaco recuperarRegistro(List<Farmaco> listaFarmacos,int id){
        return modelo.recuperarRegistro(listaFarmacos,id);
    }
}
