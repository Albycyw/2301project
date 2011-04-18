/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddNewTitleDialog.java
 *
 * in progress: Mitch 17 April
 * Created on Apr 12, 2011, 11:09:04 PM
 */

package ui;

import javax.swing.SpinnerNumberModel;
import javax.swing.JOptionPane;
import java.util.GregorianCalendar;
import inventory.*;
import java.sql.SQLException;

/**
 *
 * @author Kristan
 */
public class AddNewTitleDialog extends javax.swing.JDialog {

    /** Creates new form AddNewTitleDialog */
    public AddNewTitleDialog(java.awt.Frame parent, boolean modal) {
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

        titleTypeAddNewTitleLabel = new javax.swing.JLabel();
        yearTypeAddNewTitleLabel = new javax.swing.JLabel();
        infoTypeAddNewTitleLabel = new javax.swing.JLabel();
        titleAddNewTitleTextField = new javax.swing.JTextField();
        yearAddNewTitleSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionAddNewTitleTextArea = new javax.swing.JTextArea();
        CancelAddNewTitleButton = new javax.swing.JButton();
        saveAddNewTitleButton = new javax.swing.JButton();
        genreTypeAddNewTitleLabel = new javax.swing.JLabel();
        producerTypeAddNewTitleLabel = new javax.swing.JLabel();
        actorTypeAddNewTitleLabel = new javax.swing.JLabel();
        studioTypeAddNewTitleLabel = new javax.swing.JLabel();
        ratingTypeAddNewTitleLabel = new javax.swing.JLabel();
        lengthTypeAddNewTitleLabel = new javax.swing.JLabel();
        directorTypeAddNewTitleLabel = new javax.swing.JLabel();
        genreAddNewTitleTextField = new javax.swing.JTextField();
        producerAddNewTitleTextField = new javax.swing.JTextField();
        directorAddNewTitleTextField = new javax.swing.JTextField();
        actorsAddNewTitleTextField = new javax.swing.JTextField();
        studioAddNewTitleTextField = new javax.swing.JTextField();
        ratingAddNewTitleTextField = new javax.swing.JTextField();
        lengthAddNewTitleTextField = new javax.swing.JTextField();
        skuAddNewTitleLabel = new javax.swing.JLabel();
        mediaTypeAddNewTitleLabel = new javax.swing.JLabel();
        skuAddNewTitleTextField = new javax.swing.JTextField();
        mediaTypeAddNewTitleTextField = new javax.swing.JTextField();
        retailPriceAddNewTitleTextLabel = new javax.swing.JLabel();
        retailPriceAddNewTitleTextField = new javax.swing.JTextField();
        dollarSignAddNewTitleLabel = new javax.swing.JLabel();
        lengthLabelMinutesAddNewTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        titleTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        titleTypeAddNewTitleLabel.setText("Title");

        yearTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        yearTypeAddNewTitleLabel.setText("Year");

        infoTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        infoTypeAddNewTitleLabel.setText("Description");

        descriptionAddNewTitleTextArea.setColumns(20);
        descriptionAddNewTitleTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionAddNewTitleTextArea);

