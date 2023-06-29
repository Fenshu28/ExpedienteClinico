/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                     *
 * Fecha de actualización: 9 jun 2023                *
 * Descripción: Frame para el módulo consultas médicas.
 *****************************************************/

package view;

import controller.*;
import entity.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import util.Util;

public final class ConsultaMedicaPanel extends javax.swing.JPanel { 
    private int indexFarmaco;
    private java.awt.Frame framePadre;
    private ConsultaMedica consulta = new ConsultaMedica();
    
    private final DefaultTableModel modeloTabla;
    
    private final List<Expediente> listaExpedientes = new ArrayList<>();
    private final List<Farmaco> listaFarmacos= new ArrayList<>();
    private final List<Tratamiento> listaTratamientos = new ArrayList<>();
    private final List<Diagnostico> listDiagnosticos = new ArrayList<>();
    
    private final ExpedienteController expedienteController = new ExpedienteController();
    private final FarmacoController farmacoController = new FarmacoController();
    private final DiagnosticoController diagnosticoController = new DiagnosticoController();
    private final ConsultaMedicaController consultaController = new ConsultaMedicaController();
    
    public ConsultaMedicaPanel(java.awt.Frame framePadre) {
        initComponents();              
        this.framePadre = framePadre;
        cargar();
        nuevo();
        txtMedico.setText(DatosTemp.getMedicoActual().getNombreCompleto());
        modeloTabla = (DefaultTableModel) tblFarmaco.getModel();
    }

    public ConsultaMedica getConsulta() {
        return consulta;
    }

    public List<Farmaco> getListaFarmacos() {
        return listaFarmacos;
    }

    public List<Diagnostico> getListDiagnosticos() {
        return listDiagnosticos;
    }

    public List<Tratamiento> getListaTratamientos() {
        return listaTratamientos;
    }  

    public void setIndexFarmaco(int indexFarmaco) {
        this.indexFarmaco = indexFarmaco;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        dtpFecha = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        cmbExpediente = new com.formdev.flatlaf.extras.components.FlatComboBox();
        jLabel3 = new javax.swing.JLabel();
        topBar = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        txtMedico = new com.formdev.flatlaf.extras.components.FlatTextField();
        flatLabel1 = new com.formdev.flatlaf.extras.components.FlatLabel();
        flatLabel2 = new com.formdev.flatlaf.extras.components.FlatLabel();
        flatLabel3 = new com.formdev.flatlaf.extras.components.FlatLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFarmaco = new com.formdev.flatlaf.extras.components.FlatTable();
        flatLabel4 = new com.formdev.flatlaf.extras.components.FlatLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNotas = new com.formdev.flatlaf.extras.components.FlatTextArea();
        btnAñadirFarmaco = new com.formdev.flatlaf.extras.components.FlatButton();
        btnAñadirDiagnostico = new com.formdev.flatlaf.extras.components.FlatButton();
        btnGuardar = new com.formdev.flatlaf.extras.components.FlatButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtSintomas = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();

        setAutoscrolls(true);

        jXLabel1.setText("Fecha");

        dtpFecha.setDate(new Date());

        jLabel2.setText("Expediente:");

        cmbExpediente.setEditable(true);

        jLabel3.setText("Nombre del medico:");

        topBar.setBackground(new java.awt.Color(59, 194, 222));

        lbTitulo.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Cosulta médica");

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMedico.setEditable(false);
        txtMedico.setText("D");
        txtMedico.setName(""); // NOI18N

        flatLabel1.setText("Sintomas:");

        flatLabel2.setText("Diagnostico:");

        flatLabel3.setText("Tratamiento:");

        tblFarmaco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicamento", "Dosis", "Frecuencia", "Duración"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFarmaco.setShowHorizontalLines(true);
        tblFarmaco.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tblFarmaco);

        flatLabel4.setText("Notas:");

        txtNotas.setColumns(20);
        txtNotas.setRows(5);
        txtNotas.setName("opcional"); // NOI18N
        jScrollPane3.setViewportView(txtNotas);

