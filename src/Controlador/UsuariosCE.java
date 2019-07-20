
package Controlador;

import Model.TipoEmpleado;
import javax.swing.table.DefaultTableModel;
import Controlador.Usuarios;
import Dao.CRUD;
import Dao.DAOEmpleado;
import Model.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class UsuariosCE extends javax.swing.JDialog {
    Empleado emp= new Empleado();
    private List<Empleado> listaEmpleado = new ArrayList<>();
    public UsuariosCE(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(550, 500);
        this.setResizable(false);
        setLocationRelativeTo(null);
        
        DefaultComboBoxModel model = new DefaultComboBoxModel(TipoEmpleado.values());
        jcmb_tipoU.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_codigoU = new javax.swing.JTextField();
        jtxt_nombreU = new javax.swing.JTextField();
        jbtn_confirmarU = new javax.swing.JButton();
        jbtn_cancelarU = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxt_claveU = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxt_documentoU = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_telefonoU = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxt_direccionU = new javax.swing.JTextField();
        jcmb_tipoU = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CODIGO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 60, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 50, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("TIPO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 360, 40, 15);

        jtxt_codigoU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_codigoU);
        jtxt_codigoU.setBounds(170, 40, 340, 30);

        jtxt_nombreU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_nombreU);
        jtxt_nombreU.setBounds(170, 90, 340, 30);

        jbtn_confirmarU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_confirmarU.setText("CONFIRMAR");
        jbtn_confirmarU.setPreferredSize(new java.awt.Dimension(90, 20));
        jbtn_confirmarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_confirmarUActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_confirmarU);
        jbtn_confirmarU.setBounds(160, 410, 100, 40);

        jbtn_cancelarU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_cancelarU.setText("CANCELAR");
        jbtn_cancelarU.setPreferredSize(new java.awt.Dimension(90, 20));
        jbtn_cancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarUActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_cancelarU);
        jbtn_cancelarU.setBounds(310, 410, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 150, 90, 15);

        jtxt_claveU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_claveU);
        jtxt_claveU.setBounds(170, 140, 340, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("DOCUMENTO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 200, 90, 15);

        jtxt_documentoU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_documentoU);
        jtxt_documentoU.setBounds(170, 190, 340, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("TELEFONO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 250, 90, 15);

        jtxt_telefonoU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_telefonoU);
        jtxt_telefonoU.setBounds(170, 240, 340, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("DIRECCION");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 300, 80, 15);

        jtxt_direccionU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_direccionU);
        jtxt_direccionU.setBounds(170, 290, 340, 30);

        jcmb_tipoU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jcmb_tipoU);
        jcmb_tipoU.setBounds(170, 350, 140, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_confirmarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_confirmarUActionPerformed
        
        emp.setCodigoE(jtxt_codigoU.getText());
        emp.setNombreP(jtxt_nombreU.getText());
        emp.setDocumento(jtxt_documentoU.getText());
        emp.setTelefono(jtxt_telefonoU.getText());
        emp.setDireccion(jtxt_direccionU.getText());
        emp.setClave(jtxt_claveU.getText());
        emp.setTipoEmp( (TipoEmpleado) jcmb_tipoU.getSelectedItem());
        try{
            CRUD dao = new DAOEmpleado();
            dao.registrar(emp);
            this.setVisible(false);
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al confirmar usuario: "+e);
        }
        
    }//GEN-LAST:event_jbtn_confirmarUActionPerformed
    
    private void jbtn_cancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarUActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtn_cancelarUActionPerformed

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
            java.util.logging.Logger.getLogger(UsuariosCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuariosCE dialog = new UsuariosCE(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtn_cancelarU;
    private javax.swing.JButton jbtn_confirmarU;
    private javax.swing.JComboBox jcmb_tipoU;
    private javax.swing.JTextField jtxt_claveU;
    private javax.swing.JTextField jtxt_codigoU;
    private javax.swing.JTextField jtxt_direccionU;
    private javax.swing.JTextField jtxt_documentoU;
    private javax.swing.JTextField jtxt_nombreU;
    private javax.swing.JTextField jtxt_telefonoU;
    // End of variables declaration//GEN-END:variables

}
