/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Clase para implementar la interfaz
 * del módulo Paciente en Model.
 **************************************************** */

package model;

import entity.Paciente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PacienteModelImpl implements IPacienteModel{

    @Override
    public void agregarRegistro(Paciente paciente) {
        if(!pacientes.containsKey(paciente.getNss())){
            try {
//                Paciente paciente = crearPaciente();
//                idAct = txtId.getText();
                
                pacientes.put(paciente.getNss(),paciente);
//                MostrarTabla();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Este paciente ya existe", "Error de inserción", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void eliminarRegistro(String id) {
        if(pacientes.containsKey(id)){
            pacientes.remove(id);            
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void actualizarRegistro(Paciente paciente) {
        if(pacientes.containsKey(paciente.getNss())){
            pacientes.replace(paciente.getNss(),paciente);
            
//            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        for (String nssItem : pacientes.keySet()) {
            Object fila[] = new Object[3];

            fila[0] = pacientes.get(nssItem).getNss();
            fila[1] = pacientes.get(nssItem).getNombreCompleto();
            fila[2] = pacientes.get(nssItem).getGenero();
            modeloTabla.addRow(fila);

        }
    }

    @Override
    public Paciente recuperarRegistro(String id) {
        if(pacientes.containsKey(id)){
            return pacientes.get(id);
//            txtId.setText(idAct);
//            txtNombre.setText(paciente.getNombreCompleto());
//            txtDireccion.setText(paciente.getDireccion());
//            txtTelefono.setText(paciente.getNumeroTelefono());
//            txtFecha.setText(paciente.getFechaNacimiento());
            
//            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
        return null;        
    }
    
}