        CancelAddNewTitleButton.setText("Cancel");
        CancelAddNewTitleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAddNewTitleButtonActionPerformed(evt);
            }
        });

        saveAddNewTitleButton.setText("Save");
        saveAddNewTitleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAddNewTitleButtonActionPerformed(evt);
            }
        });

        genreTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        genreTypeAddNewTitleLabel.setText("Genre");

        producerTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        producerTypeAddNewTitleLabel.setText("Producer");

        actorTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        actorTypeAddNewTitleLabel.setText("Actors");

        studioTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        studioTypeAddNewTitleLabel.setText("Studio");

        ratingTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        ratingTypeAddNewTitleLabel.setText("Rating");

        lengthTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        lengthTypeAddNewTitleLabel.setText("Length");

        directorTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        directorTypeAddNewTitleLabel.setText("Director");

        lengthAddNewTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthAddNewTitleTextFieldActionPerformed(evt);
            }
        });

        skuAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        skuAddNewTitleLabel.setText("SKU");

        mediaTypeAddNewTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        mediaTypeAddNewTitleLabel.setText("Media Type");

        retailPriceAddNewTitleTextLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        retailPriceAddNewTitleTextLabel.setText("Retail Price");

        dollarSignAddNewTitleLabel.setText("$");

        lengthLabelMinutesAddNewTitle.setText("minutes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(titleTypeAddNewTitleLabel)
                        .addGap(92, 92, 92)
                        .addComponent(titleAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(skuAddNewTitleLabel)
                        .addGap(95, 95, 95)
                        .addComponent(skuAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(mediaTypeAddNewTitleLabel)
                        .addGap(52, 52, 52)
                        .addComponent(mediaTypeAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(yearTypeAddNewTitleLabel)
                        .addGap(91, 91, 91)
                        .addComponent(yearAddNewTitleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(genreTypeAddNewTitleLabel)
                        .addGap(86, 86, 86)
                        .addComponent(genreAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(producerTypeAddNewTitleLabel)
                        .addGap(69, 69, 69)
                        .addComponent(producerAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(directorTypeAddNewTitleLabel)
                        .addGap(74, 74, 74)
                        .addComponent(directorAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(actorTypeAddNewTitleLabel)
                        .addGap(83, 83, 83)
                        .addComponent(actorsAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(studioTypeAddNewTitleLabel)
                        .addGap(84, 84, 84)
                        .addComponent(studioAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ratingTypeAddNewTitleLabel)
                        .addGap(83, 83, 83)
                        .addComponent(ratingAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lengthTypeAddNewTitleLabel)
                        .addGap(81, 81, 81)
                        .addComponent(lengthAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lengthLabelMinutesAddNewTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(retailPriceAddNewTitleTextLabel)
                        .addGap(66, 66, 66)
                        .addComponent(dollarSignAddNewTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(retailPriceAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(infoTypeAddNewTitleLabel)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(saveAddNewTitleButton)
                        .addGap(33, 33, 33)
                        .addComponent(CancelAddNewTitleButton)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(titleTypeAddNewTitleLabel))
                    .addComponent(titleAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(skuAddNewTitleLabel))
                    .addComponent(skuAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(mediaTypeAddNewTitleLabel))
                    .addComponent(mediaTypeAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(yearTypeAddNewTitleLabel))
                    .addComponent(yearAddNewTitleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genreTypeAddNewTitleLabel)
                    .addComponent(genreAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(producerTypeAddNewTitleLabel)
                    .addComponent(producerAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directorTypeAddNewTitleLabel)
                    .addComponent(directorAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actorTypeAddNewTitleLabel)
                    .addComponent(actorsAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studioTypeAddNewTitleLabel)
                    .addComponent(studioAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ratingTypeAddNewTitleLabel)
                    .addComponent(ratingAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lengthTypeAddNewTitleLabel)
                    .addComponent(lengthAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lengthLabelMinutesAddNewTitle)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retailPriceAddNewTitleTextLabel)
                    .addComponent(dollarSignAddNewTitleLabel)
                    .addComponent(retailPriceAddNewTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoTypeAddNewTitleLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveAddNewTitleButton)
                    .addComponent(CancelAddNewTitleButton))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        yearAddNewTitleSpinner.setModel(new SpinnerNumberModel(2011, 1888, 3000, 1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method hides the dialog from view, if the user has hit the
     * cancel button.
     * @param evt
     */
    private void CancelAddNewTitleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAddNewTitleButtonActionPerformed
        //this.setVisible(false);
        dispose();
    }//GEN-LAST:event_CancelAddNewTitleButtonActionPerformed

    
    
    /**
     * This method takes the information from the fields and creates a new
     * GeneralMovie, inserting into the tables videoInfo, and physicalVideo
     * in the database
     * @param evt
     */
    private void saveAddNewTitleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAddNewTitleButtonActionPerformed
        try
        {
            String title = titleAddNewTitleTextField.getText();
            if (title == null || title.trim().length() < 1)
            {
                throw new IllegalArgumentException("Please enter a title");
            }
            else
            {
                title = title.trim();
            }
            
            String SKU = skuAddNewTitleTextField.getText();
            if (SKU == null || SKU.trim().length() < 1)
            {
                throw new IllegalArgumentException("Please enter a SKU");                
            }
            else
            {
                SKU = SKU.trim();
            }
            
            String format = mediaTypeAddNewTitleTextField.getText();
            if (format == null || format.trim().length() < 1)
            {
                throw new IllegalArgumentException("Please enter a format");
                
            }
            else
            {
                format = format.trim();
            }
            
            
            Integer year = (Integer) yearAddNewTitleSpinner.getValue(); // needs testing
            GregorianCalendar releaseDate = new GregorianCalendar(year,1,1);
            
            String genre = genreAddNewTitleTextField.getText();
            if (genre == null || genre.trim().length() < 1)
            {
                
                throw new IllegalArgumentException("Please enter a genre");
            }
            else
            {
                genre = genre.trim();
            }
            
            
            
            
            String producer = producerAddNewTitleTextField.getText();
            if (producer == null || producer.trim().length() < 1)
            {
                
                throw new IllegalArgumentException("Please enter a producer");
            }
            else
            {
                producer = producer.trim();
            }
            
            String director = directorAddNewTitleTextField.getText();
            if (director == null || director.trim().length() < 1)
            {
                
                throw new IllegalArgumentException("Please enter a director");
            }
            else
            {
                director = director.trim();
            }
            
            
            String actors = actorsAddNewTitleTextField.getText();
            String[] potentialActors =  actors.split(",");
            int numValidActors = 0;
            for (int i = 0; i < potentialActors.length; i++)
            {
                if (potentialActors[i] != null && potentialActors[i].trim().length() > 0)
                {
                    potentialActors[i] = potentialActors[i].trim();
                    numValidActors++;
                }
                else
                {
                    potentialActors[i] = null;
                }
            }
            if (numValidActors == 0)
            {
                
                throw new IllegalArgumentException("Please enter actors, separated by only one comma");
            }
            String[] validActors = new String[numValidActors];
            int validActorsIndex = 0;
            for (int i = 0; i < potentialActors.length; i++)
            {
                if (potentialActors[i] != null)
                {
                    validActors[validActorsIndex] = potentialActors[i];
                    validActorsIndex++;
                }
            }
            
            String studio = studioAddNewTitleTextField.getText();
            if (studio == null || studio.trim().length() < 1)
            {
                throw new IllegalArgumentException("Please enter a studio");

            }
            else
            {
                studio = studio.trim();
            }
            String rating = ratingAddNewTitleTextField.getText();
            if (rating == null || rating.trim().length() < 1)
            {

                throw new IllegalArgumentException("Please enter a rating");
            }
            else
            {
                rating = rating.trim();
            }
            
            int length = 0;
            String lengthString = lengthAddNewTitleTextField.getText();
            if (lengthString == null || lengthString.trim().length() < 1)
            {
                throw new IllegalArgumentException("Please enter a length.");
            }
            try
            {   
                lengthString = lengthString.trim();
                java.math.BigInteger bigLength = new java.math.BigInteger(lengthString);
                if (bigLength.compareTo(new java.math.BigInteger("" + Integer.MAX_VALUE)) == 1)
                {
                    throw new IllegalArgumentException("Number is too large.  Please enter a smaller number.");
                }
                length = Integer.parseInt(lengthString);
            }
            catch (NumberFormatException exception)
            {
                throw new IllegalArgumentException("Length must be a whole number.  Please only enter digits");
            }

            
            String retailPriceInDollarsString = retailPriceAddNewTitleTextField.getText();
            if (retailPriceInDollarsString == null || retailPriceInDollarsString.trim().length() < 1)
            {
                throw new IllegalArgumentException("Please enter a price");

            }
            else
            {
                retailPriceInDollarsString = retailPriceInDollarsString.trim();
            }
            
            int retailPriceInCents = 0;
            final int DOLLARS_FIELD = 0;
            final int CENTS_FIELD = 1;

            String[] splitRetailPriceInDollars = retailPriceInDollarsString.split("\\.");
            if (splitRetailPriceInDollars.length > 2)   // more . than dollars and cents
            {
                throw new IllegalArgumentException("You may only enter up to one decimal point");
            }
            if (splitRetailPriceInDollars.length < 2)
            {
                splitRetailPriceInDollars = new String[2];
                splitRetailPriceInDollars[DOLLARS_FIELD] = retailPriceInDollarsString;
                splitRetailPriceInDollars[CENTS_FIELD] = "0";
            }
            if (splitRetailPriceInDollars[CENTS_FIELD].length() > 2)
            {
                throw new IllegalArgumentException("You are limited to two digits for cents");
            }
            try
            {
                java.math.BigInteger dollars = new java.math.BigInteger(splitRetailPriceInDollars[DOLLARS_FIELD]);
                if (dollars.compareTo(new java.math.BigInteger("" + Integer.MAX_VALUE)) == 1)
                {
                    throw new IllegalArgumentException("Number is too large.  Please enter a smaller number.");
                }
                retailPriceInCents = Integer.parseInt(splitRetailPriceInDollars[DOLLARS_FIELD]) * 100;
                retailPriceInCents += Integer.parseInt(splitRetailPriceInDollars[CENTS_FIELD]);
            }
            catch (NumberFormatException exception)
            {
                throw new IllegalArgumentException("Retail price is a number.  Please enter only digits and one decimal point");
            }

            String synopsis = descriptionAddNewTitleTextArea.getText();
            if (synopsis == null || synopsis.trim().length() < 1)
            {
                
                throw new IllegalArgumentException("Please enter a synopsis");
            }
            else
            {
                synopsis = synopsis.trim();
            }
            

            /*
             * Constructor for GeneralMovie
             * public GeneralMovie
                (String SKU,
                String title,
                String[] actors,
                String director,
                String producer,
                GregorianCalendar releaseDate,
                String synopsis,
                String genre,
                String rating,
                String studio,
                int retailPriceInCents,
                String format,
                int runtime)
             */
            GeneralMovie movie = new GeneralMovie(SKU, title, validActors,
                    director, producer, releaseDate, synopsis, genre,
                    rating, studio, retailPriceInCents, format, length);
            MovieManagement.createGeneralMovie(movie); 
            
        } // end try
        /*
         catch (IllegalArgumentException exception)
        {
            if (exception.getMessage().equalsIgnoreCase("not a valid rating"))
            {
                .setText(exception.getMessage());
            }
            else
            {
                JOptionPane.showMessageDialog(null, exception.getMessage(), "", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (MovieExistsException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
        catch (ClassNotFoundException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
        catch (MovieLimitReachedException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }*/
        catch (Exception exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Please correct the following input", JOptionPane.ERROR_MESSAGE);
            //exception.printStackTrace(); // TODO: take this out owhen debugging is over
        }
    }//GEN-LAST:event_saveAddNewTitleButtonActionPerformed

    private void lengthAddNewTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthAddNewTitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthAddNewTitleTextFieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewTitleDialog dialog = new AddNewTitleDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton CancelAddNewTitleButton;
    private javax.swing.JLabel actorTypeAddNewTitleLabel;
    private javax.swing.JTextField actorsAddNewTitleTextField;
    private javax.swing.JTextArea descriptionAddNewTitleTextArea;
    private javax.swing.JTextField directorAddNewTitleTextField;
    private javax.swing.JLabel directorTypeAddNewTitleLabel;
    private javax.swing.JLabel dollarSignAddNewTitleLabel;
    private javax.swing.JTextField genreAddNewTitleTextField;
    private javax.swing.JLabel genreTypeAddNewTitleLabel;
    private javax.swing.JLabel infoTypeAddNewTitleLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lengthAddNewTitleTextField;
    private javax.swing.JLabel lengthLabelMinutesAddNewTitle;
    private javax.swing.JLabel lengthTypeAddNewTitleLabel;
    private javax.swing.JLabel mediaTypeAddNewTitleLabel;
    private javax.swing.JTextField mediaTypeAddNewTitleTextField;
    private javax.swing.JTextField producerAddNewTitleTextField;
    private javax.swing.JLabel producerTypeAddNewTitleLabel;
    private javax.swing.JTextField ratingAddNewTitleTextField;
    private javax.swing.JLabel ratingTypeAddNewTitleLabel;
    private javax.swing.JTextField retailPriceAddNewTitleTextField;
    private javax.swing.JLabel retailPriceAddNewTitleTextLabel;
    private javax.swing.JButton saveAddNewTitleButton;
    private javax.swing.JLabel skuAddNewTitleLabel;
    private javax.swing.JTextField skuAddNewTitleTextField;
    private javax.swing.JTextField studioAddNewTitleTextField;
    private javax.swing.JLabel studioTypeAddNewTitleLabel;
    private javax.swing.JTextField titleAddNewTitleTextField;
    private javax.swing.JLabel titleTypeAddNewTitleLabel;
    public javax.swing.JSpinner yearAddNewTitleSpinner;
    private javax.swing.JLabel yearTypeAddNewTitleLabel;
    // End of variables declaration//GEN-END:variables

}
