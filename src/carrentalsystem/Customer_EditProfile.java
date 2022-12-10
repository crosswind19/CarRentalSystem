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
 * @author Crosswind Cheah
 */
public class Customer_EditProfile extends javax.swing.JFrame {
    
    public static String customerid_value;
    /**
     * Creates new form Customer_EditProfile
     */
    public Customer_EditProfile() {
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
        backBtn = new javax.swing.JButton();
        Customer_label = new javax.swing.JLabel();
        customerid_txt = new javax.swing.JTextField();
        details_selection = new javax.swing.JComboBox<>();
        changes_txt = new javax.swing.JTextField();
        update_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        header.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        header.setText("Customer Edit Profile");

        backBtn.setText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        Customer_label.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        Customer_label.setText("Customer ID ");

        customerid_txt.setEditable(false);
        customerid_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        customerid_txt.setText(customerid_value);
        customerid_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerid_txtKeyTyped(evt);
            }
        });

        details_selection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        details_selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Email", "Phone Number", "Address Street", "Address Poscode ", "Address City", "Address State" }));

        changes_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changes_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                changes_txtKeyTyped(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Customer_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(details_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changes_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(customerid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(header))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Customer_label, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(customerid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(details_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changes_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CustomerClass cl = new CustomerClass();
        cl.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void customerid_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerid_txtKeyTyped
        
    }//GEN-LAST:event_customerid_txtKeyTyped

    private void changes_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changes_txtKeyTyped
        
    }//GEN-LAST:event_changes_txtKeyTyped

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
       String cus_id = customerid_txt.getText();
       //String cus_id = test_txt.getText();
       String change_item = changes_txt.getText();
       String change_line = " ";
       String change_line2 = " ";
       int flag = 0 , cnt = 0;
       int changes = -1;
       
       Double changes_ele;
       String name;
       String email;
       String phoneno;
       String Street;
       String poscode;
       String City;
       String State;
       
       try{
          File read_cus = new File("Customer_Information.txt"); 
          
            Scanner scan_cus = new Scanner(read_cus);
            ArrayList<String> array_book = new ArrayList<>();
            ArrayList<String> write_book = new ArrayList();
            
            while(scan_cus.hasNextLine()){
                String get_line = scan_cus.nextLine();
                cnt += 1;
                
                String[] each_booking = get_line.split("\n");
                String[] each_element = each_booking[0].split("\t");
                
                //get cus id
                String cusID = each_element[0];
                
                
                
                //Get customer name
                String CusName = each_element[3];
                
                //Get customer email
                String CusEmail = each_element[5];
                
                //Get customer phone
                String CusPhoneno = each_element[6];
                
                //Gt street
                String CusStreet = each_element[7];
                
                //Get poscode
                String CusPoscode = each_element[8];
                
                //Get city
                String CusCity = each_element[9];
                
                //Get state
                String CusState = each_element[10];
                
                
               
                //System.out.println(each_element[4]);
                
                array_book.add(each_booking[0]);
                
                if(cus_id.equals(cusID)){
                   // JOptionPane.showMessageDialog(this, "Customer ID exist!");
                   
                   flag = 1;
                   int new_cnt = cnt - 1;
                   
                   changes = details_selection.getSelectedIndex();
                   ArrayList<String> edit_ele = new ArrayList<>();
                   ArrayList<String> write_ele = new ArrayList<>();
                   switch(changes){
                       //Name
                       case 0 -> {
                           if(change_item.matches("[a-zA-Z]+")){
                               String before_word = each_element[changes+3];
                               //System.out.println(before_word);
                               change_line = (each_element[0] +"\t"+ each_element[1] + "\t" + each_element[2] + "\t" + change_item +"\t" + each_element[4] +"\t" + each_element[5] +"\t" + each_element[6] +"\t" + each_element[7] +"\t" + each_element[8] +"\t" + each_element[9] +"\t" + each_element[10]);


                               //change_line = (array_book.get(new_cnt).replace(before_word,change_item));
                               
                           }else{
                               JOptionPane.showMessageDialog(this,"Error Format Found, No Changes Made!","Error Message",JOptionPane.ERROR_MESSAGE);
                               
                               String before_word = each_element[changes+3];
                               change_line = (array_book.get(new_cnt).replace(before_word,CusName));
                               flag = 0;
                           }
                       }
                       //Email
                       case 1 -> {
                           //email format
                           if(change_item.matches("^(.+)@(.+)$")){
                               String before_word = each_element[changes+4];
                               System.out.println(before_word);
                               System.out.println(before_word);
                               change_line = (each_element[0] +"\t"+ each_element[1] + "\t" + each_element[2] + "\t" + each_element[3] +"\t" + each_element[4] +"\t" + change_item +"\t" + each_element[6] +"\t" + each_element[7] +"\t" + each_element[8] +"\t" + each_element[9] +"\t" + each_element[10]);

                               //change_line = (array_book.get(new_cnt).replace(before_word,change_item));
                           }else{
                               JOptionPane.showMessageDialog(this,"This is not a valid email","Error Message",JOptionPane.ERROR_MESSAGE);
                               
                               String before_word = each_element[changes+4];
                               change_line = (array_book.get(new_cnt).replace(before_word,CusEmail));
                               flag = 0;
                           }
                       }
                       //Phone Number
                       case 2 ->{
                           //phone format
                           if(change_item.matches("^\\d{10}$")){
                               String before_word = each_element[changes+4];
                               System.out.println(before_word);
                               
                               change_line = (each_element[0] +"\t"+ each_element[1] + "\t" + each_element[2] + "\t" + each_element[3] +"\t" + each_element[4] +"\t" + each_element[5] +"\t" + change_item +"\t" + each_element[7] +"\t" + each_element[8] +"\t" + each_element[9] +"\t" + each_element[10]);
                               //change_line = (array_book.get(new_cnt).replace(before_word,change_item));
                           }else{
                               JOptionPane.showMessageDialog(this,"This is not a valid phone","Error Message",JOptionPane.ERROR_MESSAGE);
                               
                               String before_word = each_element[changes+4];
                               change_line = (array_book.get(new_cnt).replace(before_word,CusPhoneno));
                               flag = 0;
                           }
                           
                       }
                       
                      //Address Street
                       case 3 ->{
                           String before_word = each_element[changes+4];
                           System.out.println(before_word);
                           
                           change_line = (array_book.get(new_cnt).replace(before_word,change_item));
                          
                       }
                       //Address Poscode
                       case 4 -> {
                           cnt=1;
                           if(change_item.matches("^\\d{5}$")){
                               String before_word = each_element[changes+4];
                               System.out.println(before_word);
                               
                               change_line = (each_element[0] +"\t"+ each_element[1] + "\t" + each_element[2] + "\t" + each_element[3] +"\t" + each_element[4] +"\t" + each_element[5] +"\t" + each_element[6] +"\t" + change_item +"\t" + each_element[8] +"\t" + each_element[9] +"\t" + each_element[10]);
                               
                                   //change_line = (array_book.get(new_cnt).replace(before_word,change_item));
                                   
                           }else{
                               JOptionPane.showMessageDialog(this,"This is not a valid poscode","Error Message",JOptionPane.ERROR_MESSAGE);
                               
                               String before_word = each_element[changes+4];
                               change_line = (array_book.get(new_cnt).replace(before_word,CusPoscode));
                               
                               flag = 0;
                           }
                       }
                       //Address City
                       case 5 -> {
                           if(change_item.matches("[a-zA-Z]+")){
                               String before_word = each_element[changes+4];
                               System.out.println(before_word);
                               change_line = (each_element[0] +"\t"+ each_element[1] + "\t" + each_element[2] + "\t" + each_element[3] +"\t" + each_element[4] +"\t" + each_element[5] +"\t" + each_element[6] +"\t" + each_element[7] +"\t" + each_element[8] +"\t" + change_item +"\t" + each_element[10]);
                               
                               //change_line = (array_book.get(new_cnt).replace(before_word,change_item));
                           }else{
                               JOptionPane.showMessageDialog(this,"Error Format Found, No Changes Made!","Error Message",JOptionPane.ERROR_MESSAGE);
                               
                               String before_word = each_element[changes+4];
                               change_line = (array_book.get(new_cnt).replace(before_word,CusCity));
                               flag = 0;
                           }
                       }
                       //Address State
                       case 6 -> {
                           if(change_item.matches("[a-zA-Z]+")){
                               String before_word = each_element[changes+4];
                               
                               //System.out.println(before_word);
                               change_line = (each_element[0] +"\t"+ each_element[1] + "\t" + each_element[2] + "\t" + each_element[3] +"\t" + each_element[4] +"\t" + each_element[5] +"\t" + each_element[6] +"\t" + each_element[7] +"\t" + each_element[8] +"\t" + each_element[9] +"\t" + change_item);
                               
                               //change_line = (array_book.get(new_cnt).replace(before_word,change_item));
                           }else{
                               JOptionPane.showMessageDialog(this,"Error Format Found, No Changes Made!","Error Message",JOptionPane.ERROR_MESSAGE);
                               
                               String before_word = each_element[changes+4];
                               change_line = (array_book.get(new_cnt).replace(before_word,CusState));
                               flag = 0;
                           }
                       }
                       default -> {
                           
                       }
                   }
//                   if(cnt==0){
//                      
//                   }else if(cnt == 1){
//                       write_book.add(change_line2); 
//                   }else{
//                       
//                   }
                   
                   write_book.add(change_line); 
                }
                else{
                    
                    write_book.add(each_booking[0]);
                }
                
                
                
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(this, "Updating Completed!", "Information Message", JOptionPane.INFORMATION_MESSAGE);

                    update_btn.setEnabled(false);
                    //write into booking textfile
                    Path write_to_file = Paths.get("Customer_Information.txt");
                    for(int y=0; y<write_book.size(); y++){
                        Files.write(write_to_file, write_book);
                    }
            }else{
                JOptionPane.showMessageDialog(this, "Please Try Again!", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
       
       
       } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer_EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Customer_EditProfile.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Customer_EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Customer_label;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField changes_txt;
    private javax.swing.JTextField customerid_txt;
    private javax.swing.JComboBox<String> details_selection;
    private javax.swing.JLabel header;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
