/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import Class.Admin;
import Class.Login;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class ManageAdminAcc extends javax.swing.JFrame {


    /**
     * Creates new form ManageAdmin
     */
    public ManageAdminAcc() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        username_admin = new javax.swing.JTextField();
        password_admin = new javax.swing.JTextField();
        position_admin = new javax.swing.JTextField();
        add_admin = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Manage Admin Panel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Position:");

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        username_admin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        username_admin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                username_adminKeyTyped(evt);
            }
        });

        password_admin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password_admin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password_adminKeyTyped(evt);
            }
        });

        position_admin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        position_admin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                position_adminKeyTyped(evt);
            }
        });

        add_admin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        add_admin.setText("Add");
        add_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_adminActionPerformed(evt);
            }
        });

        edit_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(password_admin)
                                    .addComponent(position_admin)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(add_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password_admin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(position_admin))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        AdminClass admin = new AdminClass();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void username_adminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_adminKeyTyped
        char key_entered = evt.getKeyChar();
        // only allow number and alphabetic character
        if(!(Character.isAlphabetic(key_entered)) && (!(Character.isDigit(key_entered)))){
            evt.consume();  
        }
    }//GEN-LAST:event_username_adminKeyTyped

    private void password_adminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_adminKeyTyped
        char key_entered = evt.getKeyChar();
        // only allow number and alphabetic character
        if(!(Character.isAlphabetic(key_entered)) && (!(Character.isDigit(key_entered)))){
            evt.consume();  
        }
    }//GEN-LAST:event_password_adminKeyTyped

    private void position_adminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_position_adminKeyTyped
        char key = evt.getKeyChar();
        //check input is it contains special characters       
      if(!(Character.isAlphabetic(key)) && (!(key == KeyEvent.VK_COMMA))){
          evt.consume();
      } 
    }//GEN-LAST:event_position_adminKeyTyped

    private void add_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_adminActionPerformed
        edit_btn.setEnabled(false);
        String admin_username = username_admin.getText();
        String admin_password = password_admin.getText();
        String admin_position = position_admin.getText();

        int action=0;
        String combine_details = (admin_username + "\t" + admin_password + "\t "+ admin_position + "\n");
        
        //check if username exist
        
            //Check if the serial number in the text file
            File read_admin_file = new File("Admin_account.txt");
                try {
                    
                    Scanner scan_admin = new Scanner(read_admin_file);
                    while(scan_admin.hasNextLine()){

                        //read whole data from textfile
                        String admin_data = scan_admin.nextLine();
                        String admin_split[] = admin_data.split("\t");
                        
                            
                        //Get the Car Manufacture Serial Number Column
                       if(admin_username.equals(admin_split[0])){

                           JOptionPane.showMessageDialog(this, "Record of Username Found!", "Error Message", JOptionPane.ERROR_MESSAGE);
                           
                       }else{
                           action=1;
                       }
                        
                    }
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            //write to admin account file
            //write into textfile
            try{
            FileOutputStream append_admin_details = new FileOutputStream("Admin_account.txt", true);

            //convert string to bytes
            byte[] byte_details = combine_details.getBytes(); 
            append_admin_details.write(byte_details);

            JOptionPane.showMessageDialog(this, "New " + admin_position + " Added Successfully!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
            append_admin_details.close();
            add_admin.setEnabled(false);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error Found While Writing", "Information Message", JOptionPane.INFORMATION_MESSAGE);

            }
    }//GEN-LAST:event_add_adminActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        add_admin.setEnabled(false);
        String edit_username = username_admin.getText();
        String edit_password = password_admin.getText();
        String edit_position = position_admin.getText();    
        int new_num=0;
        
        int action = 0, line = 0;
        try {          
            File AdminAcc_file = new File("Admin_account.txt");
            Scanner scan_admin = new Scanner(AdminAcc_file);
            ArrayList<String> array_admin = new ArrayList<>();
            ArrayList<String> write_admin = new ArrayList<>();
            
            while(scan_admin.hasNextLine()){
                String each_line = scan_admin.nextLine();
                 line = line + 1;
                
                String[] each_admin_details = each_line.split("\n");
                String[] each_admin_det = each_admin_details[0].split("\t");
                
                //Get the payment id and booking id of each car 
                String user = each_admin_det[0];
                String pass = each_admin_det[1];
                String position = each_admin_det[2];

                //use for checking that line for Edit
                array_admin.add(each_admin_details[0]);

             
                //use for update password or position
                if(edit_username.equals(user)){

                    action = 1; 
                    new_num = line - 1;

                    //get the new payment value
                    String new_pass = edit_password;
                    String new_position = edit_position;                   
                    String new_admin_details = (array_admin.get(new_num).replace(pass, new_pass)); 
                    String new_info = new_admin_details.replace(position, edit_position);
                    //Crate write car for writing into Car.txt
                    write_admin.add(new_info);
                    array_admin.set(new_num, new_info);
                }else{
                    //array_pay.add(each_pay_det[0]);
                    write_admin.add(each_admin_details[0]);
                
                }

              
            }
                //System.out.println(write_admin.remove(line));
                System.out.println(write_admin);


            if(action == 1){
                edit_btn.setEnabled(false);
                //Write new car details back into the car.txt (overwrite)
                Path write_output = Paths.get("Admin_account.txt");
                for(int x = 0; x<write_admin.size(); x++){
                    //System.out.println(write_car.get(x));
                    
                    Files.write(write_output, write_admin);
                    
                }
                JOptionPane.showMessageDialog(this, "Updated Admin Information!", "Information Message", JOptionPane.INFORMATION_MESSAGE);

            
            }else{
                JOptionPane.showMessageDialog(this, "No Username Found!", "Error Message", JOptionPane.ERROR_MESSAGE);

            }
            
            
        }catch (FileNotFoundException ex) {
            Logger.getLogger(EditCar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        
                
    }//GEN-LAST:event_edit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageAdminAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAdminAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAdminAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAdminAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAdminAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_admin;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField password_admin;
    private javax.swing.JTextField position_admin;
    private javax.swing.JTextField username_admin;
    // End of variables declaration//GEN-END:variables
}