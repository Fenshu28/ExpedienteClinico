/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/05/2023                     *
 * Fecha de actualización: 21/05/2023                *
 * Descripción: Vista para el registro del paciente
 **************************************************** */
package view;

import java.util.HashMap;
import javax.swing.JOptionPane;
import model.Paciente;
import controller.Registros;

public class PacienteFrame extends PlantillaRegistroFrame implements Registros {
    public PacienteFrame() {
        initComponents();
        setPropios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteFrame().setVisible(true);
            }
        });
    }
    
    private void setPropios(){
        this.lbTitulo.setText("Paciente");
        this.lbId.setText("NSS");
    }
    
    public void MostrarTabla() {
        modelo.setRowCount(0);
        for (String nssItem : pacientes.keySet()) {
            Object fila[] = new Object[3];

            fila[0] = pacientes.get(nssItem).getNss();
            fila[1] = pacientes.get(nssItem).getNombreCompleto();
            fila[2] = pacientes.get(nssItem).getGenero();
            modelo.addRow(fila);

        }
    }
    
    public void guardarDatos(){
        if(!pacientes.containsKey(txtId.getText())){
            try {
                Paciente paciente = crearPaciente();
                idAct = txtId.getText();
                
                pacientes.put(idAct,paciente);
                MostrarTabla();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este paciente ya existe", "Error de inserción", 
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void recuperarDatos(){
        if(pacientes.containsKey(idAct)){
            Paciente paciente = pacientes.get(idAct);
            txtId.setText(idAct);
            txtNombre.setText(paciente.getNombreCompleto());
            txtDireccion.setText(paciente.getDireccion());
            txtTelefono.setText(paciente.getNumeroTelefono());
            txtFecha.setText(paciente.getFechaNacimiento());
            
            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void elimimnarDatos(){
        if(pacientes.containsKey(idAct)){
            Paciente paciente = pacientes.remove(idAct);
            
            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void actualizarDatos(){
        if(pacientes.containsKey(idAct)){
            Paciente paciente = pacientes.replace(idAct,crearPaciente());
            
            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    Paciente crearPaciente(){
        Paciente paciente;
        idAct =txtId.getText();
        paciente = new Paciente(idAct, txtNombre.getText(),
                txtFecha.getText(),
                cmbGenero.getItemAt(cmbGenero.getSelectedIndex()),
                txtDireccion.getText(), txtTelefono.getText());
        return paciente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
