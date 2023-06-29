/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 25 jun 2023                     *
 * Fecha de actualización: 25 jun 2023                *
 * Descripción: Interfaz de la clase 
 *****************************************************/

package model;

import entity.ConsultaMedica;


public interface IConsultaMedicaModel {
    public void agregarRegistro(ConsultaMedica consultaMedica);
    public ConsultaMedica recuperarRegistro(int idConsulta);
    public int newKey();
}
