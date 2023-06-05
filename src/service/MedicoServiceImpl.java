/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 29 may 2023                     *
 * Fecha de actualización: 29 may 2023                *
 * Descripción: Clase para 
 **************************************************** */

package service;

import entity.Medico;
import javax.swing.table.DefaultTableModel;
import model.*;

public class MedicoServiceImpl implements IMedicoService {
    IMedicoModel modelo = new MedicoModelImpl();

    @Override
    public void agregarRegistro(Medico medico) {
        modelo.agregarRegistro(medico);
    }

    @Override
    public void eliminarRegistro(String id) {
        modelo.eliminarRegistro(id);
    }

    @Override
    public void actualizarRegistro(Medico medico) {
        modelo.actualizarRegistro(medico);
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        modelo.mostrarRegistros(modeloTabla);
    }

    @Override
    public Medico recuperarRegistro(String id) {
        return modelo.recuperarRegistro(id);
    }
}
