/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bende
 */
public class EditPayment extends javax.swing.JFrame {

    /**
     * Creates new form EditPayment
     */
    public EditPayment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit_pay_lbl = new javax.swing.JLabel();
        payID_lbl = new javax.swing.JLabel();
        bookID_lbl = new javax.swing.JLabel();
        payment_textfield = new javax.swing.JTextField();
        booking_textfield = new javax.swing.JTextField();
        updatePay_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        new_amount_lbl = new javax.swing.JLabel();
        new_value_textfield = new javax.swing.JTextField();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        edit_pay_lbl.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        edit_pay_lbl.setText("Admin Edit Payment Page");

        payID_lbl.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        payID_lbl.setText("Payment ID:");

        bookID_lbl.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bookID_lbl.setText("Booking_ID:");

        payment_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        payment_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payment_textfieldKeyTyped(evt);
            }
        });

        booking_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        booking_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                booking_textfieldKeyTyped(evt);
            }
        });

        updatePay_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updatePay_btn.setText("Update");
        updatePay_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePay_btnActionPerformed(evt);
            }
        });

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        new_amount_lbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        new_amount_lbl.setText("New Payment Amount:");

        new_value_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        new_value_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                new_value_textfieldKeyTyped(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(edit_pay_lbl)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(new_amount_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(payID_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookID_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(payment_textfield)
                            .addComponent(booking_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(new_value_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(updatePay_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(edit_pay_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payment_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payID_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bookID_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(booking_textfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(new_amount_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_value_textfield))
                .addGap(18, 18, 18)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updatePay_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        AdminClass admin = new AdminClass();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void updatePay_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePay_btnActionPerformed
        String PaymentID = payment_textfield.getText();
        String BookingID = booking_textfield.getText();
        
        String changes = new_value_textfield.getText();
        
        if(changes.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Data Entered", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }else{
        
        int action = 0, line = 0;
        try {          
            File pay_file = new File("Payment.txt");
            Scanner scan_payment = new Scanner(pay_file);
            ArrayList<String> array_pay = new ArrayList<>();
            ArrayList<String> write_pay = new ArrayList<>();
            
            while(scan_payment.hasNextLine()){
                String each_line = scan_payment.nextLine();
                 line = line + 1;
                
                String[] each_pay_details = each_line.split("\n");
                String[] each_pay_det = each_pay_details[0].split("\t");
                
                //Get the payment id and booking id of each car 
                String pay = each_pay_det[0];
                String book = each_pay_det[1];
                String old_word = each_pay_det[4];

                //use for checking that line for Edit
                array_pay.add(each_pay_details[0]);

             

                if(PaymentID.equals(pay) && (BookingID.equals(book))){

                    action = 1; 
                    int new_num = line - 1;

                    //get the new payment value
                    String new_value = new_value_textfield.getText();
                    Double double_value = Double.valueOf(new_value);
                   
                    //convert back to string for double_value;
                    
                    String new_value1 = String.valueOf(double_value);
                    //System.out.println(array_pay);

                    String new_pay_details = (array_pay.get(new_num).replace(old_word, new_value1));
                    System.out.println(new_pay_details);
                    
                    //Crate write car for writing into Car.txt
                    write_pay.add(new_pay_details);
                    array_pay.set(new_num, new_pay_details);
                    

                    
                }else{
                    //array_pay.add(each_pay_det[0]);
                    write_pay.add(each_pay_details[0]);
                
                }
                
                //System.out.println(write_pay);
            }
            //System.out.println(array_pay);

            if(action == 1){
                JOptionPane.showMessageDialog(this, "Payment ID and Booking ID Record Exists!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
                updatePay_btn.setEnabled(false);
                //Write new car details back into the car.txt (overwrite)
                Path write_output = Paths.get("Payment.txt");
                for(int x = 0; x<write_pay.size(); x++){
                    //System.out.println(write_car.get(x));
                    
                    Files.write(write_output, write_pay);
                    
                }
                JOptionPane.showMessageDialog(this, "New Payment Details Updated", "Information Message", JOptionPane.INFORMATION_MESSAGE);

            
            }else{
                JOptionPane.showMessageDialog(this, "No Payment ID and Booking ID Found!", "Error Message", JOptionPane.ERROR_MESSAGE);

            }
            
            
        }catch (FileNotFoundException ex) {
            Logger.getLogger(EditCar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        }    
        
        
    }//GEN-LAST:event_updatePay_btnActionPerformed

    private void payment_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payment_textfieldKeyTyped
        char key = evt.getKeyChar();
        //check only allow number input
        if(!(Character.isDigit(key))){
            evt.consume();
            error.setText("Invalid Input " + key);
        }else{
            error.setText("");
        }
    }//GEN-LAST:event_payment_textfieldKeyTyped

    private void booking_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_booking_textfieldKeyTyped
        char key = evt.getKeyChar();
        //check only allow number input
        if(!(Character.isDigit(key))){
            evt.consume();
            error.setText("Invalid Input " + key);
        }else{
            error.setText("");
        }
    }//GEN-LAST:event_booking_textfieldKeyTyped

    private void new_value_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_value_textfieldKeyTyped
        char key = evt.getKeyChar();
        //check only allow number input
        if(!(Character.isDigit(key))){
            evt.consume();
            error.setText("Invalid Input " + key);
        }else{
            error.setText("");
        }
    }//GEN-LAST:event_new_value_textfieldKeyTyped

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
            java.util.logging.Logger.getLogger(EditPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bookID_lbl;
    private javax.swing.JTextField booking_textfield;
    private javax.swing.JLabel edit_pay_lbl;
    private javax.swing.JLabel error;
    private javax.swing.JLabel new_amount_lbl;
    private javax.swing.JTextField new_value_textfield;
    private javax.swing.JLabel payID_lbl;
    private javax.swing.JTextField payment_textfield;
    private javax.swing.JButton updatePay_btn;
    // End of variables declaration//GEN-END:variables
}
