/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                     *
 * Fecha de actualización: 26 jun 2023                *
 * Descripción: Interfaz de la clase Tratamiento
 *****************************************************/

package model;

import entity.Tratamiento;
import java.util.List;


public interface ITratamientoModel {
    public void agregarRegistro(List<Tratamiento> tratamiento);
    public void mostrarRegistros(List<Tratamiento> tratamiento);
    public Tratamiento recuperarRegistro(List<Tratamiento> tratamiento,int idConsultal, int idFarmaco);
}
