/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import Class.Booking;
import Class.Payment;
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
public class DeletePayment extends javax.swing.JFrame {

    /**
     * Creates new form DeletePayment
     */
    public DeletePayment() {
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

        delete_pay_lbl = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        pay_id_lbl = new javax.swing.JLabel();
        paymentid_textfield = new javax.swing.JTextField();
        delete_btn = new javax.swing.JButton();
        error_mess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        delete_pay_lbl.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        delete_pay_lbl.setText("Admin Delete Payment");

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        pay_id_lbl.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        pay_id_lbl.setText("Payment ID:");

        paymentid_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        paymentid_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paymentid_textfieldKeyTyped(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        error_mess.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(delete_pay_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(pay_id_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentid_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(error_mess, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(delete_pay_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pay_id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentid_textfield))
                .addGap(18, 18, 18)
                .addComponent(error_mess, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        AdminClass admin = new AdminClass();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        
        String payid_value = paymentid_textfield.getText();
        String num = payid_value;
        String book_id="";
        int id=0, cnt=0;
        String cus_id;
        String get_booking_id="";
        String get_car_id = "";

        Payment pay = new Payment();
        Booking book = new Booking();

        try{
            File pay_file = new File("Payment.txt");
            Scanner scan_payment = new Scanner(pay_file);
            ArrayList<String> array_pay = new ArrayList<>();
            ArrayList<String> write_pay = new ArrayList<>();
            
            while(scan_payment.hasNextLine()){
                String each_line = scan_payment.nextLine();
                String[] each_pay_details = each_line.split("\n");
                String[] each_pay_det = each_pay_details[0].split("\t");
                
                if(payid_value.equals(each_pay_det[0])){
                    get_booking_id = each_pay_det[1];
                    get_car_id = each_pay_det[3];
                }

            }
        }catch(Exception e){
            
        }

        
        
        pay.setPaymentID(num);
        book.setId(id);
        book.setCarID(get_car_id);
        
        int ans = JOptionPane.showConfirmDialog(this, "Are You Sure To Delete this Payment Details with this ID?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(ans == JOptionPane.YES_OPTION){
            pay.setAction(1);
            pay.setAns(1);
            //delete in payment
            pay.doDeletePayment();
            //change car status back to available
            book.changeCarStatus();
            
        //change deleted status in booking
        String change_line = "";
        int flag = 0, counter = 0;
        int changes = -1;
        String rent;
        String CusName;
        
        try {
            File read_cus = new File("Booking.txt");

                Scanner scan_cus = new Scanner(read_cus);
                ArrayList<String> array_book = new ArrayList<>();
                ArrayList<String> write_book = new ArrayList<>();
                
                while(scan_cus.hasNextLine()){
                    String get_line = scan_cus.nextLine();
                    counter += 1;
                    
                    String[] each_booking = get_line.split("\n");
                    String[] each_element = each_booking[0].split("\t");
                    
                    //get the both id
                    String booking_id = each_element[0];
                    String cusID = each_element[1];
                    //will be used when non numeric value enter for rent price
                    rent = each_element[5];
                    //will be used when numeric value found
                    CusName = each_element[2];
                    
                    //System.out.println(booking_id + " "  +cusID);
                    array_book.add(each_booking[0]);
                    
                    if((get_booking_id.equals(each_element[0]))){
                        JOptionPane.showMessageDialog(this, "Booking ID Record Exists!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
     
                        flag = 1;
                        int new_cnt = counter - 1;


                        String before_word = each_element[6];

                        String new_pay_details = (array_book.get(new_cnt).replace(before_word, "Deleted"));
                       
                        write_book.add(new_pay_details);
                        
                    }
                    else{

                        //array_book.add(each_booking[0]);
                        write_book.add(each_booking[0]);
                    }
                }
                
                
                System.out.println(write_book);
                if(flag == 1){
                    JOptionPane.showMessageDialog(this, "Updating Completed!", "Information Message", JOptionPane.INFORMATION_MESSAGE);

                    //write into booking textfile
                    Path write_to_file = Paths.get("Booking.txt");
                    for(int y=0; y<write_book.size(); y++){
                        Files.write(write_to_file, write_book);
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Booking Record Not Found", "Error Message", JOptionPane.ERROR_MESSAGE);

                }
            

            } catch (FileNotFoundException ex) {
                Logger.getLogger(EditCusBooking.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EditCusBooking.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        //delete word change end here   
        delete_btn.setEnabled(false);
        }
        
        else if(ans == JOptionPane.NO_OPTION){

            
        }
        
        if(pay.getAction() != 1){
            JOptionPane.showMessageDialog(this, "Error Found!", "Information Message", JOptionPane.WARNING_MESSAGE);
            
            if(pay.getAns() != 1){
                JOptionPane.showMessageDialog(this, "No Changes Will Be Made!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
            
        }
        }else{
            if(pay.getAction() == 1){
                delete_btn.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Payment Details Updated Successfully!", "Information Message", JOptionPane.INFORMATION_MESSAGE);

        }
            
        }
        

  
        
    }//GEN-LAST:event_delete_btnActionPerformed

    private void paymentid_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentid_textfieldKeyTyped
        char key = evt.getKeyChar();
        //check only allow number input
        if(!(Character.isDigit(key))){
            evt.consume();
            error_mess.setText("Invalid Input " + key);
        }else{
            error_mess.setText("");
        }
    }//GEN-LAST:event_paymentid_textfieldKeyTyped

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
            java.util.logging.Logger.getLogger(DeletePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletePayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel delete_pay_lbl;
    private javax.swing.JLabel error_mess;
    private javax.swing.JLabel pay_id_lbl;
    private javax.swing.JTextField paymentid_textfield;
    // End of variables declaration//GEN-END:variables
}
