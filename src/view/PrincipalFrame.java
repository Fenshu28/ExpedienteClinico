/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/03/2023                     *
 * Fecha de actualización: 22/03/2023                *
 * Descripción: Vista principal para los expedientes
 **************************************************** */

package view;

import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme;

public class PrincipalFrame extends javax.swing.JFrame {
    MedicoFrame ventanaMedico= new MedicoFrame();
    PacienteFrame ventanaPaciente= new PacienteFrame();
    ConsultaMedicaPanel pnlCosultaMedica= new ConsultaMedicaPanel();
    
    public PrincipalFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIzq = new javax.swing.JPanel();
        btnPaciente = new javax.swing.JButton();
        btnMedico = new javax.swing.JButton();
        btnExpediente = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        pnlDer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Triqueta");
        setMinimumSize(new java.awt.Dimension(1060, 620));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        pnlIzq.setBackground(new java.awt.Color(59, 194, 222));
        pnlIzq.setPreferredSize(new java.awt.Dimension(200, 150));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(2);
        pnlIzq.setLayout(verticalLayout1);

        btnPaciente.setForeground(new java.awt.Color(51, 51, 51));
        btnPaciente.setText("Pacientes");
        btnPaciente.setBorderPainted(false);
        btnPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPacienteMouseClicked(evt);
            }
        });
        pnlIzq.add(btnPaciente);

        btnMedico.setForeground(new java.awt.Color(51, 51, 51));
        btnMedico.setText("Medicos");
        btnMedico.setBorderPainted(false);
        btnMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedicoMouseClicked(evt);
            }
        });
        pnlIzq.add(btnMedico);

        btnExpediente.setForeground(new java.awt.Color(51, 51, 51));
        btnExpediente.setText("Expedientes");
        btnExpediente.setBorderPainted(false);
        pnlIzq.add(btnExpediente);

        btnConsulta.setForeground(new java.awt.Color(51, 51, 51));
        btnConsulta.setText("Consulta medica");
        btnConsulta.setBorderPainted(false);
        btnConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaMouseClicked(evt);
            }
        });
        pnlIzq.add(btnConsulta);

        btnUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        pnlIzq.add(btnUsuarios);

        pnlDer.setBackground(new java.awt.Color(255, 255, 255));
        pnlDer.setLayout(new javax.swing.BoxLayout(pnlDer, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(800, 800));
        pnlDer.add(jLabel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDer, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlIzq, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addComponent(pnlDer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacienteMouseClicked
        ventanaPaciente.setVisible(true);
//        this.setEnabled(false);
    }//GEN-LAST:event_btnPacienteMouseClicked

    private void btnMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedicoMouseClicked
        ventanaMedico.setVisible(true);
//        this.setEnabled(false);
    }//GEN-LAST:event_btnMedicoMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        if(!ventanaMedico.getFocusableWindowState() && 
                ventanaPaciente.getFocusableWindowState())
            this.setEnabled(true);
    }//GEN-LAST:event_formFocusGained

    private void btnConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaMouseClicked
        pnlCosultaMedica.setBounds(0, 0, pnlDer.getWidth(),
                pnlDer.getHeight()); 
        pnlDer.removeAll();
        pnlDer.add(pnlCosultaMedica);
        pnlDer.revalidate();
        pnlDer.repaint();
    }//GEN-LAST:event_btnConsultaMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        UsuariosDialog usuariosDialog = new UsuariosDialog(this, true);
        usuariosDialog.setVisible(true);
    }//GEN-LAST:event_btnUsuariosMouseClicked
       
    public static void main(String args[]) {
        try {
//            UIManager.setLookAndFeel(new FlatMacLightLaf());
            FlatGrayIJTheme.setup();
            LoginFrame.setDefaultLookAndFeelDecorated( true );
            FlatAnimatedLafChange.showSnapshot();
        } catch (Exception ex) {
            System.err.println("Fallo al inicializar el tema.");
        }
//        FlatAnimatedLafChange.showSnapshot();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExpediente;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlDer;
    private javax.swing.JPanel pnlIzq;
    // End of variables declaration//GEN-END:variables
}
