/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CustomerInfoDialog.java
 *
 * Created on 12-Apr-2011, 5:51:40 PM
 */

package ui;

/**
 *
 * @author kpoirier00
 */
public class CustomerInfoDialog extends javax.swing.JDialog {

    /** Creates new form CustomerInfoDialog */
    public CustomerInfoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleCustomerInfoLabel = new javax.swing.JLabel();
        postalCodeCustomerTextField = new javax.swing.JTextField();
        postalCodeCustomerLabel = new javax.swing.JLabel();
        countryCustomerTextField = new javax.swing.JTextField();
        provinceCustomerTextField = new javax.swing.JTextField();
        cityCustomerTextField = new javax.swing.JTextField();
        empIDCustomerTextField = new javax.swing.JTextField();
        countryCustomerLabel = new javax.swing.JLabel();
        okCustomerInfoButton = new javax.swing.JButton();
        provinceCustomerLabel = new javax.swing.JLabel();
        FirstNameCustomerTextField = new javax.swing.JTextField();
        cityCustomerLabel = new javax.swing.JLabel();
        houseNumberCustomerLabel = new javax.swing.JLabel();
        empIDCustomerLabel = new javax.swing.JLabel();
        streetNameCustomerLabel = new javax.swing.JLabel();
        penaltyCustomerLabel = new javax.swing.JLabel();
        streetNameCustomerTextField = new javax.swing.JTextField();
        fNameCustomerLabel = new javax.swing.JLabel();
        lNameCustomerLabel = new javax.swing.JLabel();
        lNameCustomerInfoTextfield = new javax.swing.JTextField();
        addressCustomerLabel = new javax.swing.JLabel();
        statusCustomerLabel = new javax.swing.JLabel();
        houseNumberCustomerTextField = new javax.swing.JTextField();
        statusCustomerTextField = new javax.swing.JTextField();
        penaltyCustomerTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleCustomerInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        titleCustomerInfoLabel.setText("Customer Information");

        postalCodeCustomerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalCodeCustomerTextFieldActionPerformed(evt);
            }
        });

        postalCodeCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        postalCodeCustomerLabel.setText("Postal Code");

        empIDCustomerTextField.setEditable(false);

        countryCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        countryCustomerLabel.setText("Country");

        okCustomerInfoButton.setText("OK");

        provinceCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        provinceCustomerLabel.setText("Province");

        cityCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        cityCustomerLabel.setText("City");

        houseNumberCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        houseNumberCustomerLabel.setText("House #");

        empIDCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        empIDCustomerLabel.setText("CustomerID");

        streetNameCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        streetNameCustomerLabel.setText("Street Name");

        penaltyCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        penaltyCustomerLabel.setText("Penalty");

        fNameCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        fNameCustomerLabel.setText("First Name");

        lNameCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        lNameCustomerLabel.setText("Last Name");

        addressCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        addressCustomerLabel.setText("Address");

        statusCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        statusCustomerLabel.setText("Status");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Drivers License");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Phone Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(titleCustomerInfoLabel)
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressCustomerLabel)
                            .addComponent(statusCustomerLabel)
                            .addComponent(jLabel1))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(houseNumberCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(houseNumberCustomerLabel)
                                    .addComponent(cityCustomerLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(streetNameCustomerLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(provinceCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(provinceCustomerLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(countryCustomerLabel)
                                            .addComponent(countryCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(streetNameCustomerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                            .addComponent(postalCodeCustomerLabel)
                            .addComponent(cityCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postalCodeCustomerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(statusCustomerTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(okCustomerInfoButton)
                        .addGap(90, 90, 90)))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNameCustomerLabel)
                    .addComponent(lNameCustomerLabel)
                    .addComponent(empIDCustomerLabel)
                    .addComponent(penaltyCustomerLabel)
                    .addComponent(jLabel3))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(penaltyCustomerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(FirstNameCustomerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(lNameCustomerInfoTextfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(empIDCustomerTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleCustomerInfoLabel)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameCustomerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameCustomerInfoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameCustomerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empIDCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empIDCustomerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penaltyCustomerLabel)
                    .addComponent(penaltyCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statusCustomerLabel)
                        .addGap(29, 29, 29)
                        .addComponent(addressCustomerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statusCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(houseNumberCustomerLabel)
                            .addComponent(streetNameCustomerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(houseNumberCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streetNameCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityCustomerLabel)
                            .addComponent(provinceCustomerLabel)
                            .addComponent(countryCustomerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provinceCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postalCodeCustomerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postalCodeCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addComponent(okCustomerInfoButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postalCodeCustomerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalCodeCustomerTextFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_postalCodeCustomerTextFieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerInfoDialog dialog = new CustomerInfoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstNameCustomerTextField;
    private javax.swing.JLabel addressCustomerLabel;
    private javax.swing.JLabel cityCustomerLabel;
    private javax.swing.JTextField cityCustomerTextField;
    private javax.swing.JLabel countryCustomerLabel;
    private javax.swing.JTextField countryCustomerTextField;
    private javax.swing.JLabel empIDCustomerLabel;
    private javax.swing.JTextField empIDCustomerTextField;
    private javax.swing.JLabel fNameCustomerLabel;
    private javax.swing.JLabel houseNumberCustomerLabel;
    private javax.swing.JTextField houseNumberCustomerTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lNameCustomerInfoTextfield;
    private javax.swing.JLabel lNameCustomerLabel;
    private javax.swing.JButton okCustomerInfoButton;
    private javax.swing.JLabel penaltyCustomerLabel;
    private javax.swing.JTextField penaltyCustomerTextField;
    private javax.swing.JLabel postalCodeCustomerLabel;
    private javax.swing.JTextField postalCodeCustomerTextField;
    private javax.swing.JLabel provinceCustomerLabel;
    private javax.swing.JTextField provinceCustomerTextField;
    private javax.swing.JLabel statusCustomerLabel;
    private javax.swing.JTextField statusCustomerTextField;
    private javax.swing.JLabel streetNameCustomerLabel;
    private javax.swing.JTextField streetNameCustomerTextField;
    private javax.swing.JLabel titleCustomerInfoLabel;
    // End of variables declaration//GEN-END:variables

}
