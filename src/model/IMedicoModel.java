/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Interfaz para el módulo Médico en Model.
 **************************************************** */

package model;

import entity.Medico;
import java.util.List;

public interface IMedicoModel {   
    void agregarRegistro(Medico medico);
    void eliminarRegistro(String id);
    void actualizarRegistro(Medico medico);
    void mostrarRegistros(List<Medico> listaMedicos);
    Medico recuperarRegistro(List<Medico> listaMedicos,String id);
}
