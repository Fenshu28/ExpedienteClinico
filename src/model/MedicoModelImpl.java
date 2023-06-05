/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Clase para implementar la interfaz del
 * módulo Médico en Service.
 **************************************************** */

package model;

import entity.Medico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoModelImpl implements IMedicoModel{

    @Override
    public void agregarRegistro(Medico medico) {
        if(!medicos.containsKey(medico.getRFC())){
            try {               
                medicos.put(medico.getRFC(),medico);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Este medico ya existe", "Error de inserción", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void eliminarRegistro(String id) {
        if(medicos.containsKey(id)){
            medicos.remove(id);            
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Este medico no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void actualizarRegistro(Medico medico) {        
        if(medicos.containsKey(medico.getRFC())){
            medicos.replace(medico.getRFC(),medico);
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Este medico no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        if(!medicos.isEmpty()){
            modeloTabla.setRowCount(0);
            for (String nssItem : medicos.keySet()) {
                Object fila[] = new Object[3];

                fila[0] = medicos.get(nssItem).getRFC();
                fila[1] = medicos.get(nssItem).getNombreCompleto();
                fila[2] = medicos.get(nssItem).getGenero();
                modeloTabla.addRow(fila);

            }
        }
    }

    @Override
    public Medico recuperarRegistro(String id) {
        if(medicos.containsKey(id)){
            return medicos.get(id);
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
}
