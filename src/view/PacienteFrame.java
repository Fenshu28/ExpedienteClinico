/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/03/2023                     *
 * Fecha de actualización: 22/03/2023                *
 * Descripción: Vista para el registro del paciente			 
 *****************************************************/
package view;

public class PacienteFrame extends javax.swing.JFrame {
  public PacienteFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topBar = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtFecha2 = new javax.swing.JFormattedTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topBar.setBackground(new java.awt.Color(59, 194, 222));

        btnCerrar.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addGap(0, 304, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(topBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setForeground(new java.awt.Color(102, 102, 102));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setLabelFor(txtNombre);
        jLabel1.setText("Nombre completo");
        pnlMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 200, -1));
        pnlMain.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 195, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setLabelFor(txtNombre);
        jLabel2.setText("Direccion");
        pnlMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, 320, -1));
        pnlMain.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 79, 319, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setLabelFor(txtNombre);
        jLabel3.setText("Fecha de nacimiento");
        pnlMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 160, -1));

        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        pnlMain.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 129, 150, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setLabelFor(txtNombre);
        jLabel4.setText("Genero");
        pnlMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 6, 90, -1));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        pnlMain.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 27, -1, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setLabelFor(txtNombre);
        jLabel5.setText("Teléfono");
        pnlMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 100, -1));

        txtFecha2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        pnlMain.add(txtFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 100, -1));

        btnGuardar.setText("Guardar");
        pnlMain.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 340, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel topBar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JFormattedTextField txtFecha2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
