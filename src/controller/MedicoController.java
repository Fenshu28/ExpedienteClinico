/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 29 may 2023                     *
 * Fecha de actualización: 29 may 2023                *
 * Descripción: Clase para controlar el Medico.
 **************************************************** */

package controller;

import entity.Medico;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IMedicoModel;
import model.MedicoModelImpl;

public class MedicoController {
    IMedicoModel modelo = new MedicoModelImpl();
    
    public void agregarRegistro(Medico medico){
        modelo.agregarRegistro(medico);
    }
    public void eliminarRegistro(String id){
        modelo.eliminarRegistro(id);
    }
    public void actualizarRegistro(Medico medico){
        modelo.actualizarRegistro(medico);
    }
    public void mostrarRegistros(List<Medico> listaMedicos){
        modelo.mostrarRegistros(listaMedicos);
    }
    public Medico recuperarRegistro(List<Medico> listaMedicos,String id){
        return modelo.recuperarRegistro(listaMedicos,id);
    }
}
