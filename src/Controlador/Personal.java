package Controlador;

import Dao.DAOEmpleado;
import Dao.DAOMozo;
import Model.Empleado;
import Model.TipoEmpleado;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Personal extends javax.swing.JDialog {

    PersonalCE personales = new PersonalCE(new javax.swing.JFrame(), true);

    @Override
    public void setVisible(boolean bln) {
        super.setVisible(bln);
        //To change body of generated methods, choose Tools | Templates.
    }

    public void refresh() {
        DefaultTableModel model = (DefaultTableModel) jtbl_personalP.getModel();
        model.setRowCount(0);

        try {
            DAOMozo tblemp = new DAOMozo();

            for (Empleado per : (List<Empleado>) tblemp.listar()) {
                Object[] ob = new Object[model.getColumnCount()];
                ob[0] = per.getCodigoE();
                ob[1] = per.getNombreP();
                ob[2] = per.getDocumento();
                ob[3] = per.getTelefono();
                ob[4] = per.getDireccion();
                ob[5] = per.getTipoEmp();
                ob[6] = per.getFechaValidacion();
                model.addRow(ob);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }

    public Personal(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(950, 500);
        this.setResizable(false);
        setLocationRelativeTo(null);
        jtbl_personalP.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));
        refresh();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_personalP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbtn_atrasP = new javax.swing.JButton();
        jbtn_crearnuevoP = new javax.swing.JButton();
        jbtn_editarP = new javax.swing.JButton();
        jbtn_eliminarP = new javax.swing.JButton();
        jbtn_exportarP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jtbl_personalP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_personalP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DOCUMENTO", "TELEFONO", "DIRECCION", "TIPO", "<html> <body> <div style= \"text-align: center; color: black;\"> <p>FECHA DE</p> <p>VINCULACION</p> </div> </body> </html> "
            }
        ));
        jtbl_personalP.getTableHeader().setResizingAllowed(false);
        jtbl_personalP.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbl_personalP);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 890, 330);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("LISTA DE PERSONAL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 90, 140, 17);

        jbtn_atrasP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtn_atrasP.setText("<<");
        jbtn_atrasP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_atrasPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_atrasP);
        jbtn_atrasP.setBounds(10, 10, 60, 40);

        jbtn_crearnuevoP.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jbtn_crearnuevoP.setText("<html> <body> <div style= \"text-align: center; color: black;\"> <p>Crear</p> <p>Nuevo</p> </div> </body> </html> ");
        jbtn_crearnuevoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_crearnuevoPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_crearnuevoP);
        jbtn_crearnuevoP.setBounds(70, 10, 100, 40);

        jbtn_editarP.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jbtn_editarP.setText("Editar");
        jbtn_editarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_editarPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_editarP);
        jbtn_editarP.setBounds(170, 10, 70, 40);

        jbtn_eliminarP.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jbtn_eliminarP.setText("Eliminar");
        jbtn_eliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_eliminarP);
        jbtn_eliminarP.setBounds(240, 10, 80, 40);

        jbtn_exportarP.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jbtn_exportarP.setText("Exportar");
        jbtn_exportarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_exportarPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_exportarP);
        jbtn_exportarP.setBounds(320, 10, 80, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_crearnuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_crearnuevoPActionPerformed

        personales.jtxt_codigoP.setText("");
        personales.jtxt_nombreP.setText("");
        personales.jtxt_documentoP.setText("");
        personales.jtxt_telefonoP.setText("");
        personales.jtxt_direccionP.setText("");
        personales.operacion = "crear";
        personales.setVisible(true);
        refresh();
    }//GEN-LAST:event_jbtn_crearnuevoPActionPerformed

    private void jbtn_editarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_editarPActionPerformed

        DefaultTableModel model = (DefaultTableModel) jtbl_personalP.getModel();
        int fila = jtbl_personalP.getSelectedRow();

        personales.jtxt_codigoP.setText(model.getValueAt(fila, 0).toString());
        personales.jtxt_nombreP.setText(model.getValueAt(fila, 1).toString());
        personales.jtxt_documentoP.setText(model.getValueAt(fila, 2).toString());
        personales.jtxt_telefonoP.setText(model.getValueAt(fila, 3).toString());
        personales.jtxt_direccionP.setText(model.getValueAt(fila, 4).toString());
        personales.operacion = "editar";
        personales.setVisible(true);
        refresh();

    }//GEN-LAST:event_jbtn_editarPActionPerformed

    private void jbtn_atrasPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_atrasPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtn_atrasPActionPerformed

    private void jbtn_eliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarPActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtbl_personalP.getModel();
        int fila = jtbl_personalP.getSelectedRow();

        Empleado Edemp = new Empleado();

        Edemp.setCodigoE(model.getValueAt(fila, 0).toString());

        DAOEmpleado EDIEmp = new DAOEmpleado();
        try {
            EDIEmp.eliminar(Edemp);
            JOptionPane.showMessageDialog(null, "exito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        refresh();
    }//GEN-LAST:event_jbtn_eliminarPActionPerformed

    private void jbtn_exportarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_exportarPActionPerformed
        JOptionPane.showMessageDialog(null, "https://www.youtube.com/watch?v=KSdHTGhHrIU");
    }//GEN-LAST:event_jbtn_exportarPActionPerformed

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
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Personal dialog = new Personal(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jbtn_atrasP;
    private javax.swing.JButton jbtn_crearnuevoP;
    private javax.swing.JButton jbtn_editarP;
    private javax.swing.JButton jbtn_eliminarP;
    private javax.swing.JButton jbtn_exportarP;
    public javax.swing.JTable jtbl_personalP;
    // End of variables declaration//GEN-END:variables
}
