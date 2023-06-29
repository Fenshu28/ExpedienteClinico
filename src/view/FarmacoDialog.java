/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                     *
 * Fecha de actualización: 9 jun 2023                *
 * Descripción: Panel para elegir un diagnostico.
 *****************************************************/

package view;

import entity.Farmaco;
import entity.Tratamiento;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class FarmacoDialog extends javax.swing.JDialog {
    private ConsultaMedicaPanel consulta;
    private Farmaco farmaco;
    int index;
    
    public FarmacoDialog(ConsultaMedicaPanel consulta,java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.consulta = consulta;
        poblarCombo();
    }

    private void poblarCombo(){
        for (Farmaco exp : consulta.getListaFarmacos()) {
            cmbFarmaco.addItem(exp.getMarcaRegistrada() + " " 
                    + exp.getPresentacion());
        }
        AutoCompleteDecorator.decorate(cmbFarmaco);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new com.formdev.flatlaf.extras.components.FlatButton();
        cmbFarmaco = new javax.swing.JComboBox<>();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Farmacos");

        btnGuardar.setText("Aceptar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbFarmaco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFarmacoItemStateChanged(evt);
            }
        });
        cmbFarmaco.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cmbFarmacoInputMethodTextChanged(evt);
            }
        });
        cmbFarmaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFarmacoActionPerformed(evt);
            }
        });

        jXLabel1.setText("Selecciona un farmaco");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información sobre el farmaco"));

        txtInformacion.setColumns(20);
        txtInformacion.setRows(5);
        txtInformacion.setEnabled(false);
        jScrollPane1.setViewportView(txtInformacion);

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
                    .addComponent(cmbFarmaco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        consulta.getListaTratamientos().add(new Tratamiento(
                consulta.getConsulta().getIdConsulta(), 
                farmaco.getId())); // Agregar tratamiento a la consulta
        consulta.setIndexFarmaco(index);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbFarmacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFarmacoActionPerformed
        
    }//GEN-LAST:event_cmbFarmacoActionPerformed

    private void cmbFarmacoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFarmacoItemStateChanged
        index = cmbFarmaco.getSelectedIndex();
        farmaco =  consulta.getListaFarmacos().get(
                index);
        
        txtInformacion.setText(
                "Principio activo: " + farmaco.getPrinicipioAct() + "\n" +
                "Marca comercial: " + farmaco.getMarcaRegistrada() + "\n" +
                "Presentación: "+farmaco.getPresentacion() + "\n" +
                "Forma: "+farmaco.getForma());
    }//GEN-LAST:event_cmbFarmacoItemStateChanged

    private void cmbFarmacoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cmbFarmacoInputMethodTextChanged
        
    }//GEN-LAST:event_cmbFarmacoInputMethodTextChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.formdev.flatlaf.extras.components.FlatButton btnGuardar;
    private javax.swing.JComboBox<String> cmbFarmaco;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private javax.swing.JTextArea txtInformacion;
    // End of variables declaration//GEN-END:variables
}
