/* Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 08/06/2023                     *
 * Fecha de actualización: 08/06/2023                *
 * Descripción: Vista para el loggeo del personal al
    sistema.
 **************************************************** */

package view;


import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme;
import controller.LoginController;
import entity.DatosConfig;
import java.awt.event.KeyEvent;

public class LoginFrame extends javax.swing.JFrame {
    private LoginController controlador = new LoginController();
    private DatosConfig config;
    
    public LoginFrame() {
        initComponents();
        config = new DatosConfig();
        
        txtContraseña.putClientProperty("JPasswordField.showRevealButton", 
                true);
        txtContraseña.putClientProperty("JPasswordField.showCapsLock",
                true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        hplRecuperarCont = new org.jdesktop.swingx.JXHyperlink();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(59, 194, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo150x150.png"))); // NOI18N
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        imgFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoLogin.jpeg"))); // NOI18N
        imgFondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(imgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 297, 198));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(242, 242, 242));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("AdminH");
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 153)));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");

        txtContraseña.setBackground(new java.awt.Color(242, 242, 242));
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setText("Ari1505*");
        txtContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 153)));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });

        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        hplRecuperarCont.setText("Olvidé mi contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hplRecuperarCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnAcceder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(hplRecuperarCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        acceder();
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            acceder();
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            acceder();
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void acceder(){
        if(controlador.iniciarSesion(txtUsuario.getText(),
                String.copyValueOf(txtContraseña.getPassword()))){  
            
            config = new DatosConfig(txtUsuario.getText(),
                    String.copyValueOf( txtContraseña.getPassword()));
            this.setVisible(false);
            PrincipalFrame formulario = new PrincipalFrame();
            formulario.setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        try {
            FlatGrayIJTheme.setup();
            LoginFrame.setDefaultLookAndFeelDecorated( 
                    true );
            MedicoFrame.setDefaultLookAndFeelDecorated( 
                    true );
            PacienteFrame.setDefaultLookAndFeelDecorated(
                true);
            FlatAnimatedLafChange.showSnapshot();
        } catch (Exception ex) {
            System.err.println("Fallo al inicializar el tema.");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private org.jdesktop.swingx.JXHyperlink hplRecuperarCont;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
