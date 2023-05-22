/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/03/2023                     *
 * Fecha de actualización: 22/03/2023                *
 * Descripción: Vista principal para los expedientes
 **************************************************** */

package view;

import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrincipalFrame extends javax.swing.JFrame {
    private int posX, posY;
    
    public PrincipalFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlArr = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        pnlIzq = new javax.swing.JPanel();
        btnPaciente = new javax.swing.JButton();
        btnMedico = new javax.swing.JButton();
        btnExpediente = new javax.swing.JButton();
        pnlDer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1148, 548));
        setUndecorated(true);

        pnlArr.setBackground(new java.awt.Color(59, 194, 222));
        pnlArr.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlArrMouseDragged(evt);
            }
        });
        pnlArr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlArrMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para expedientes médicos");

        btnCerrar.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlArrLayout = new javax.swing.GroupLayout(pnlArr);
        pnlArr.setLayout(pnlArrLayout);
        pnlArrLayout.setHorizontalGroup(
            pnlArrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArrLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlArrLayout.setVerticalGroup(
            pnlArrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlArrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlIzq.setBackground(new java.awt.Color(204, 255, 255));
        pnlIzq.setLayout(new java.awt.GridLayout(6, 1));

        btnPaciente.setForeground(new java.awt.Color(51, 51, 51));
        btnPaciente.setText("Pacientes");
        btnPaciente.setBorderPainted(false);
        btnPaciente.setContentAreaFilled(false);
        btnPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPacienteMouseClicked(evt);
            }
        });
        pnlIzq.add(btnPaciente);

        btnMedico.setForeground(new java.awt.Color(51, 51, 51));
        btnMedico.setText("Medicos");
        btnMedico.setBorderPainted(false);
        btnMedico.setContentAreaFilled(false);
        btnMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedicoMouseClicked(evt);
            }
        });
        pnlIzq.add(btnMedico);

        btnExpediente.setForeground(new java.awt.Color(51, 51, 51));
        btnExpediente.setText("Expedientes");
        btnExpediente.setBorderPainted(false);
        btnExpediente.setContentAreaFilled(false);
        pnlIzq.add(btnExpediente);

        pnlDer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlDerLayout = new javax.swing.GroupLayout(pnlDer);
        pnlDer.setLayout(pnlDerLayout);
        pnlDerLayout.setHorizontalGroup(
            pnlDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        pnlDerLayout.setVerticalGroup(
            pnlDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlArr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlArr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIzq, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void pnlArrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlArrMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_pnlArrMousePressed

    private void pnlArrMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlArrMouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_pnlArrMouseDragged

    private void btnPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacienteMouseClicked
        PacienteFrame ventanaPaciente = new PacienteFrame();
        ventanaPaciente.setVisible(true);
    }//GEN-LAST:event_btnPacienteMouseClicked

    private void btnMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedicoMouseClicked
        MedicoFrame ventanaMedico = new MedicoFrame();
        ventanaMedico.setVisible(true);
        
    }//GEN-LAST:event_btnMedicoMouseClicked
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnExpediente;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlArr;
    private javax.swing.JPanel pnlDer;
    private javax.swing.JPanel pnlIzq;
    // End of variables declaration//GEN-END:variables
}
