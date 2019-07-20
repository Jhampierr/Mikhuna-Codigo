
package Controlador;

import Dao.CRUD;
import Dao.DAOAlimento;
import Dao.DAOPedido;
import Model.Alimento;
import Model.Pedido;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PedidoDetallado extends javax.swing.JDialog {
    
    public PedidoDetallado(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(1000, 600);
        this.setResizable(false);
        setLocationRelativeTo(null);
        
        int contar = 1;
        String codigo = "";
        try{
            CRUD dao = new DAOPedido();
            for(Pedido p : (List<Pedido>) dao.listar()){      
                    codigo = p.getCodigoP();
                    contar++;
            }
            if(contar<10){
                codigo = "P00" + String.valueOf(contar);
            }else if(contar<100){
                codigo = "P0" + String.valueOf(contar);
            }else if(contar<1000){
                codigo = "P" + String.valueOf(contar);
            }
            jLCodPEdido.setText(codigo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"ERROR");
        }
        
        DefaultTableModel model = (DefaultTableModel) jtbl_productoPD.getModel();
        
        try{
            CRUD dao = new DAOAlimento();
            for(Alimento p : (List<Alimento>) dao.listar()){
                    Object[] ob = new Object[model.getColumnCount()];
                    ob[0] = p.getNombreA();
                    ob[1] = p.getPrecio();
                    model.addRow(ob);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"ERROR");
        }
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jbtn_buscarPD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_productoPD = new javax.swing.JTable();
        jTBuscarProducto = new javax.swing.JTextField();
        jbtn_agregarPD = new javax.swing.JButton();
        jbtn_agregarMenuPD = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jbtn_quitarPD = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbl_pedidosPD = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLCodPEdido = new javax.swing.JLabel();
        jbtn_mesaPD = new javax.swing.JButton();
        jbtn_deliveryPD = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jbtn_cancelarPD = new javax.swing.JButton();
        jbtn_mandarCocinaPD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PRODUCTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel5.setLayout(null);

        jbtn_buscarPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_buscarPD.setText("BUSCAR");
        jbtn_buscarPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarPDActionPerformed(evt);
            }
        });
        jPanel5.add(jbtn_buscarPD);
        jbtn_buscarPD.setBounds(290, 40, 90, 30);

        jtbl_productoPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_productoPD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_productoPD.getTableHeader().setResizingAllowed(false);
        jtbl_productoPD.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtbl_productoPD);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(40, 90, 370, 250);

        jTBuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.add(jTBuscarProducto);
        jTBuscarProducto.setBounds(50, 40, 200, 30);

        jbtn_agregarPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_agregarPD.setText("AGREGAR");
        jbtn_agregarPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarPDActionPerformed(evt);
            }
        });
        jPanel5.add(jbtn_agregarPD);
        jbtn_agregarPD.setBounds(310, 360, 90, 30);

        jbtn_agregarMenuPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_agregarMenuPD.setText("<html> <body> <div style= \"text-align: center; color: black;\"> <p>AGREGAR</p> <p>MENU</p> </div> </body> </html> ");
        jPanel5.add(jbtn_agregarMenuPD);
        jbtn_agregarMenuPD.setBounds(50, 350, 90, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(530, 40, 440, 410);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PEDIDOS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel6.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("CODIGO PEDIDO:");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(100, 40, 100, 20);

        jbtn_quitarPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_quitarPD.setText("QUITAR");
        jPanel6.add(jbtn_quitarPD);
        jbtn_quitarPD.setBounds(50, 360, 90, 30);

        jtbl_pedidosPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_pedidosPD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_pedidosPD.getTableHeader().setResizingAllowed(false);
        jtbl_pedidosPD.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtbl_pedidosPD);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(40, 90, 400, 250);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("TOTAL");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(240, 360, 70, 20);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(jTextField6);
        jTextField6.setBounds(320, 360, 110, 30);

        jLCodPEdido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLCodPEdido);
        jLCodPEdido.setBounds(200, 40, 150, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(20, 40, 480, 410);

        jbtn_mesaPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_mesaPD.setText("MESA");
        getContentPane().add(jbtn_mesaPD);
        jbtn_mesaPD.setBounds(170, 470, 100, 30);

        jbtn_deliveryPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_deliveryPD.setText("DELIVERY");
        getContentPane().add(jbtn_deliveryPD);
        jbtn_deliveryPD.setBounds(50, 470, 100, 30);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(50, 520, 230, 30);

        jbtn_cancelarPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_cancelarPD.setText("CANCELAR");
        getContentPane().add(jbtn_cancelarPD);
        jbtn_cancelarPD.setBounds(860, 520, 100, 30);

        jbtn_mandarCocinaPD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_mandarCocinaPD.setText("<html> <body> <div style= \"text-align: center; color: black;\"> <p>MANDAR A</p> <p>COCINA</p> </div> </body> </html> ");
        getContentPane().add(jbtn_mandarCocinaPD);
        jbtn_mandarCocinaPD.setBounds(680, 510, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_buscarPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarPDActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtbl_productoPD.getModel();
        
        try {
            int filas=model.getRowCount();
            for (int i = 0;filas>i; i++) {
                model.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
        
        try{
            CRUD dao2 = new DAOAlimento();
            
            for(Alimento a : (List<Alimento>) dao2.buscarpor(jTBuscarProducto.getText())){
                    Object[] ob = new Object[model.getColumnCount()];
                    ob[0] = a.getNombreA();
                    ob[1] = a.getPrecio();
                    model.addRow(ob);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbtn_buscarPDActionPerformed

    private void jbtn_agregarPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarPDActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtbl_productoPD.getModel();
        
        JOptionPane.showMessageDialog(null, "Primero Agrega a la Otra tabla");
        
        try{
            CRUD dao = new DAOAlimento();
            for(Alimento p : (List<Alimento>) dao.listar()){
                    Object[] ob = new Object[model.getColumnCount()];
                    ob[0] = p.getNombreA();
                    ob[1] = p.getPrecio();
                    model.addRow(ob);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"ERROR");
        }
    }//GEN-LAST:event_jbtn_agregarPDActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PedidoDetallado dialog = new PedidoDetallado(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLCodPEdido;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTBuscarProducto;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton jbtn_agregarMenuPD;
    private javax.swing.JButton jbtn_agregarPD;
    private javax.swing.JButton jbtn_buscarPD;
    private javax.swing.JButton jbtn_cancelarPD;
    private javax.swing.JButton jbtn_deliveryPD;
    private javax.swing.JButton jbtn_mandarCocinaPD;
    private javax.swing.JButton jbtn_mesaPD;
    private javax.swing.JButton jbtn_quitarPD;
    private javax.swing.JTable jtbl_pedidosPD;
    private javax.swing.JTable jtbl_productoPD;
    // End of variables declaration//GEN-END:variables
}
