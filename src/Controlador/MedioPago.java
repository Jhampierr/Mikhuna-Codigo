
package Controlador;

public class MedioPago extends javax.swing.JDialog {

    public MedioPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(550, 500);
        this.setResizable(false);
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jbtn_quitarPD = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jcmb_tipoU = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jcmb_tipoU1 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jcmb_tipoU2 = new javax.swing.JComboBox<>();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("MEDIO DE PAGO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("TOTAL A PAGAR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 70, 110, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(370, 70, 140, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("CANCELAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 440, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("GUARDAR");
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 440, 100, 30);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PAGO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel6.setLayout(null);

        jbtn_quitarPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_quitarPD.setText("QUITAR");
        jPanel6.add(jbtn_quitarPD);
        jbtn_quitarPD.setBounds(50, 360, 90, 30);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(jTextField5);
        jTextField5.setBounds(210, 40, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("TOTAL");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(240, 360, 70, 20);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(jTextField6);
        jTextField6.setBounds(320, 360, 110, 30);

        jcmb_tipoU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcmb_tipoU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opcion", "EFECTIVO", "TARJETA", "NINGUNA" }));
        jPanel6.add(jcmb_tipoU);
        jcmb_tipoU.setBounds(40, 40, 140, 30);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(jTextField7);
        jTextField7.setBounds(360, 40, 100, 30);

        jcmb_tipoU1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcmb_tipoU1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opcion", "EFECTIVO", "TARJETA", "NINGUNA" }));
        jPanel6.add(jcmb_tipoU1);
        jcmb_tipoU1.setBounds(40, 90, 140, 30);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(jTextField8);
        jTextField8.setBounds(210, 90, 120, 30);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(jTextField9);
        jTextField9.setBounds(360, 90, 100, 30);

        jcmb_tipoU2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcmb_tipoU2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opcion", "EFECTIVO", "TARJETA", "NINGUNA" }));
        jPanel6.add(jcmb_tipoU2);
        jcmb_tipoU2.setBounds(40, 140, 140, 30);

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(jTextField10);
        jTextField10.setBounds(210, 140, 120, 30);

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(jTextField11);
        jTextField11.setBounds(360, 140, 100, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(20, 120, 490, 200);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("SALDO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 340, 70, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(400, 340, 100, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(400, 380, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("VUELTO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 380, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MedioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MedioPago dialog = new MedioPago(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtn_quitarPD;
    private javax.swing.JComboBox<String> jcmb_tipoU;
    private javax.swing.JComboBox<String> jcmb_tipoU1;
    private javax.swing.JComboBox<String> jcmb_tipoU2;
    // End of variables declaration//GEN-END:variables
}
