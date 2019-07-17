package Controlador;

import Services.Seguridad;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JDialog {

    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(270, 350);
        this.setResizable(false);
        setLocationRelativeTo(null);
    }

    //MenuPrincipal menu= new MenuPrincipal();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jbtn_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxt_usuario = new javax.swing.JTextField();
        jtxt_clave = new javax.swing.JTextField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jbtn_login.setText("INGRESAR");
        jbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_login);
        jbtn_login.setBounds(90, 270, 83, 23);

        jLabel4.setText("ICONO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 90, 34, 14);

        jDesktopPane2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");
        jDesktopPane2.add(jLabel5);
        jLabel5.setBounds(90, 150, 51, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA");
        jDesktopPane2.add(jLabel2);
        jLabel2.setBounds(70, 200, 77, 15);

        jtxt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_usuarioActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jtxt_usuario);
        jtxt_usuario.setBounds(160, 150, 70, 20);
        jDesktopPane2.add(jtxt_clave);
        jtxt_clave.setBounds(160, 200, 70, 20);

        getContentPane().add(jDesktopPane2);
        jDesktopPane2.setBounds(-60, 10, 330, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_loginActionPerformed
        Seguridad seg= new Seguridad();
        try {
            String var=seg.validacion(jtxt_usuario.getText(), jtxt_clave.getText());
            if(var.equals("complete los datos") || var.equals("Usuario o Password erroneo")){
                JOptionPane.showMessageDialog(null, "Error");
            } else {
                JOptionPane.showMessageDialog(null, "Bienveniedo "+var);
                this.setVisible(false);
            }
        } catch (Exception IOException) {
           JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jbtn_loginActionPerformed

    private void jtxt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_usuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtn_login;
    private javax.swing.JTextField jtxt_clave;
    private javax.swing.JTextField jtxt_usuario;
    // End of variables declaration//GEN-END:variables
}
