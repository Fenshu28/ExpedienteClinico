/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                     *
 * Fecha de actualización: 9 jun 2023                *
 * Descripción: Panel para elegir un diagnostico.
 *****************************************************/

package view;

import entity.Diagnostico;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class DiagnosticosDialog extends javax.swing.JDialog {
    ConsultaMedicaPanel consulta;
    public DiagnosticosDialog(ConsultaMedicaPanel consulta,java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.consulta = consulta;
        poblarCombo();
    }

    private void poblarCombo(){
        AutoCompleteDecorator.decorate(cmbDiagnosticos);
        for (Diagnostico exp : consulta.getListDiagnosticos()) {
            cmbDiagnosticos.addItem(exp.getDescripcion());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new com.formdev.flatlaf.extras.components.FlatButton();
        cmbDiagnosticos = new javax.swing.JComboBox<>();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diagnosticos");

        btnGuardar.setText("Aceptar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbDiagnosticos.setEditable(true);

        jXLabel1.setText("Selecciona un diagnostico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbDiagnosticos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDiagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        consulta.getConsulta().setDiagnostico(
                consulta.getListDiagnosticos().get(
                        cmbDiagnosticos.getSelectedIndex()));
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.formdev.flatlaf.extras.components.FlatButton btnGuardar;
    private javax.swing.JComboBox<String> cmbDiagnosticos;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    // End of variables declaration//GEN-END:variables
}
