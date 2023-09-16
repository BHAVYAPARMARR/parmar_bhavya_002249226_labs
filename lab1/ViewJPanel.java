/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Product;

/**
 *
 * @author Bhavya's Surface
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Product product;
    
    public ViewJPanel(Product product) {
        initComponents();
        this.product = product;
        displayProduct();
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

        IbITitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        IbITitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbITitle.setText("View Product");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IbITitle)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IbIName)
                            .addComponent(IbIPrice)
                            .addComponent(IbIAvailNum)
                            .addComponent(IbIDescr))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtDescr)
                            .addComponent(txtPrice)
                            .addComponent(txtAvailNum, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
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
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbIAvailNum;
    private javax.swing.JLabel IbIDescr;
    private javax.swing.JLabel IbIName;
    private javax.swing.JLabel IbIPrice;
    private javax.swing.JLabel IbITitle;
    private javax.swing.JTextField txtAvailNum;
    private javax.swing.JTextField txtDescr;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        txtName.setText(product.getName());
        txtDescr.setText(product.getDescr());
        txtAvailNum.setText(product.getAvailNum());
        txtPrice.setText(product.getPrice());
    
    }
}
