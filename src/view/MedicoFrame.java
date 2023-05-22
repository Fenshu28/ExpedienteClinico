/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/05/2023                     *
 * Fecha de actualización: 21/05/2023                *
 * Descripción: Vista para el registro del medico
 **************************************************** */

package view;

import controller.Registros;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import model.Medico;

public class MedicoFrame extends PlantillaRegistroFrame implements Registros {
    public MedicoFrame() {
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
                new MedicoFrame().setVisible(true);
            }
        });
    }
    
    // Establece los textos en labels que son propios del Frame
    private void setPropios(){        
        this.lbTitulo.setText("Medicos");
        this.lbId.setText("RFC");
        this.tblRegistros.getColumnModel().getColumn(0).setHeaderValue("RFC");
        this.tblRegistros.getTableHeader().repaint();
    }
    
    public void MostrarTabla() {
        modelo.setRowCount(0);
        for (String nssItem : medicos.keySet()) {
            Object fila[] = new Object[3];

            fila[0] = medicos.get(nssItem).getRFC();
            fila[1] = medicos.get(nssItem).getNombreCompleto();
            fila[2] = medicos.get(nssItem).getGenero();
            modelo.addRow(fila);

        }
    }
    
    public void guardarDatos(){
        if(!medicos.containsKey(txtId.getText())){
            try {
                Medico medico = crearMedico();

                medicos.put(idAct,medico);
                MostrarTabla();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este medico ya existe", "Error de inserción", 
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void recuperarDatos(){
        if(medicos.containsKey(idAct)){
            Medico medico = medicos.get(idAct);
            txtId.setText(idAct);
            txtNombre.setText(medico.getNombreCompleto());
            txtDireccion.setText(medico.getDireccion());
            txtTelefono.setText(medico.getNumeroTelefono());
            txtFecha.setText(medico.getFechaNacimiento());
            
            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este medico no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void elimimnarDatos(){
        if(medicos.containsKey(idAct)){
            Medico medico = medicos.remove(idAct);
            
            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este medico no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void actualizarDatos(){
        if(medicos.containsKey(idAct)){
            Medico medico = medicos.replace(idAct,crearMedico());
            
            MostrarTabla();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Este medico no existe", "Error de búsqueda", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    Medico crearMedico(){
        Medico medico;
        idAct =txtId.getText();
        medico = new Medico(idAct, txtNombre.getText(),
                txtFecha.getText(),
                cmbGenero.getItemAt(cmbGenero.getSelectedIndex()),
                txtDireccion.getText(), txtTelefono.getText());
        return medico;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
