
package Controlador;

import Dao.DAOEmpleado;
import Model.Empleado;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JDialog {
    UsuariosCE usuariosce = new UsuariosCE(new javax.swing.JFrame(), true);
    
    public Usuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(950, 550);
        this.setResizable(false);
        setLocationRelativeTo(null);
        
        jtbl_usuarios.getTableHeader().setPreferredSize(new java.awt.Dimension(0,30));
        this.refresh();
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_usuarios = new javax.swing.JTable();
        jbtn_atrasU = new javax.swing.JButton();
        jbtn_crearnuevoU = new javax.swing.JButton();
        jbtn_editarU = new javax.swing.JButton();
        jbtn_eliminarU = new javax.swing.JButton();
        jbtn_exportarU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("LISTA DE USUARIOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 90, 140, 17);

        jtbl_usuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "CONTRASEÑA", "DOCUMENTO", "TELEFONO", "DIRECCION", "TIPO", "<html> <body> <div style= \"text-align: center; color: black;\"> <p>FECHA DE</p> <p>VINCULACION</p> </div> </body> </html> "
            }
        ));
        jtbl_usuarios.setToolTipText("");
        jtbl_usuarios.setAutoscrolls(false);
        jtbl_usuarios.getTableHeader().setResizingAllowed(false);
        jtbl_usuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbl_usuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 890, 330);

        jbtn_atrasU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtn_atrasU.setText("<<");
        jbtn_atrasU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_atrasUActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_atrasU);
        jbtn_atrasU.setBounds(10, 10, 60, 40);

        jbtn_crearnuevoU.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jbtn_crearnuevoU.setText("<html> <body> <div style= \"text-align: center; color: black;\"> <p>Crear</p> <p>Nuevo</p> </div> </body> </html> ");
        jbtn_crearnuevoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_crearnuevoUActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_crearnuevoU);
        jbtn_crearnuevoU.setBounds(70, 10, 100, 40);

        jbtn_editarU.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jbtn_editarU.setText("Editar");
        jbtn_editarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_editarUActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_editarU);
        jbtn_editarU.setBounds(170, 10, 70, 40);

        jbtn_eliminarU.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jbtn_eliminarU.setText("Eliminar");
        getContentPane().add(jbtn_eliminarU);
        jbtn_eliminarU.setBounds(240, 10, 80, 40);

        jbtn_exportarU.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jbtn_exportarU.setText("Exportar");
        getContentPane().add(jbtn_exportarU);
        jbtn_exportarU.setBounds(320, 10, 80, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refresh() {
        DefaultTableModel model = (DefaultTableModel) jtbl_usuarios.getModel();
        model.setRowCount(0);

        try {
            DAOEmpleado tblemp = new DAOEmpleado();

            for (Empleado em : (List<Empleado>) tblemp.listar()) {
                Object[] ob = new Object[model.getColumnCount()];
                ob[0] = em.getCodigoE();
                ob[1] = em.getNombreP();
                ob[2] = em.getClave();
                ob[3] = em.getDocumento();
                ob[4] = em.getTelefono();
                ob[5] = em.getDireccion();
                ob[6] = em.getTipoEmp();
                ob[7] = em.getFechaValidacion();
                model.addRow(ob);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error Refesh");
        }
    }
    
    private void jbtn_crearnuevoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_crearnuevoUActionPerformed
        usuariosce.setVisible(true);
       this.refresh();
    }//GEN-LAST:event_jbtn_crearnuevoUActionPerformed

    private void jbtn_editarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_editarUActionPerformed
        usuariosce.setVisible(true);
    }//GEN-LAST:event_jbtn_editarUActionPerformed

    private void jbtn_atrasUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_atrasUActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jbtn_atrasUActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Usuarios dialog = new Usuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_atrasU;
    private javax.swing.JButton jbtn_crearnuevoU;
    private javax.swing.JButton jbtn_editarU;
    private javax.swing.JButton jbtn_eliminarU;
    private javax.swing.JButton jbtn_exportarU;
    public javax.swing.JTable jtbl_usuarios;
    // End of variables declaration//GEN-END:variables
}
