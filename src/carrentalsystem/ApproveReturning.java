/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import Class.Booking;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bende
 */
public class ApproveReturning extends javax.swing.JFrame {
    int int_jop = 0;
    /**
     * Creates new form ApproveReturning
     */
    public ApproveReturning() {
        initComponents();
    
    auto_click.doClick();
    auto_click.setVisible(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approve_header_lbl = new javax.swing.JLabel();
        auto_click = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        payment_table = new javax.swing.JTable();
        booking_lbl = new javax.swing.JLabel();
        bookingID = new javax.swing.JTextField();
        approve_btn = new javax.swing.JButton();
        cusid_lbl = new javax.swing.JLabel();
        cusID = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        approve_header_lbl.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        approve_header_lbl.setText("Admin Approve Returning Car");

        auto_click.setText("jButton1");
        auto_click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auto_clickActionPerformed(evt);
            }
        });

        payment_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking_ID", "Customer_ID", "Customer_Name", "Car_ID", "Car_Name", "Rent_Price", "Booking_Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        payment_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payment_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(payment_table);

        booking_lbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        booking_lbl.setText("Booking ID:");

        bookingID.setEditable(false);
        bookingID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        approve_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        approve_btn.setText("Approve Returned");
        approve_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approve_btnActionPerformed(evt);
            }
        });

        cusid_lbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cusid_lbl.setText("Customer ID:");

        cusID.setEditable(false);
        cusID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(approve_header_lbl)
                        .addGap(65, 65, 65)
                        .addComponent(auto_click)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cusid_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(booking_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookingID)
                            .addComponent(cusID, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(approve_btn)
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(approve_header_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(auto_click)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(booking_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cusid_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(approve_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void auto_clickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auto_clickActionPerformed
    File read_pay_detailss = new File("Booking.txt");
        try {
            BufferedReader read_pay = new BufferedReader(new FileReader(read_pay_detailss));
            String each_payment_lines = read_pay.readLine();

            //display payment data
            DefaultTableModel showPayDetails = (DefaultTableModel)payment_table.getModel();

                 
            
            Object[] payment_data = read_pay.lines().toArray();

            
            for(int i=0; i<payment_data.length; i++){
                
                String pay_line = payment_data[i].toString();
                //System.out.println(car_line);
                String get_all_data[] = pay_line.split("\t");
                //System.out.println(get_all_data[6]);
                if(get_all_data[6].equals("Returning")){
                    showPayDetails.addRow(get_all_data);
                }
            }
     
            
        
        
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_auto_clickActionPerformed

    private void payment_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payment_tableMouseClicked
        DefaultTableModel showPayDetails = (DefaultTableModel)payment_table.getModel();
        int Row = payment_table.getSelectedRow();
        
        //get the booking id data & customer id data
        String booking_id = payment_table.getValueAt(Row,0).toString();
        String cus_id = payment_table.getValueAt(Row,1).toString();
        bookingID.setText(payment_table.getValueAt(Row,0).toString()); 
        cusID.setText(payment_table.getValueAt(Row,1).toString()); 

    }//GEN-LAST:event_payment_tableMouseClicked

    private void approve_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approve_btnActionPerformed
        String id_booking = bookingID.getText();
        String id_cus = cusID.getText();
        
        String car_id="";
        String car_status="";
        
        int action = 0, line = 0;
        try {          
            File book_file = new File("Booking.txt");
            Scanner scan_data = new Scanner(book_file);
            ArrayList<String> array_book = new ArrayList<>();
            ArrayList<String> write_book = new ArrayList<>();
            
            while(scan_data.hasNextLine()){
                String each_line = scan_data.nextLine();
                 line = line + 1;
                
                String[] each_book_details = each_line.split("\n");
                String[] each_book_det = each_book_details[0].split("\t");
                
                //Get the booking id for each record
                String book_id = each_book_det[0];
                //Get the customer id for each record 
                String cus_id = each_book_det[1];
                
                //use for getting car staus
                car_status = "not-Available";
                
                //use for checking that line for Edit
                array_book.add(each_book_details[0]);

                
                if((id_booking.equals(book_id)) && (id_cus.equals(cus_id))){
                    //use for changing car stauts
                    car_id = each_book_det[3];
                    
                    action = 1; 
                    int new_num = line - 1;
                    //show that changes line
                    String update_text = "Returned";  
                    //old word of "Returning" word
                    String old_word = each_book_det[6];
                    //System.out.println(array_book.get(line - 1));
                    String new_book_details = (array_book.get(new_num).replace(old_word, update_text));

                    //Crate write book for writing into Booking.txt
                    write_book.add(new_book_details);
                    array_book.set(new_num, new_book_details);
                    

                }else{
                    //array_book.add(each_book_details[0]);
                    write_book.add(each_book_details[0]);
                
                }

            }
                if(action == 1){
                JOptionPane.showMessageDialog(this, "Booking ID and Customer ID Record Exists!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
                approve_btn.setEnabled(true);
                //Write new car details back into the Booking.txt
                Path write_output = Paths.get("Booking.txt");
                for(int x = 0; x<write_book.size(); x++){
                    //System.out.println(write_book.get(x));
                    
                    Files.write(write_output, write_book);
                    
                }
                
                //changing car status to Available
                //int book_id = Integer.parseInt(id_booking);
                Return_Change_Status booking = new Return_Change_Status(id_booking, car_id, car_status);
                booking.setCarID(car_id);

                booking.changeCarStatus();
                
                JOptionPane.showMessageDialog(this, "Return Approved", "Information Message", JOptionPane.INFORMATION_MESSAGE);

                if(int_jop == 1){
                   JOptionPane.showMessageDialog(this, "Car Return Succesfully", "Information Message", JOptionPane.INFORMATION_MESSAGE);
 
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Booking and Customer ID Not Found", "Error Message", JOptionPane.ERROR_MESSAGE);

            }
                
            
            
            approve_btn.setEnabled(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EditCar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditCar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_approve_btnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        AdminClass admin = new AdminClass();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ApproveReturning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApproveReturning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApproveReturning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApproveReturning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveReturning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve_btn;
    private javax.swing.JLabel approve_header_lbl;
    private javax.swing.JButton auto_click;
    private javax.swing.JButton back;
    private javax.swing.JTextField bookingID;
    private javax.swing.JLabel booking_lbl;
    private javax.swing.JTextField cusID;
    private javax.swing.JLabel cusid_lbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable payment_table;
    // End of variables declaration//GEN-END:variables
}
