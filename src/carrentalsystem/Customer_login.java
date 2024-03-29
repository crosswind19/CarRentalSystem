/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import Class.Customer;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Customer_login extends javax.swing.JFrame {
    
//    public static String customer_details(String id){
//        return id;
//    }
   
    /**
     * Creates new form Customer_login
     */
    public Customer_login() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
    }
    
    public void CustomerLog(String logusername,String logname){
        try{
            FileOutputStream log = new FileOutputStream ("Customer_log.txt",true);
            String logrecord;
            
            DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime datetimenow = LocalDateTime.now();
            logrecord = ("\n" + time.format(datetimenow) + "\t" + logusername + "\t" + logname );
            byte[] log_details = logrecord.getBytes();
            
            log.write(log_details);
            
        }catch(IOException ex){
           // JOptionPane.showMessageDialog(Customer_login,"Anerror occur!","Error Message",JOptionPane.ERROR_MESSAGE);
        }
        

    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_cus_lbl = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        txt_cususername = new javax.swing.JTextField();
        pass_lbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();
        lbl_Register = new javax.swing.JLabel();
        txt_cuspassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        login_cus_lbl.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        login_cus_lbl.setText("Customer Login Page");

        username_lbl.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        username_lbl.setText("Username: ");

        txt_cususername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_cususername.setMinimumSize(new java.awt.Dimension(64, 30));

        pass_lbl.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        pass_lbl.setText("Password: ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        login_btn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        lbl_Register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Register.setText("Don't have an account? Click here to Register");
        lbl_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Register.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lbl_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_RegisterMouseClicked(evt);
            }
        });

        txt_cuspassword.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(login_cus_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(username_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pass_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cususername, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cuspassword, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lbl_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(login_cus_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cususername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pass_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_cuspassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(lbl_Register)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_cususername.setText("");
        txt_cuspassword.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        String tempid;
        String fname = "";
        String temp_username = "";
        Customer CustomerLog;
        int flag = 0;
        java.util.List<String> customer_credentials = new ArrayList<>();
        java.util.List<String> textfile_credentials = new ArrayList<>();
        String username_textfield_value = txt_cususername.getText();
        String password_textfield_value = new String(txt_cuspassword.getPassword());
       
        
        customer_credentials.add(username_textfield_value);
        customer_credentials.add(password_textfield_value);
        
        //System.out.println(staff_credentials);
       
       
        //login.setUsername(customer_credentials.get(0));
        //login.setPassword(customer_credentials.get(1));
        
        //inheritance (verifyuser to customer)
        
        Customer login = new Customer(); 
        
        login.setVerifyUsername(customer_credentials.get(0));
        login.setVerifyPassword(customer_credentials.get(1));
       
        
        //System.out.println(login.getVerifyUsername());
        
        try{
            File customer_information = new File("Customer_Information.txt");
            Scanner read_information = new Scanner(customer_information);
            while(read_information.hasNextLine()){
                String information = read_information.nextLine();
                String new_information[] = information.split("\t");
               // System.out.println(new_information[0]);
                textfile_credentials.add(new_information[0]);
                
                
                
                textfile_credentials.add(new_information[1]);
                textfile_credentials.add(new_information[2]);
                
                
                
                
                //System.out.println(textfile_credentials);
                if((login.getVerifyUsername().equals(new_information[1])) && (login.getVerifyPassword().equals(new_information[2]))){
                    temp_username = new_information[1];
                    fname = new_information[3];
                    flag = 1;
                    customer_credentials.add(new_information[0]);
                    //System.out.println(customer_credentials);
                    tempid = new_information[0];
                    login.setId(Integer.parseInt(new_information[0]));
                    login.setName(new_information[3]);
                    login_btn.setEnabled(false);
                    break;
                }else{
                    flag = 0;
                }
             
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(this, "Login Successful! " + login.getName() + "!" + "\nWelcome to Prestige Car Rental", "Rental Booking System", JOptionPane.INFORMATION_MESSAGE);
                CustomerClass main = new CustomerClass();
                main.cusername = txt_cususername.getText();
                main.setVisible(true);
                get_customerid(customer_credentials.get(2));
                get_customername(login.getName());
                
                System.out.println(login.getId());
                
                //String cusid = login.getId();
   
                //int tempcusid = Integer.parseInt();
                
                Customer_ViewBooking name = new Customer_ViewBooking();
                String passuser = username_textfield_value;
                //System.out.println(passuser);
             
                
                Customer_booking booking = new Customer_booking();
                
                
                
                //ogin.setId(tempcusid);

               
   
                //System.out.println("Test : " + login.getId());
                
                        
                CustomerLog(temp_username,fname);
                
                
                
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Login Failed! Please Try Again" , "Universal Resort Booking System", JOptionPane.WARNING_MESSAGE);
            }
            read_information.close();
        }catch (FileNotFoundException a){
            JOptionPane.showMessageDialog(this, "An error occur! File not Found", "Error Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void lbl_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegisterMouseClicked
        // TODO add your handling code here:
        
        Customer_register reg = new Customer_register() ;
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lbl_RegisterMouseClicked

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
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
            java.util.logging.Logger.getLogger(Customer_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
         
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_login().setVisible(true);
            }
        });
        
        
        
        
    }
    
    static void get_customerid(String id){
        String cus_id;
        cus_id=id;
        Customer_booking.customerid_value = cus_id;
        Customer_ViewBooking.customerid_value = cus_id;
        Customer_Payment.customerid_value = cus_id;
        Customer_EditProfile.customerid_value = cus_id;
        Customer_ReturnCar.customerid_value = cus_id;
    }
    
    static void get_customername(String name){
        String cus_name;
        cus_name = name;
        Customer_booking.customername_value = cus_name;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_Register;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel login_cus_lbl;
    private javax.swing.JLabel pass_lbl;
    private javax.swing.JPasswordField txt_cuspassword;
    private javax.swing.JTextField txt_cususername;
    private javax.swing.JLabel username_lbl;
    // End of variables declaration//GEN-END:variables

   
}
