/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 29 may 2023                     *
 * Fecha de actualización: 29 may 2023                *
 * Descripción: Clase para controlar el Medico.
 **************************************************** */

package controller;

import entity.Medico;
import javax.swing.table.DefaultTableModel;
import service.IMedicoService;
import service.MedicoServiceImpl;


public class MedicoController {
    IMedicoService servicio = new MedicoServiceImpl();
    
    public void agregarRegistro(Medico medico){
        servicio.agregarRegistro(medico);
    }
    public void eliminarRegistro(String id){
        servicio.eliminarRegistro(id);
    }
    public void actualizarRegistro(Medico medico){
        servicio.actualizarRegistro(medico);
    }
    public void mostrarRegistros(DefaultTableModel modeloTabla){
        servicio.mostrarRegistros(modeloTabla);
    }
    public Medico recuperarRegistro(String id){
        return servicio.recuperarRegistro(id);
    }
}
