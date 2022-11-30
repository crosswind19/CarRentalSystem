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
public class EditCusBooking extends javax.swing.JFrame {

    /**
     * Creates new form EditCusBooking
     */
    public EditCusBooking() {
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

        header = new javax.swing.JLabel();
        booking_combobox = new javax.swing.JComboBox<>();
        edit_textfield = new javax.swing.JTextField();
        booking_header = new javax.swing.JLabel();
        booking_id_textfield = new javax.swing.JTextField();
        update_btn = new javax.swing.JButton();
        bck_btn = new javax.swing.JButton();
        cus_header = new javax.swing.JLabel();
        cus_id_textfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        header.setText("Edit Customer Booking");

        booking_combobox.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        booking_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer_name", "Rent_Price" }));

        edit_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        booking_header.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        booking_header.setText("Booking ID:");

        booking_id_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        update_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        bck_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bck_btn.setText("Back");
        bck_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bck_btnActionPerformed(evt);
            }
        });

        cus_header.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        cus_header.setText("Customer ID:");

        cus_id_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bck_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booking_header, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(header)
                            .addComponent(cus_header)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(booking_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edit_textfield)
                            .addComponent(booking_id_textfield)
                            .addComponent(cus_id_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bck_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(booking_header, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booking_id_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cus_id_textfield)
                    .addComponent(cus_header, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(booking_combobox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bck_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bck_btnActionPerformed
        AdminClass admin = new AdminClass();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_bck_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        //only allow update the customer name and rent price
        String changes_item = edit_textfield.getText();
        String cus_id = cus_id_textfield.getText();
        String book_id = booking_id_textfield.getText();
        String change_line = "";
        int flag = 0, cnt = 0;
        int changes = -1;
        
        
        try {
            File read_cus = new File("Booking.txt");

                Scanner scan_cus = new Scanner(read_cus);
                ArrayList<String> array_book = new ArrayList<>();
                ArrayList<String> write_book = new ArrayList<>();
                
                while(scan_cus.hasNextLine()){
                    String get_line = scan_cus.nextLine();
                    cnt += 1;
                    
                    String[] each_booking = get_line.split("\n");
                    String[] each_element = each_booking[0].split("\t");
                    
                    //get the both id
                    String booking_id = each_element[0];
                    String cusID = each_element[1];
                    //System.out.println(booking_id + " "  +cusID);
                    array_book.add(each_booking[0]);
                    
                    if((cus_id.equals(cusID) && (booking_id.equals(book_id)))){
                        JOptionPane.showMessageDialog(this, "Booking ID with Customer ID Record Exists!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
     
                        flag = 1;
                        int new_cnt = cnt - 1;
                        //System.out.println(new_cnt);
                       changes = booking_combobox.getSelectedIndex();
                        //System.out.println(changes);
                        switch (changes) {
                            case 0 ->                                 {
                                    String before_word = each_element[changes+2];
                                    //System.out.println(each_element[changes+4]);
                                    change_line = (array_book.get(new_cnt).replace(before_word, changes_item));
                                }
                            case 1 ->                                 {
                                    String before_word = each_element[changes+4];
                                    Double changes_ele = Double.parseDouble(changes_item);
                                    String string_changes_ele = String.valueOf(changes_ele);
                                    change_line = (array_book.get(new_cnt).replace(before_word, string_changes_ele));
                                }
                            default -> {
                            }
                        }
                       
                        write_book.add(change_line);
                        
                    }
                    else{

                        //array_book.add(each_booking[0]);
                        write_book.add(each_booking[0]);
                    }
                }
            
            
                if(flag == 1){
                    JOptionPane.showMessageDialog(this, "Updating Completed!", "Information Message", JOptionPane.INFORMATION_MESSAGE);

                    update_btn.setEnabled(false);
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
        
        
        
        
        
    }//GEN-LAST:event_update_btnActionPerformed

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
            java.util.logging.Logger.getLogger(EditCusBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCusBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCusBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCusBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCusBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bck_btn;
    private javax.swing.JComboBox<String> booking_combobox;
    private javax.swing.JLabel booking_header;
    private javax.swing.JTextField booking_id_textfield;
    private javax.swing.JLabel cus_header;
    private javax.swing.JTextField cus_id_textfield;
    private javax.swing.JTextField edit_textfield;
    private javax.swing.JLabel header;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
