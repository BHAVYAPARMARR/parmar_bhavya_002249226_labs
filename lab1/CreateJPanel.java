/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author Bhavya's Surface
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Product product;
    
    public CreateJPanel(Product product) {
        initComponents();
        this.product = product;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IbITitle = new javax.swing.JLabel();
        IbIName = new javax.swing.JLabel();
        IbIDescr = new javax.swing.JLabel();
        IbIPrice = new javax.swing.JLabel();
        IbIAvailNum = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDescr = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtAvailNum = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        IbITitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        IbITitle.setText("Create Product");

        IbIName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IbIName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIName.setText("Name:");

        IbIDescr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IbIDescr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIDescr.setText("Description:");

        IbIPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IbIPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIPrice.setText("Price:");

        IbIAvailNum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IbIAvailNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIAvailNum.setText("Availibility:");

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDescr.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAvailNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(IbITitle)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IbIName)
                    .addComponent(IbIPrice)
                    .addComponent(IbIAvailNum)
                    .addComponent(IbIDescr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(txtDescr)
                        .addComponent(txtPrice)
                        .addComponent(txtAvailNum)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IbITitle)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIDescr)
                    .addComponent(txtDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIAvailNum)
                    .addComponent(txtAvailNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        product.setName(txtName.getText());
        product.setDescr(txtDescr.getText());
        product.setAvailNum(txtAvailNum.getText());
        product.setPrice(txtPrice.getText());
        
        JOptionPane.showMessageDialog(this, "Product Information Is Saved    ");
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbIAvailNum;
    private javax.swing.JLabel IbIDescr;
    private javax.swing.JLabel IbIName;
    private javax.swing.JLabel IbIPrice;
    private javax.swing.JLabel IbITitle;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField txtAvailNum;
    private javax.swing.JTextField txtDescr;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
