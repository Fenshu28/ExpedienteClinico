/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/05/2023                     *
 * Fecha de actualización: 21/05/2023                *
 * Descripción: Vista para el registro del paciente.
 **************************************************** */
package view;

import javax.swing.JOptionPane;
import entity.Paciente;
import controller.*;
import java.awt.Frame;

public class PacienteFrame extends PlantillaRegistroFrame implements Registros {
    PacienteController controlador = new PacienteController();
    
    public PacienteFrame(Frame owner, String title, boolean modal) {
        super(owner, title, modal);        
//        setPropios();
    }
    
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
    
    /**
     * Define propedades que los formularios tienen propiamente y los sustituye
     * por los predefinidos.
     */
    private void setPropios(){
        this.lbTitulo.setText("Paciente");
        this.lbId.setText("NSS");
        this.tblRegistros.getColumnModel().getColumn(0).setHeaderValue("RFC");
        this.tblRegistros.getTableHeader().repaint();
    }
    
    /**
     * Actualiza la tabla
     */
    @Override
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
    
    /**
     * Inserta un paciente en el hashmap.
     */
    @Override
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
    
    /**
     * Recupera un paciente y rellena los campos en el form
     */
    @Override
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
    
    /**
     * Elimina un paciente del hashmap.
     */
    @Override
    public void elimimnarDatos(){
        if(pacientes.containsKey(idAct)){
            pacientes.remove(idAct);
            
            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * Actualiza un paciente en el hashmap.
     */
    @Override
    public void actualizarDatos(){
        if(pacientes.containsKey(idAct)){
            pacientes.replace(idAct,crearPaciente());
            
            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este paciente no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * Crea la instancia de un paciente inicializandolo con la información
     * de los campos
     * @return 
     * El paciente ya instanciado para ser insertado o actuializado en el hashmap
     */
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
