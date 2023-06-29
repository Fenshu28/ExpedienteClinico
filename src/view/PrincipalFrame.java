/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/03/2023                     *
 * Fecha de actualización: 22/03/2023                *
 * Descripción: Vista principal para los expedientes
 **************************************************** */

package view;

import controller.MedicoController;
import entity.DatosTemp;
import entity.Medico;
import java.util.ArrayList;
import java.util.List;

public class PrincipalFrame extends javax.swing.JFrame {
    private MedicoFrame ventanaMedico= new MedicoFrame(this,true);
    private PacienteFrame ventanaPaciente= new PacienteFrame(this,true);
    private ConsultaMedicaPanel pnlCosultaMedica= new ConsultaMedicaPanel(PrincipalFrame.this);
    private HistorialPanel pnlHistorialPanel = new HistorialPanel();
    
    
    
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
        getContentPane().setLayout(new org.jdesktop.swingx.HorizontalLayout());

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
        btnExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExpedienteMouseClicked(evt);
            }
        });
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

        getContentPane().add(pnlIzq);

        pnlDer.setBackground(new java.awt.Color(255, 255, 255));
        pnlDer.setLayout(new java.awt.CardLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(800, 800));
        pnlDer.add(jLabel2, "card2");

        getContentPane().add(pnlDer);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacienteMouseClicked
        ventanaPaciente.setVisible(true);
    }//GEN-LAST:event_btnPacienteMouseClicked

    private void btnMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedicoMouseClicked
        ventanaMedico.setVisible(true);
    }//GEN-LAST:event_btnMedicoMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        if(!ventanaMedico.getFocusableWindowState() && 
                ventanaPaciente.getFocusableWindowState())
            this.setEnabled(true);
    }//GEN-LAST:event_formFocusGained

    private void btnConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaMouseClicked
        pnlCosultaMedica.cargar();
        pnlCosultaMedica.setBounds(0, 0, pnlDer.getWidth(),
                pnlDer.getHeight()); 
        pnlDer.removeAll();
        pnlDer.add(pnlCosultaMedica);
        pnlDer.revalidate();
        pnlDer.repaint();
    }//GEN-LAST:event_btnConsultaMouseClicked

    private void btnExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpedienteMouseClicked
        pnlHistorialPanel.setBounds(0, 0, pnlDer.getWidth(),
                pnlDer.getHeight()); 
        pnlDer.removeAll();
        pnlDer.add(pnlHistorialPanel);
        pnlDer.revalidate();
        pnlDer.repaint();
    }//GEN-LAST:event_btnExpedienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExpediente;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlDer;
    private javax.swing.JPanel pnlIzq;
    // End of variables declaration//GEN-END:variables
}
