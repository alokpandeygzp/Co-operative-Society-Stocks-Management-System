/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.code;

import javax.swing.table.TableModel;

import project.DataBase.*;

import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author atulkumarsethi
 */
public class PurchaseProducts extends javax.swing.JFrame {

    PurchaseProductDb ob = new PurchaseProductDb();

    /**
     * Creates new form PurchaseProducts
     */
    public PurchaseProducts() {
        initComponents();
        ResultSet st = ob.list();
        purchaseProductTable.setModel(DbUtils.resultSetToTableModel(st));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchaseProductTable = new javax.swing.JTable();
        itemIdLable = new javax.swing.JLabel();
        itemId = new javax.swing.JTextField();
        QuantityLable = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        addToCart = new javax.swing.JButton();
        heading = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(68, 165, 201));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 275));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 310, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 250, 310));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        purchaseProductTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String[]{
                    "Item_Id", "Quantity", "Price"
                }
        ));
        purchaseProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseProductTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(purchaseProductTable);

        itemIdLable.setText("ITEM ID:");

        itemId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itemId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        QuantityLable.setText("Quantity:");

        quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        addToCart.setText("ADD TO CART");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        heading.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        heading.setText("PURCHASE PRODUCT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(itemIdLable)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(itemId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(QuantityLable)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(addToCart))
                                                .addGap(0, 31, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(heading)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(heading)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemIdLable)
                                        .addComponent(itemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(QuantityLable)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submit)
                                        .addComponent(addToCart))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, 400, 310));

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 25));

        close.setFont(new java.awt.Font("Helvetica Neue", 0, 19)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        back.setFont(new java.awt.Font("Helvetica Neue", 0, 19)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(close)
                                        .addComponent(back))
                                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(itemId.getText());
        int y = Integer.parseInt(quantity.getText());

        ob.addToCart(x, y);
        itemId.setText("");
        quantity.setText("");
    }//GEN-LAST:event_addToCartActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try {
            int x = Integer.parseInt(itemId.getText());
            int y = Integer.parseInt(quantity.getText());

            ob.addToCart(x, y);

            FarmerAuthentication obj = new FarmerAuthentication();
            obj.show();
            dispose();
        } catch (Exception e) {
            FarmerAuthentication obj = new FarmerAuthentication();
            obj.show();
            dispose();
        }

    }//GEN-LAST:event_submitActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
//        CloseConnection c = new CloseConnection();
//        c.closeConnection();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        HomePage obj = new HomePage();
        obj.show();
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void purchaseProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseProductTableMouseClicked
        // TODO add your handling code here:
        int index = purchaseProductTable.getSelectedRow();
        TableModel model = purchaseProductTable.getModel();

        int value1 = Integer.parseInt(model.getValueAt(index, 0).toString());
        String id = "";
        id = id + value1;
        itemId.setText(id);
    }//GEN-LAST:event_purchaseProductTableMouseClicked

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
            java.util.logging.Logger.getLogger(PurchaseProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QuantityLable;
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel heading;
    private javax.swing.JTextField itemId;
    private javax.swing.JLabel itemIdLable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable purchaseProductTable;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}