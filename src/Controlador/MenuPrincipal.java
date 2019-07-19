
package Controlador;

public class MenuPrincipal extends javax.swing.JFrame {
    Login login = new Login(new javax.swing.JFrame(), true);
    
    public MenuPrincipal() {
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(1000, 700);
        this.setResizable(false);
        setLocationRelativeTo(null);
        login.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jbtn_usuarios = new javax.swing.JMenuItem();
        jbtn_personal = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jbtn_alimentosI = new javax.swing.JMenuItem();
        jbtn_menu = new javax.swing.JMenuItem();
        jbtn_clientes = new javax.swing.JMenuItem();
        jbtn_mesas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jtbtn_caja = new javax.swing.JMenuItem();
        jbtn_cocina = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jbtn_rvdia = new javax.swing.JMenuItem();
        jbtn_rvmes = new javax.swing.JMenuItem();
        jbtn_rvtotal = new javax.swing.JMenuItem();
        jbtn_rclientes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jbtn_ayuda = new javax.swing.JMenuItem();
        jbtn_facebook = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jbtn_cerrarsesion = new javax.swing.JMenuItem();
        jbtn_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jMenu1.setText("         Actualizacion de Registro         ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jbtn_usuarios.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_usuarios.setText("                   Usuarios           ");
        jbtn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_usuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jbtn_usuarios);

        jbtn_personal.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_personal.setText("                  Personal          ");
        jbtn_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_personalActionPerformed(evt);
            }
        });
        jMenu1.add(jbtn_personal);

        jMenu6.setText("                  Comida");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jbtn_alimentosI.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_alimentosI.setText("Alimentos individuales");
        jbtn_alimentosI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_alimentosIActionPerformed(evt);
            }
        });
        jMenu6.add(jbtn_alimentosI);

        jbtn_menu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_menu.setText("Menu");
        jMenu6.add(jbtn_menu);

        jMenu1.add(jMenu6);

        jbtn_clientes.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_clientes.setText("                  Clientes          ");
        jMenu1.add(jbtn_clientes);

        jbtn_mesas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_mesas.setText("                  Mesas          ");
        jMenu1.add(jbtn_mesas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("                 Procesos                 ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtbtn_caja.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jtbtn_caja.setText("                  Caja              ");
        jtbtn_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtn_cajaActionPerformed(evt);
            }
        });
        jMenu2.add(jtbtn_caja);

        jbtn_cocina.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_cocina.setText("                  Cocina              ");
        jMenu2.add(jbtn_cocina);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("                 Reportes                 ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jbtn_rvdia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_rvdia.setText("           Venta del día          ");
        jMenu3.add(jbtn_rvdia);

        jbtn_rvmes.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_rvmes.setText("           Venta del mes          ");
        jMenu3.add(jbtn_rvmes);

        jbtn_rvtotal.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_rvtotal.setText("           Venta total          ");
        jMenu3.add(jbtn_rvtotal);

        jbtn_rclientes.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_rclientes.setText("           Clientes          ");
        jMenu3.add(jbtn_rclientes);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("                 Otros                 ");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jbtn_ayuda.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_ayuda.setText("            Ayuda           ");
        jMenu4.add(jbtn_ayuda);

        jbtn_facebook.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_facebook.setText("            Facebook           ");
        jMenu4.add(jbtn_facebook);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("                  Icono          ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jbtn_cerrarsesion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_cerrarsesion.setText("      Cerrar sesion      ");
        jbtn_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cerrarsesionActionPerformed(evt);
            }
        });
        jMenu5.add(jbtn_cerrarsesion);

        jbtn_salir.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtn_salir.setText("      Salir      ");
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });
        jMenu5.add(jbtn_salir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cerrarsesionActionPerformed
        login.setVisible(true);
    }//GEN-LAST:event_jbtn_cerrarsesionActionPerformed

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jbtn_salirActionPerformed

    private void jbtn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_usuariosActionPerformed
        Usuarios usuarios = new Usuarios(new javax.swing.JFrame(), true);
        if(login.var.equals("ADMINISTRADOR")){
            usuarios.setVisible(true);
        } else{
            usuarios.setVisible(false);
        }
    }//GEN-LAST:event_jbtn_usuariosActionPerformed

    private void jbtn_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_personalActionPerformed
        Personal personales = new Personal(new javax.swing.JFrame(), true);
        if(login.var.equals("ADMINISTRADOR")){
            personales.setVisible(true);
        } else{
            personales.setVisible(false);
        }
    }//GEN-LAST:event_jbtn_personalActionPerformed

    private void jbtn_alimentosIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_alimentosIActionPerformed
        PlatosIndividuales individuales = new PlatosIndividuales(new javax.swing.JFrame(), true);
        if(login.var.equals("ADMINISTRADOR")){
            individuales.setVisible(true);
        } else{
            individuales.setVisible(false);
        }
    }//GEN-LAST:event_jbtn_alimentosIActionPerformed

    private void jtbtn_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtn_cajaActionPerformed
        ListaPedido pedidos= new ListaPedido(new javax.swing.JFrame(), true);
        if(login.var.equals("ADMINISTRADOR") && login.var.equals("COCINERO")){
            pedidos.setVisible(true);
        } else{
            pedidos.setVisible(false);
        }
    }//GEN-LAST:event_jtbtn_cajaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jbtn_alimentosI;
    private javax.swing.JMenuItem jbtn_ayuda;
    private javax.swing.JMenuItem jbtn_cerrarsesion;
    private javax.swing.JMenuItem jbtn_clientes;
    private javax.swing.JMenuItem jbtn_cocina;
    private javax.swing.JMenuItem jbtn_facebook;
    private javax.swing.JMenuItem jbtn_menu;
    private javax.swing.JMenuItem jbtn_mesas;
    private javax.swing.JMenuItem jbtn_personal;
    private javax.swing.JMenuItem jbtn_rclientes;
    private javax.swing.JMenuItem jbtn_rvdia;
    private javax.swing.JMenuItem jbtn_rvmes;
    private javax.swing.JMenuItem jbtn_rvtotal;
    private javax.swing.JMenuItem jbtn_salir;
    private javax.swing.JMenuItem jbtn_usuarios;
    private javax.swing.JMenuItem jtbtn_caja;
    // End of variables declaration//GEN-END:variables
}
