/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/03/2023                     *
 * Fecha de actualización: 22/03/2023                *
 * Descripción: Plantilla para frame de registro del
 * paciente y médico.
 **************************************************** */
package view;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public abstract class PlantillaRegistroFrame extends JDialog{
    private int posX, posY;
    
    protected DefaultTableModel modelo;
    protected String idAct;

    public PlantillaRegistroFrame(Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        modelo = (DefaultTableModel) tblRegistros.getModel();
        setNuevo();
        cmbEspecialidad.setVisible(false);
        lbEspecialidad.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topBar = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btnNuevo = new com.formdev.flatlaf.extras.components.FlatButton();
        pnlMain = new javax.swing.JPanel();
        lbId = new javax.swing.JLabel();
        txtId = new javax.swing.JFormattedTextField();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        lbGenero = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        txtFecha = new org.jdesktop.swingx.JXDatePicker();
        lbEspecialidad = new com.formdev.flatlaf.extras.components.FlatLabel();
        cmbEspecialidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        topBar.setBackground(new java.awt.Color(59, 194, 222));
        topBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topBarMouseDragged(evt);
            }
        });
        topBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topBarMousePressed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Titulo");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topBar);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setForeground(new java.awt.Color(102, 102, 102));

        lbId.setForeground(new java.awt.Color(102, 102, 102));
        lbId.setLabelFor(txtNombre);
        lbId.setText("ID");

        txtId.setText("nsvdnsvd");

        lbNombre.setForeground(new java.awt.Color(102, 102, 102));
        lbNombre.setLabelFor(txtNombre);
        lbNombre.setText("Nombre completo");

        txtNombre.setText("tyhgjvbj");

        lbDireccion.setForeground(new java.awt.Color(102, 102, 102));
        lbDireccion.setLabelFor(txtNombre);
        lbDireccion.setText("Direccion");

        txtDireccion.setText("rextcfyvgbjh");

        lbFecha.setForeground(new java.awt.Color(102, 102, 102));
        lbFecha.setLabelFor(txtNombre);
        lbFecha.setText("Fecha de nacimiento");

        lbGenero.setForeground(new java.awt.Color(102, 102, 102));
        lbGenero.setLabelFor(txtNombre);
        lbGenero.setText("Genero");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        lbTelefono.setForeground(new java.awt.Color(102, 102, 102));
        lbTelefono.setLabelFor(txtNombre);
        lbTelefono.setText("Teléfono");

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setText("9849949489");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(0).setResizable(false);
        }

        lbEspecialidad.setText("Especialidad");

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pediatría", "Cardiología", "Dermatología", "Oftalmología", "Ginecología", "Neurología", "Urología", "Endocrinología", "Psiquiatría", "Oncología", "Traumatología", "Otorrinolaringología", "Neumología", "Gastroenterología" }));

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMainLayout.createSequentialGroup()
                                        .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(lbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlMainLayout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                                        .addComponent(lbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbId)
                    .addComponent(lbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombre)
                    .addComponent(lbGenero))
                .addGap(3, 3, 3)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lbDireccion)
                .addGap(3, 3, 3)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(lbTelefono))
                .addGap(3, 3, 3)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        getContentPane().add(pnlMain);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void topBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_topBarMousePressed

    private void topBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_topBarMouseDragged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarDatos();
        setNuevo();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
        idAct = modelo.getValueAt(
                tblRegistros.getSelectedRow(),0).toString();
        recuperarDatos();
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tblRegistrosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarDatos();
        setNuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(JOptionPane.showConfirmDialog (this, 
                "¿Estas seguro de eliminar este registro?", 
                "Elmimnando...", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE) == 0){
            elimimnarDatos();
            setNuevo();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        for (Window window : PrincipalFrame.getWindows()) {
            System.out.println(window.getName());
        }
    }//GEN-LAST:event_formWindowClosed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        setNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed
    
    private void setNuevo(){
        limpiarFrame();
        idAct = "";
        txtId.requestFocus();
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    public abstract void mostrarTabla() ;
    
    public abstract void guardarDatos();
    
    public abstract void recuperarDatos();
    
    public abstract void elimimnarDatos();
    
    public abstract void actualizarDatos();
    
    public abstract void llenarCampos();
    
    private void limpiarFrame(){
        Component[] components = pnlMain.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                // Realiza la acción deseada con el JTextField encontrado
                textField.setText("");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnActualizar;
    protected javax.swing.JButton btnEliminar;
    protected javax.swing.JButton btnGuardar;
    private com.formdev.flatlaf.extras.components.FlatButton btnNuevo;
    protected javax.swing.JComboBox<String> cmbEspecialidad;
    protected javax.swing.JComboBox<String> cmbGenero;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JLabel lbDireccion;
    protected com.formdev.flatlaf.extras.components.FlatLabel lbEspecialidad;
    protected javax.swing.JLabel lbFecha;
    protected javax.swing.JLabel lbGenero;
    protected javax.swing.JLabel lbId;
    protected javax.swing.JLabel lbNombre;
    protected javax.swing.JLabel lbTelefono;
    protected javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnlMain;
    protected javax.swing.JTable tblRegistros;
    private javax.swing.JPanel topBar;
    protected javax.swing.JTextField txtDireccion;
    protected org.jdesktop.swingx.JXDatePicker txtFecha;
    protected javax.swing.JFormattedTextField txtId;
    protected javax.swing.JTextField txtNombre;
    protected javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
