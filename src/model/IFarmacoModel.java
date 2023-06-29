/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                     *
 * Fecha de actualización: 26 jun 2023                *
 * Descripción: Interfaz de la clase 
 *****************************************************/

package model;

import entity.Farmaco;
import java.util.List;


public interface IFarmacoModel {
    public void mostrarRegistros(List<Farmaco> listaFarmacos);
    public Farmaco recuperarRegistro(List<Farmaco> listaFarmacos, int id);
}
