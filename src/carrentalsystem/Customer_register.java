/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Crosswind Cheah
 */
public class Customer_register extends javax.swing.JFrame {
    
    private String username;
    private String password;
    private Customer customer;

    File f = new File("customer.txt");
    int line;
    
    public Customer_register() {
        initComponents();
       // this.setLocationRelativeTo(null);// center form in the screen
    }

    void createFolder()
    {
        if(!f.exists())
        {
            f.mkdirs();
        }
    }
    
    void readFile()
    {
        try {
            FileReader fr = new FileReader(f+"customer.txt");System.err.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f+"logins.txt");
                System.out.println("File Created");
            } catch (IOException ex1) {
                Logger.getLogger(Customer_register.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    void addData(String name,String gender,String PhoneNo,String email, String address)
    {
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt","rwd");
            for(int i=0;i<line;i++){
                raf.readLine();
            }
            raf.writeBytes("\r\n");
            raf.writeBytes("Username: " + name + "\r\n");
            raf.writeBytes("Password: " + gender + "\r\n");
            raf.writeBytes("Mail :" + PhoneNo + "\r\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer_register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(Customer_register.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_Username = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        lbl_Password = new javax.swing.JLabel();
        txt_Password = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        customer_username_reg1 = new javax.swing.JTextField();
        lbl_Gender = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        lbl_Phoneno = new javax.swing.JLabel();
        txt_PhoneNo = new javax.swing.JTextField();
        lbl_Address = new javax.swing.JLabel();
        cbox_gender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Address = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(875, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Customer Register Page");

        lbl_Username.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Username.setText("Username: ");

        txt_Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Username.setMinimumSize(new java.awt.Dimension(64, 30));

        lbl_Password.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Password.setText("Password: ");

        txt_Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Password.setMinimumSize(new java.awt.Dimension(64, 30));

        register_button.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        register_button.setText("Register");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setPreferredSize(new java.awt.Dimension(122, 38));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel4.setText("ID: ");

        lbl_Name.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Name.setText("Name: ");

        txt_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Name.setMinimumSize(new java.awt.Dimension(64, 30));

        customer_username_reg1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        customer_username_reg1.setMinimumSize(new java.awt.Dimension(64, 30));
        customer_username_reg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_username_reg1ActionPerformed(evt);
            }
        });

        lbl_Gender.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Gender.setText("Gender: ");

        lbl_Email.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Email.setText("Email: ");

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Email.setMinimumSize(new java.awt.Dimension(64, 30));

        lbl_Phoneno.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Phoneno.setText("Phone No: ");

        txt_PhoneNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_PhoneNo.setMinimumSize(new java.awt.Dimension(64, 30));

        lbl_Address.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Address.setText("Address: ");

        cbox_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~Please Select~", "Male", "Female" }));
        cbox_gender.setToolTipText("");
        cbox_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_genderActionPerformed(evt);
            }
        });

        txt_Address.setColumns(20);
        txt_Address.setRows(5);
        jScrollPane1.setViewportView(txt_Address);

        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customer_username_reg1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbl_Phoneno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(27, 27, 27)
                                                    .addComponent(txt_PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(34, 34, 34)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cbox_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txt_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lbl_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer_username_reg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_gender)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        
        String regex = "^(.+)@(.+)$";
        String regex1 = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Pattern digit = Pattern.compile(regex1);
        
        Matcher emailMatcher = pattern.matcher(txt_Email.getText());
        Matcher PhoneNoMatcher = digit.matcher(txt_PhoneNo.getText());
        
        
        if(txt_Username.getText() == null || txt_Password.getText() == null || txt_Name.getText() == null || txt_Address.getText() == null)
        {
            JOptionPane.showMessageDialog(null, "Cannot leave it empty", "Error Message" , JOptionPane.ERROR_MESSAGE);
        }
        else if(txt_PhoneNo.getText().length()<10 || txt_PhoneNo.getText().length()>10 )
        {
             JOptionPane.showMessageDialog(null, "Contact Number only contain 10 to 11 numberic without ' - ' ", "Error Message" , JOptionPane.ERROR_MESSAGE);
        }
        else if(PhoneNoMatcher.matches() == false)
        {
            JOptionPane.showMessageDialog(null, "Contact Number only contain numberic", "Error Message" , JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String name = txt_Name.getText();
            String gender = cbox_gender.getSelectedItem().toString();
            String PhoneNo = txt_PhoneNo.getText();
            String address = txt_Address.getText();
            String email = txt_Email.getText();
            
            Customer newcustomer = new Customer(name,gender,PhoneNo,email,address);
            
            
        }
        
    }//GEN-LAST:event_register_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_Username.setText("");
        txt_Password.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        Customer_login cl = new Customer_login();
        cl.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void customer_username_reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_username_reg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_username_reg1ActionPerformed

    private void cbox_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_genderActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        //System.exit(0);
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Customer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> cbox_gender;
    private javax.swing.JTextField customer_username_reg1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_Phoneno;
    private javax.swing.JLabel lbl_Username;
    private javax.swing.JButton register_button;
    private javax.swing.JTextArea txt_Address;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_PhoneNo;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}