        btnAñadirFarmaco.setText("+");
        btnAñadirFarmaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirFarmacoActionPerformed(evt);
            }
        });

        btnAñadirDiagnostico.setText("+");
        btnAñadirDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirDiagnosticoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtSintomas.setColumns(20);
        txtSintomas.setRows(5);
        jScrollPane5.setViewportView(txtSintomas);

        txtDiagnostico.setEditable(false);
        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane6.setViewportView(txtDiagnostico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(flatLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(flatLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAñadirFarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flatLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(cmbExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(flatLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dtpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnAñadirDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flatLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flatLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadirDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flatLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadirFarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(flatLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirDiagnosticoActionPerformed
        DiagnosticosDialog dlgDiagnostico = new DiagnosticosDialog(
                ConsultaMedicaPanel.this,framePadre, true);
        dlgDiagnostico.setVisible(true);
        txtDiagnostico.setText(consulta.getDiagnostico().getDescripcion());
    }//GEN-LAST:event_btnAñadirDiagnosticoActionPerformed

    private void btnAñadirFarmacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirFarmacoActionPerformed
        FarmacoDialog dlgFarmaco =  new FarmacoDialog(
                ConsultaMedicaPanel.this, framePadre, true);
        dlgFarmaco.setVisible(true);
        modeloTabla.addRow(new String[4]);
        tblFarmaco.setValueAt(
                listaFarmacos.get(indexFarmaco).getMarcaRegistrada(),
                modeloTabla.getRowCount()-1, 
                0);
    }//GEN-LAST:event_btnAñadirFarmacoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(util.Util.validCamposLlenos(this) && 
                modeloTabla.getRowCount()>0){
            
            prepararDatos();
            consultaController.agregarRegistro(consulta,
                    listaTratamientos);
            nuevo();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Completa todos los campos.", 
                    "Error al guardar", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    /**
     * Completas los atributos ed la clase consulta antes de insertar en la base
     * de datos.
     */
    public void prepararDatos(){
        consulta.setMedico(DatosTemp.getMedicoActual());
        consulta.setExpediente(listaExpedientes.get(
                cmbExpediente.getSelectedIndex()));
        consulta.setSintomas(txtSintomas.getText());
        consulta.setNotasAdicionales(txtNotas.getText());
        consulta.setFecha(dtpFecha.getDate());
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            listaTratamientos.get(i).setDosis(
                    modeloTabla.getValueAt(i, 1).toString()
            );
            listaTratamientos.get(i).setFrecuencia(
                    modeloTabla.getValueAt(i, 2).toString()
            );
            listaTratamientos.get(i).setDuracion(
                    modeloTabla.getValueAt(i, 3).toString()
            );
        }
    }
       
    /**
     * Llena los combo box necesarios con la información de las listas.
     */
    private void poblarDatos(){
        AutoCompleteDecorator.decorate(cmbExpediente);
        for (Expediente exp : listaExpedientes) {
            cmbExpediente.addItem(exp.getPaciente().getNombreCompleto());
        }
    }
    
    /**
     * Llena las listas con la información de la base de datos, instanciandola
     * en objetos ya definidos por clases. Se crea las listas para 
     * {@link Expediente}, {@link Farmaco}, {@link Diagnostico}.
     */
    public void cargar(){
        expedienteController.mostrarRegistros(listaExpedientes);
        farmacoController.mostrarRegistros(listaFarmacos);
        diagnosticoController.mostrarRegistros(listDiagnosticos);
        
        poblarDatos();        
    }
    
    /**
     * Reinicia los componentes y objetos para poder crear una nueva consulta
     * medica.
     */
    private void nuevo(){
        consulta = new ConsultaMedica(consultaController.newKey());
        Util.limpiarFrame(this);
        cmbExpediente.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.formdev.flatlaf.extras.components.FlatButton btnAñadirDiagnostico;
    private com.formdev.flatlaf.extras.components.FlatButton btnAñadirFarmaco;
    private com.formdev.flatlaf.extras.components.FlatButton btnGuardar;
    private com.formdev.flatlaf.extras.components.FlatComboBox cmbExpediente;
    private org.jdesktop.swingx.JXDatePicker dtpFecha;
    private com.formdev.flatlaf.extras.components.FlatLabel flatLabel1;
    private com.formdev.flatlaf.extras.components.FlatLabel flatLabel2;
    private com.formdev.flatlaf.extras.components.FlatLabel flatLabel3;
    private com.formdev.flatlaf.extras.components.FlatLabel flatLabel4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    protected javax.swing.JLabel lbTitulo;
    private com.formdev.flatlaf.extras.components.FlatTable tblFarmaco;
    private javax.swing.JPanel topBar;
    private javax.swing.JTextArea txtDiagnostico;
    private com.formdev.flatlaf.extras.components.FlatTextField txtMedico;
    private com.formdev.flatlaf.extras.components.FlatTextArea txtNotas;
    private javax.swing.JTextArea txtSintomas;
    // End of variables declaration//GEN-END:variables

}
