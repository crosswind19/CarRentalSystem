/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import Class.Address;
import Class.Customer;
import Class.Login;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
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
    String customer_username;
    int ln;

    File f = new File("logins.txt");
    int line;
    
    public Customer_register() {
        initComponents();
       // this.setLocationRelativeTo(null);// center form in the screen
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register_header_lbl = new javax.swing.JLabel();
        lbl_Username = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        lbl_Password = new javax.swing.JLabel();
        txt_Password = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        lbl_Name = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        lbl_Gender = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txt_AddressPostal = new javax.swing.JTextField();
        lbl_Phoneno = new javax.swing.JLabel();
        txt_PhoneNo = new javax.swing.JTextField();
        lbl_Address = new javax.swing.JLabel();
        cbox_gender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Address = new javax.swing.JTextArea();
        Error_label = new javax.swing.JLabel();
        lbl_Address1 = new javax.swing.JLabel();
        lbl_Address2 = new javax.swing.JLabel();
        lbl_AddressState = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        txt_AddressCity = new javax.swing.JTextField();
        txt_AddressState = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 660));
        setResizable(false);

        register_header_lbl.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        register_header_lbl.setText("Customer Register Page");

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

        lbl_Name.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Name.setText("Name: ");

        txt_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Name.setMinimumSize(new java.awt.Dimension(64, 30));
        txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameActionPerformed(evt);
            }
        });
        txt_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NameKeyTyped(evt);
            }
        });

        lbl_Gender.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Gender.setText("Gender: ");

        lbl_Email.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Email.setText("Email: ");

        txt_AddressPostal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_AddressPostal.setMinimumSize(new java.awt.Dimension(64, 30));
        txt_AddressPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AddressPostalKeyTyped(evt);
            }
        });

        lbl_Phoneno.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Phoneno.setText("Phone No: ");

        txt_PhoneNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_PhoneNo.setMinimumSize(new java.awt.Dimension(64, 30));
        txt_PhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PhoneNoKeyTyped(evt);
            }
        });

        lbl_Address.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Address.setText("Address: ");

        cbox_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbox_gender.setToolTipText("");
        cbox_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_genderActionPerformed(evt);
            }
        });

        txt_Address.setColumns(20);
        txt_Address.setRows(5);
        jScrollPane1.setViewportView(txt_Address);

        Error_label.setForeground(new java.awt.Color(255, 0, 51));

        lbl_Address1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Address1.setText("Postal Code:");

        lbl_Address2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_Address2.setText("City:");

        lbl_AddressState.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl_AddressState.setText("State:");

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Email.setMinimumSize(new java.awt.Dimension(64, 30));
        txt_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EmailKeyTyped(evt);
            }
        });

        txt_AddressCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_AddressCity.setMinimumSize(new java.awt.Dimension(64, 30));
        txt_AddressCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AddressCityActionPerformed(evt);
            }
        });
        txt_AddressCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AddressCityKeyTyped(evt);
            }
        });

        txt_AddressState.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_AddressState.setMinimumSize(new java.awt.Dimension(64, 30));
        txt_AddressState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AddressStateActionPerformed(evt);
            }
        });
        txt_AddressState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AddressStateKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addComponent(lbl_Username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_AddressState, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Address2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Address1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_AddressCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_AddressState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_gender, 0, 234, Short.MAX_VALUE)
                            .addComponent(txt_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_AddressPostal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_PhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(register_header_lbl)))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(Error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(register_header_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_AddressPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Address1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Address2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_AddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_AddressState, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_AddressState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(Error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        
   
    int line = 1, action = 1;
        java.util.List<String> customer_credentials = new ArrayList<>();
        //check is the staff already registered
        customer_credentials.add(txt_Username.getText());
        customer_credentials.add(txt_Password.getText());
        
        File all_customer_information = new File("Customer_Information.txt");
        try(Scanner customer_info = new Scanner(all_customer_information)){
            while(customer_info.hasNextLine()){
                String info = customer_info.nextLine();
                line = line + 1;
                String new_information[] = info.split("\t");
                //System.out.println(new_information[1]);
                if((customer_credentials.get(0).equals(new_information[1]))){
                    action = 0;
                    break;
                }
                
            }
            
            if(action == 0){
                JOptionPane.showMessageDialog(this, "Username & Password Exist, Please Try Again!", "Error Message", JOptionPane.ERROR_MESSAGE);
                
            }else{
                
                 String details;        
                
                 
                //Aggreation
                String new_Address = txt_Address.getText(); 
                String new_Postal = txt_AddressPostal.getText();
                String new_City = txt_AddressCity.getText();
                String new_state = txt_AddressState.getText();
                
                Address add = new Address(new_Address,new_Postal,new_City,new_state);
                
                
                
                String new_customer_username;
                String new_customer_password;
                String new_customer_name;
                String new_gender;
                String new_email;
                String new_phoneno;
                
                
                new_customer_username = txt_Username.getText();
                new_customer_password = txt_Password.getText();
                new_customer_name = txt_Name.getText();
                new_email = txt_Email.getText();
                new_phoneno = txt_PhoneNo.getText();
                
                new_gender = cbox_gender.getSelectedItem().toString();
                Customer register = new Customer(new_customer_username,new_customer_password,line,new_customer_name,new_gender,new_email,new_phoneno,add);
                
               
                


//Customer new_register = new Customer(new_customer_username,new_customer_password);
                //Check Empty Field
                if((register.getVerifyUsername().length()>0) && (register.getVerifyPassword().length()>0) && (register.getName().length()>0) && (register.getGender().length()>0) && (register.getEmailAddress().length()>0) && (register.getPhoneNumber().length()>0) ){
                  //Username and Password cannot be the same
                  if(!register.getVerifyUsername().equals(register.getVerifyPassword()) && !register.getName().equals(register.getVerifyPassword())){
                      //Username and name cannot be the same
                   if(!register.getVerifyUsername().equals(register.getName())){
                       //Name cannot be the same as address
                     if(!register.getName().equals(register.address.getStreet()) && !register.getName().equals(register.address.getCity()) && !register.getName().equals(register.address.getState())){
                         //Username cannot be the same as address
                       if(!register.getVerifyUsername().equals(register.address.getStreet()) && !register.getVerifyUsername().equals(register.address.getCity()) && !register.getVerifyUsername().equals(register.address.getState())){
                           //Address Street, city and state cannot be the same
                         if(!register.address.getStreet().equals(register.address.getCity()) && !register.address.getStreet().equals(register.address.getState()) && !register.address.getCity().equals(register.address.getState()) ){
                            //Email Validation
                           if(register.getEmailAddress().matches("^(.+)@(.+)$")){
                            //Postal code must be 5 digit only
                         if(!(new_Postal.length() == 5)){
                            JOptionPane.showMessageDialog(this, "Error Found in Postal Code (Required: 5 Numbers)", "Error Message", JOptionPane.ERROR_MESSAGE);

                            }else{
                                //Phone number must 10 digit
                                if(!(new_phoneno.length() == 10)){
                                JOptionPane.showMessageDialog(this, "Error Found in Phone Number (Required: 10 Numbers)", "Error Message", JOptionPane.ERROR_MESSAGE);
                           
                                 }else{
                            
                        
                    
                            try{
                                FileOutputStream fw = new FileOutputStream("Customer_Information.txt", true);
                                //details = ("\n" + line + "\t" + new_customer_username + "\t" + new_customer_password + "\t" + new_customer_name + "\t" + new_gender + "\t" + new_email + "\t" + new_phoneno + "\t" + new_Address);
                                //convert string to bytes
                                //System.out.println(register.register());
                                byte[] byte_details = register.register().getBytes();

                                //Append into textfile
                                //System.out.println(byte_details);
                                fw.write(byte_details);
                                register_button.setEnabled(false);
                                JOptionPane.showMessageDialog(this, "Registered Successfull, Welcome to Prestige Car Rental!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
                                fw.close();

                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(this, "An Error Occur! Append File Error Found!", "Error Message", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                       }else{
                               JOptionPane.showMessageDialog(this, "Error Occur! Please enter a valid email!", "Error Message", JOptionPane.ERROR_MESSAGE);
                
                           }
                           
                       }else{
                           JOptionPane.showMessageDialog(this, "Error Occur! Address, State and City cannot be the same!", "Error Message", JOptionPane.ERROR_MESSAGE);
                
                       }
                   }else{
                         JOptionPane.showMessageDialog(this, "Error Occur! Username and Address cannot be the same!", "Error Message", JOptionPane.ERROR_MESSAGE);
                 
                    }
                         
                     }else{
                          JOptionPane.showMessageDialog(this, "Error Occur! Name and Address cannot be the same!", "Error Message", JOptionPane.ERROR_MESSAGE);
                 
                       }
                   }else{
                       JOptionPane.showMessageDialog(this, "Error Occur! Username and Name cannot be the same!", "Error Message", JOptionPane.ERROR_MESSAGE);
                
                   }
                  }else{
                      JOptionPane.showMessageDialog(this, "Error Occur! Username, name and Password cannot be the same!", "Error Message", JOptionPane.ERROR_MESSAGE);
                
                       }
                }else{
                    JOptionPane.showMessageDialog(this, "Error Occur! Please Fill up All The Field with Valid Input!", "Error Message", JOptionPane.ERROR_MESSAGE);
                
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "File Not Found, Please Try Again!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
            
        
        
    }//GEN-LAST:event_register_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_Username.setText("");
        txt_Password.setText("");
        txt_Name.setText("");
        txt_AddressPostal.setText("");
        txt_PhoneNo.setText("");
        txt_Address.setText("");
        cbox_gender.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        Customer_login cl = new Customer_login();
        cl.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void cbox_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_genderActionPerformed

    private void txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_NameActionPerformed

    private void txt_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NameKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();        
        //check input is it contains special characters       
      if(!(Character.isAlphabetic(key)) && (!(key == KeyEvent.VK_COMMA))){
          evt.consume();
          Error_label.setText("Name cannot be in numeric" + key);
      } else{
          Error_label.setText("");
      }
    }//GEN-LAST:event_txt_NameKeyTyped

    private void txt_PhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PhoneNoKeyTyped
        // TODO add your handling code here:
         char key = evt.getKeyChar();
        //check only allow number input
        if(!(Character.isDigit(key))){
            evt.consume();
        }
    }//GEN-LAST:event_txt_PhoneNoKeyTyped

    private void txt_AddressCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AddressCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddressCityActionPerformed

    private void txt_AddressStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AddressStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddressStateActionPerformed

    private void txt_EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EmailKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        //if(key.matches("^(.+)@(.+)$")){
            
        //}
    }//GEN-LAST:event_txt_EmailKeyTyped

    private void txt_AddressStateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AddressStateKeyTyped
        char key_entered = evt.getKeyChar();
        if(!(Character.isAlphabetic(key_entered)) && (!(Character.isDigit(key_entered)))){
            evt.consume();  
        }
    }//GEN-LAST:event_txt_AddressStateKeyTyped

    private void txt_AddressCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AddressCityKeyTyped
        char key_entered = evt.getKeyChar();
        if(!(Character.isAlphabetic(key_entered)) && (!(Character.isDigit(key_entered)))){
            evt.consume();  
        }
    }//GEN-LAST:event_txt_AddressCityKeyTyped

    private void txt_AddressPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AddressPostalKeyTyped
        char key = evt.getKeyChar();
        //check only allow number input
        if(!(Character.isDigit(key))){
            evt.consume();
        }
    }//GEN-LAST:event_txt_AddressPostalKeyTyped

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
    private javax.swing.JLabel Error_label;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> cbox_gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_Address1;
    private javax.swing.JLabel lbl_Address2;
    private javax.swing.JLabel lbl_AddressState;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_Phoneno;
    private javax.swing.JLabel lbl_Username;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel register_header_lbl;
    private javax.swing.JTextArea txt_Address;
    private javax.swing.JTextField txt_AddressCity;
    private javax.swing.JTextField txt_AddressPostal;
    private javax.swing.JTextField txt_AddressState;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_PhoneNo;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
