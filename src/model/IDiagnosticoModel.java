/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                     *
 * Fecha de actualización: 26 jun 2023                *
 * Descripción: Interfaz de la clase 
 *****************************************************/

package model;

import entity.Diagnostico;
import java.util.List;


public interface IDiagnosticoModel {
    public void mostrarRegistros(List<Diagnostico> listaDiagnosticos); 
    public Diagnostico recuperarRegistro(List<Diagnostico> listaDiagnosticos, int id);
}
