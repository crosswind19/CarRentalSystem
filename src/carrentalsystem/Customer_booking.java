/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Crosswind Cheah
 */
public class Customer_booking extends javax.swing.JFrame {
    
    public Customer customer;
    
    
    
    public static String customerid_value;

    /**
     * Creates new form Customer_booking
     */
    public Customer_booking() {
        initComponents();
         jButton1.doClick();
         jButton1.setVisible(false);
       
        
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        booking_back_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        choose_car_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        car_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        brand = new javax.swing.JLabel();
        cusID_textfield = new javax.swing.JTextField();
        model = new javax.swing.JLabel();
        cusName_textfield = new javax.swing.JTextField();
        confirm_booking_btn = new javax.swing.JButton();
        brand1 = new javax.swing.JLabel();
        cusID_textfield1 = new javax.swing.JTextField();
        model1 = new javax.swing.JLabel();
        cusName_textfield1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Customer Booking");

        booking_back_btn.setText("Back");
        booking_back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_back_btnActionPerformed(evt);
            }
        });

        choose_car_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car_Brand", "Car Model", "Rent_Price"
            }
        ));
        jScrollPane1.setViewportView(choose_car_table);

        car_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Car_Brand", "Car_Model", "Car_Type", "Number_Plate", "Car_Gear", "Passenger_Occupancy", "Fuel_Type", "Travel_Distance", "Car_cc", "Manufacture_Year", "Serial_Number", "Engine_ID", "Engine_Type", "Car_HP", "Rent_Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        car_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(car_table);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        brand.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        brand.setText("Customer ID:");

        cusID_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cusID_textfield.setText(customerid_value);
        cusID_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusID_textfieldActionPerformed(evt);
            }
        });

        model.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        model.setText("Customer Name:");

        cusName_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        confirm_booking_btn.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        confirm_booking_btn.setText("Confirm Booking");
        confirm_booking_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_booking_btnActionPerformed(evt);
            }
        });

        brand1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        brand1.setText("Vehicle ID:");

        cusID_textfield1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cusID_textfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusID_textfield1ActionPerformed(evt);
            }
        });

        model1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        model1.setText("Vehicle Name:");

        cusName_textfield1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(booking_back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brand, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(model, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cusID_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(cusName_textfield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brand1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(model1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cusID_textfield1)
                            .addComponent(cusName_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirm_booking_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(booking_back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brand)
                            .addComponent(cusID_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusName_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brand1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cusID_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusName_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(confirm_booking_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booking_back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_back_btnActionPerformed
        // TODO add your handling code here:
        CustomerClass back = new CustomerClass();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_booking_back_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
            //Customer booking = new Customer(2);
           //
        //System.out.println("Test " + customer.toString());
        
      
        
            File read_car_detailss = new File("Car.txt");
        try {
            BufferedReader read_cars = new BufferedReader(new FileReader(read_car_detailss));
            String each_car_lines = read_cars.readLine();
            //System.out.println(each_car_line);
            //display in table form (car details)
            DefaultTableModel show_car_detailss = (DefaultTableModel)car_table.getModel();

                 
            
            Object[] car_info = read_cars.lines().toArray();

            
            for(int i=0; i<car_info.length; i++){
                
                String car_line = car_info[i].toString();
                System.out.println(car_line);
                String get_all_data[] = car_line.split("\t");

                if(get_all_data[16].equals("Available")){
                    show_car_detailss.addRow(get_all_data);
                }
            }
     
            
        
        
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cusID_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusID_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusID_textfieldActionPerformed

    private void confirm_booking_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_booking_btnActionPerformed

       
        

    }//GEN-LAST:event_confirm_booking_btnActionPerformed

    private void cusID_textfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusID_textfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusID_textfield1ActionPerformed

    private void car_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)car_table.getModel();
        int selectedRow = car_table.getSelectedRow();
        
        //temp data
        String tempcarid = model.getValueAt(selectedRow,0).toString();
        
        
       
        
    }//GEN-LAST:event_car_tableMouseClicked

    /**
     * @param args the command line arguments
     */
    

   
    public static void main(String args[]) throws IOException{
        
        
        
        
        //Create Array and insert from txt file
        List<String> car_list = new ArrayList<>();
        List<String> customer_list = new ArrayList<>();
        BufferedReader car = new BufferedReader(new FileReader("car.txt"));
        BufferedReader customer = new BufferedReader(new FileReader("Customer_Information.txt"));
        
        String cline = car.readLine();
        String cusline = customer.readLine();
        
        while(cline!=null){
            car_list.add(cline);
            cline=car.readLine();
        }
        
        while(cusline!=null){
            customer_list.add(cusline);
            cusline=customer.readLine();
        }
        
        car.close();
        customer.close();
        
        String[]cararray = car_list.toArray(new String[0]);
        String[]customerarray = customer_list.toArray(new String[0]);
        
        for(String str:cararray){
            
          //  System.out.println(str);
        }

             File read_car_detailss = new File("Car.txt");
        try {
            BufferedReader read_cars = new BufferedReader(new FileReader(read_car_detailss));
            String each_car_lines = read_cars.readLine();
            //System.out.println(each_car_line);
            //display in table form (car details)
                        //DefaultTableModel show_car_details = (DefaultTableModel)car_table.getModel();

                 
            
            Object[] car_info = read_cars.lines().toArray();


            for(int i=0; i<car_info.length; i++){
                String car_line = car_info[i].toString();
                System.out.println(car_line);
                String get_all_data[] = car_line.split("\t");

                
                //show_car_detailss.addRow(get_all_data);
            }
        
        
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
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
            java.util.logging.Logger.getLogger(Customer_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booking_back_btn;
    private javax.swing.JLabel brand;
    private javax.swing.JLabel brand1;
    private javax.swing.JTable car_table;
    private javax.swing.JTable choose_car_table;
    private javax.swing.JButton confirm_booking_btn;
    private javax.swing.JTextField cusID_textfield;
    private javax.swing.JTextField cusID_textfield1;
    private javax.swing.JTextField cusName_textfield;
    private javax.swing.JTextField cusName_textfield1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel model;
    private javax.swing.JLabel model1;
    // End of variables declaration//GEN-END:variables
}
