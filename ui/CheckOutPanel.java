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
import inventory.MovieNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
    private UiController localUIC;
    private Customer currCustomer;
    private Employee currEmp;
    private TransactionManager transactionM;
    private Vector <Vector <String>> tableContent;
//    private Vector <String> header;


    /** Creates new form CheckOutPanel */
    public CheckOutPanel(ui.UiController UIC) {
        localUIC = UIC;
        currEmp = (Employee)(localUIC.getKey().getAccount());
        transactionM = new TransactionManager();  //init Transection,
//        initTableData();
        initComponents();
        lockInput(true);
        changeField.setEditable(false);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        buttonPanel = new javax.swing.JPanel();
        removeItemButton = new javax.swing.JButton();
        barcodeField = new javax.swing.JTextField();
        outCIdField = new javax.swing.JTextField();
        PenaltyField = new javax.swing.JTextField();
        penaltyButton = new javax.swing.JButton();
        DiscountBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        addItemButton = new javax.swing.JButton();
        outCIdLabel = new javax.swing.JLabel();
        DiscountButton = new javax.swing.JButton();
        outOkButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        transactionScrollPane = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        TaxtField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        taxLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        paymentField = new javax.swing.JTextField();
        changeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        payComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkOutButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addGap(10, 10, 10)
                .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                        .addComponent(outNameLabel)
                        .addGap(61, 61, 61)
                        .addComponent(outNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                        .addComponent(outLicenseLabel)
                        .addGap(4, 4, 4)
                        .addComponent(outLicenseField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                        .addComponent(outPhoneLabel)
                        .addGap(10, 10, 10)
                        .addComponent(outPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                        .addComponent(outPenaltyLabel)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(outPenalthField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        outCustomerInfoPanelLayout.setVerticalGroup(
            outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                        .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(outPhoneLabel))
                            .addComponent(outPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outPenaltyLabel)
                            .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(outPenalthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                        .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(outNameLabel))
                            .addComponent(outNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(outCustomerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(outCustomerInfoPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(outLicenseLabel))
                            .addComponent(outLicenseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );

        buttonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        removeItemButton.setText("Remove Item");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        outCIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outCIdFieldKeyTyped(evt);
            }
        });

        PenaltyField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        PenaltyField.setText("0.00");

        penaltyButton.setText("Add Penalty");
        penaltyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penaltyButtonActionPerformed(evt);
            }
        });

        DiscountBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Discount", "Discount 1" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("$");

        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        outCIdLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        outCIdLabel.setText("Customer ID:");

        DiscountButton.setText("Add Discount");

        outOkButton.setText("OK");
        outOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outOkButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Barcode:");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(outCIdLabel)
                        .addGap(14, 14, 14)
                        .addComponent(outCIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(outOkButton))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PenaltyField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                            .addComponent(addItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(DiscountBox, 0, 135, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DiscountButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(penaltyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(removeItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(outCIdLabel))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(outCIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(outOkButton))
                .addGap(11, 11, 11)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeItemButton)
                    .addComponent(addItemButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiscountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penaltyButton))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(PenaltyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(DiscountButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Barcode", "Description", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactionScrollPane.setViewportView(transactionTable);
        transactionTable.getColumnModel().getColumn(0).setResizable(false);
        transactionTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        transactionTable.getColumnModel().getColumn(1).setResizable(false);
        transactionTable.getColumnModel().getColumn(1).setPreferredWidth(3);
        transactionTable.getColumnModel().getColumn(2).setResizable(false);
        transactionTable.getColumnModel().getColumn(2).setPreferredWidth(1);

        TaxtField.setEditable(false);
        TaxtField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        TaxtField.setText("0.00");

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        totalLabel.setText("Total");

        totalField.setEditable(false);
        totalField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        totalField.setText("0.00");

        taxLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taxLabel.setText("HST");

        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalLabel)
                            .addComponent(taxLabel))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TaxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(transactionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transactionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TaxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(totalLabel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Payment:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Change:");

        payComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Credit Card", "Debit Card" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Method:");

        jLabel7.setText("cents");

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(payComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeField))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(checkOutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetButton)
                    .addComponent(checkOutButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(outCustomerInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(outCustomerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                this.displayArea.setText("Customer Not Found!");
            }else{
                outNameField.setText(currCustomer.getFname()+" "+currCustomer.getLname());
                outPhoneField.setText(currCustomer.getPhoneNum());
                outLicenseField.setText(currCustomer.getDL());
            //outPenaltyField.setText(currCustomer);
                setTransaction( currCustomer, currEmp);
                lockInput(false);
            }
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

    private void penaltyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penaltyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penaltyButtonActionPerformed

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
       removeTransactionItem();
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
       addTransactionItem();
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
       processPayment();
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
       reset();
    }//GEN-LAST:event_ResetButtonActionPerformed


Action delete = new AbstractAction()
{
    public void actionPerformed(ActionEvent e)
    {
        JTable table = (JTable)e.getSource();
        int modelRow = Integer.valueOf( e.getActionCommand() );
        ((DefaultTableModel)table.getModel()).removeRow(modelRow);
    }
};


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DiscountBox;
    private javax.swing.JButton DiscountButton;
    private javax.swing.JTextField PenaltyField;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField TaxtField;
    private javax.swing.JButton addItemButton;
    private javax.swing.JTextField barcodeField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTextField changeField;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JComboBox payComboBox;
    private javax.swing.JTextField paymentField;
    private javax.swing.JButton penaltyButton;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JScrollPane transactionScrollPane;
    private javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables

    private void addTransactionItem() {
        try {
            System.out.println("inside gui addtransactionitem: " + barcodeField.getText());//testing
            transactionM.addMovie(barcodeField.getText());
            UpdateTable();
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CheckOutPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CheckOutPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MovieNotFoundException ex) {
            Logger.getLogger(CheckOutPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CheckOutPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     private void removeTransactionItem(){








     }


     private  String centsConverter(int num)
     {
         double aNum = (double)num/100;
         return ""+aNum;
     }


    private void UpdateTable() {

        DefaultTableModel table = (DefaultTableModel)transactionTable.getModel();

        Transaction currT = transactionM.getTransaction();
        for(int i = 1; i <= currT.getNumberOfItems(); i++){
            System.out.println("i = " + i);
            Vector row = new Vector <String>();
            row.add(currT.getItemBarcode(i));
            row.add(currT.getItemName(i));
            row.add(centsConverter(currT.getItemPrice(i)));
            table.addRow(row);
        }

        this.TaxtField.setText(centsConverter(currT.getTax()));
        this.totalField.setText(centsConverter(currT.getTotal()));

        table.fireTableStructureChanged();
        

    }

    private void processPayment() throws IllegalStateException{
        try {
            int pay = Integer.parseInt(paymentField.getText().trim());
            switch (payComboBox.getSelectedIndex()) {
                case 0:
                    double change = transactionM.pay("cash", pay);
                    this.changeField.setText(Double.toString(change));
                    displayArea.setText("Check Out Success!");
                    break;
                case 1:
                    paymentField.setEditable(false);
                    transactionM.pay("credit", pay);
                    changeField.setText("0.00");
                    displayArea.setText("Check Out Success!");

                    break;
                case 2:
                    paymentField.setEditable(false);
                    transactionM.pay("debit", pay);
                    changeField.setText("0.00");
                    displayArea.setText("Check Out Success!");

                default:
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CheckOutPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CheckOutPanel.class.getName()).log(Level.SEVERE, null, ex);
            displayArea.setText("Item not avaliable, please reset and try again. ");
        }
        

    }


 /**
 * Create an Transection
 * @param cust current customer class
 * @param emp  current employee class
 * @return transaction object
 * @pre Customer and Employee object exist
 * @post a new transaction object
 */
    private void setTransaction (Customer cust, Employee emp){
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

    private void lockInput(boolean lock){
    
        this.barcodeField.setEditable(!lock);
        this.addItemButton.setEnabled(!lock);
        this.removeItemButton.setEnabled(!lock);
        this.PenaltyField.setEditable(!lock);
        this.penaltyButton.setEnabled(!lock);
        this.DiscountBox.setEnabled(!lock);
        this.DiscountButton.setEnabled(!lock);
    }

    private void reset() {

        DefaultTableModel table = (DefaultTableModel)transactionTable.getModel();

        this.transactionM.abortTransaction();
        cleanUpInputs();
        lockInput(true);
        for(int i = 0; i < table.getRowCount(); i++){

            table.removeRow(i);
        }
        changeField.setText("0.00");
        paymentField.setText("");
        outCIdField.setText("");
        barcodeField.setText("");
        displayArea.setText("Reset Done");

    }

}
