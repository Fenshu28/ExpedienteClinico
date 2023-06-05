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

public class PacienteFrame extends PlantillaRegistroFrame implements Registros {
    PacienteController controlador = new PacienteController();    
    
    public PacienteFrame() {
        super();
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
        
    }
    
    /**
     * Inserta un paciente en el hashmap.
     */
    @Override
    public void guardarDatos(){
        
        
    }
    
    /**
     * Recupera un paciente y rellena los campos en el form
     */
    @Override
    public void recuperarDatos(){
        
    }
    
    /**
     * Elimina un paciente del hashmap.
     */
    @Override
    public void elimimnarDatos(){
        
    }
    
    /**
     * Actualiza un paciente en el hashmap.
     */
    @Override
    public void actualizarDatos(){
        
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
