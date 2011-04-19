/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CheckOutPanel.java
 *
 * Created on 15-Apr-2011, 12:16:09 PM
 */

package ui;

import account.Customer;
import account.Employee;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pos.TransactionManager;
import pos.Transaction;
import search.Search;


/**
 *
 * @author cwang01
 */
public class CheckOutPanel extends javax.swing.JPanel {

    //CheckINPanel local Variables
    private Customer currCustomer;
    private Employee currEmp;
    private TransactionManager transactionM;
    private Transaction currT;
    private Vector <Vector <String>> tableContent;
    private Vector <String> header;


    /** Creates new form CheckOutPanel */
    public CheckOutPanel() {
        transactionM = new TransactionManager();  //init Transection,
        initTableData();
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

        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        outOkButton = new javax.swing.JButton();
        transactionScrollPane = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        outCustomerInfoPanel = new javax.swing.JPanel();
        outPhoneField = new javax.swing.JTextField();
        outNameLabel = new javax.swing.JLabel();
        outPhoneLabel = new javax.swing.JLabel();
        outPenalthField = new javax.swing.JTextField();
        outNameField = new javax.swing.JTextField();
        outPenaltyLabel = new javax.swing.JLabel();
        outLicenseLabel = new javax.swing.JLabel();
        outLicenseField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        outCIdField = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        outCIdLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        DiscountButton = new javax.swing.JButton();

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField3.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Total");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("HST");

        outOkButton.setText("OK");
        outOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outOkButtonActionPerformed(evt);
            }
        });

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            tableContent, header
        ));
        transactionScrollPane.setViewportView(transactionTable);

        outCustomerInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        outPhoneField.setEditable(false);

        outNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        outNameLabel.setText("Name:");

        outPhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        outPhoneLabel.setText("Phone Number:");

        outPenalthField.setEditable(false);
        outPenalthField.setFocusable(false);

        outNameField.setEditable(false);
        outNameField.setText("Customer Name");
        outNameField.setFocusable(false);

        outPenaltyLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        outPenaltyLabel.setText("Penalty:");

        outLicenseLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        outLicenseLabel.setText("Driver's License:");

        outLicenseField.setEditable(false);

        jLabel2.setText("$");

        javax.swing.GroupLayout outCustomerInfoPanelLayout = new javax.swing.GroupLayout(outCustomerInfoPanel);
        outCustomerInfoPanel.setLayout(outCustomerInfoPanelLayout);
        outCustomerInfoPanelLayout.setHorizontalGroup(
            outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outPhoneLabel)
                    .addComponent(outNameLabel)
                    .addComponent(outLicenseLabel)
                    .addComponent(outPenaltyLabel))
                .addGap(18, 18, 18)
                .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outPhoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(outNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(outLicenseField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outCustomerInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outPenalthField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138))
        );
        outCustomerInfoPanelLayout.setVerticalGroup(
            outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                        .addComponent(outNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outLicenseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outPenalthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                        .addComponent(outNameLabel)
                        .addGap(12, 12, 12)
                        .addComponent(outPhoneLabel)
                        .addGap(12, 12, 12)
                        .addComponent(outLicenseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outPenaltyLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outCIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outCIdFieldKeyTyped(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField4.setText("0.00");

        outCIdLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        outCIdLabel.setText("Customer ID:");

        jButton1.setText("Add Item");

        jButton8.setText("Remove Item");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField2.setText("0.00");

        jButton11.setText("Check Out");

        jButton3.setText("Reset");

        jButton9.setText("Add Penalty");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Discount", "Discount 1" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("$");

        DiscountButton.setText("Add Discount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outCIdLabel)
                        .addGap(5, 5, 5)
                        .addComponent(outCIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(outOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(transactionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outCustomerInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(outCIdLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(outCIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(outOkButton))
                        .addGap(6, 6, 6)
                        .addComponent(transactionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(outCustomerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void outCIdFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outCIdFieldKeyTyped
        numberInputOnly(evt);
    }//GEN-LAST:event_outCIdFieldKeyTyped

    private void outOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outOkButtonActionPerformed
        try {

            cleanUpInputs();
            int custID = Integer.parseInt(outCIdField.getText().toString().trim());
            //System.out.println("al-custid = "+custID);
            currCustomer = Search.getCustomer(custID);
            if(currCustomer == null){
                outNameField.setText("Customer Not Found!");
            }else{
                outNameField.setText(currCustomer.getFname()+" "+currCustomer.getLname());
                outPhoneField.setText(currCustomer.getPhoneNum());
                outLicenseField.setText(currCustomer.getDL());
            //outPenaltyField.setText(currCustomer);
            }
            setTransection( currCustomer, currEmp);

        } catch (java.lang.NumberFormatException ex){
            //User enter noting.
            cleanUpInputs();
            outNameField.setText("No Customer ID!");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_outOkButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    private void initTableData(){

      //DefaultTableModel table = (DefaultTableModel)transactionTable.getModel();

      tableContent = new Vector<Vector <String>>();
      for(int i = 0; i < 1; i++){
          System.out.println("i = " + i);
          Vector temp = new Vector <String>();
          temp.add("1231546548795156121354546462455 ");
          temp.add("7-day Rental");
          temp.add("3.20");

          tableContent.add(temp);
      }

      header = new Vector<String>();
      header.add("Item Barcode"); //Barcode
      header.add("Description"); // Item Description
      header.add("Price"); // Item Price

 //     DefaultTableModel myModel = new DefaultTableModel(tableContent, header);

 //     ButtonColumn buttonColumn = new ButtonColumn(transactionTable, delete, 2);
 //     buttonColumn.setMnemonic(KeyEvent.VK_D);
 //     table.addColumn(buttonColumn);



    }


Action delete = new AbstractAction()
{
    public void actionPerformed(ActionEvent e)
    {
        JTable table = (JTable)e.getSource();
        int modelRow = Integer.valueOf( e.getActionCommand() );
        ((DefaultTableModel)table.getModel()).removeRow(modelRow);
    }
};




    private void UpdateTable() {

        //table.fireTableStructureChanged();


    }

 /**
 * Creat an Transection
 * @param cust current customer class
 * @param emp  current employee class
 * @return transction object
 * @pre Customer and Employee object exist
 * @post a new transeaction object
 */
    private void setTransection (Customer cust, Employee emp){
        transactionM.createTransaction(cust.getFname(), cust.getLname(), cust.getAccountID(), emp.getFname(), emp.getAccountID());
    }


    private void numberInputOnly(KeyEvent evt){
            char ch = evt.getKeyChar() ;

            if ( !((ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE)
                ||  (ch == KeyEvent.VK_ENTER)     || (ch == KeyEvent.VK_TAB)
                ||  (Character.isDigit(ch))))
            {
               evt.consume() ;
            }
    }
    private void cleanUpInputs(){

        outNameField.setText("");
        outPhoneField.setText("");
        outLicenseField.setText("");
        //outPenaltyField.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiscountButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField outCIdField;
    private javax.swing.JLabel outCIdLabel;
    private javax.swing.JPanel outCustomerInfoPanel;
    private javax.swing.JTextField outLicenseField;
    private javax.swing.JLabel outLicenseLabel;
    private javax.swing.JTextField outNameField;
    private javax.swing.JLabel outNameLabel;
    private javax.swing.JButton outOkButton;
    private javax.swing.JTextField outPenalthField;
    private javax.swing.JLabel outPenaltyLabel;
    private javax.swing.JTextField outPhoneField;
    private javax.swing.JLabel outPhoneLabel;
    private javax.swing.JScrollPane transactionScrollPane;
    private javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables

}
