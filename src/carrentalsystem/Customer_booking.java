/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import Class.Booking;
import Class.Customer;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Crosswind Cheah
 */
public class Customer_booking extends javax.swing.JFrame {
    
    public Customer customer;
    public Booking booking;
    
    
    
    public static String customerid_value;
    public static String customername_value;

    /**
     * Creates new form Customer_booking
     */
    public Customer_booking() {
        initComponents();
         Auto_Click.doClick();
         Auto_Click.setVisible(false);
       
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        car_table = new javax.swing.JTable();
        Auto_Click = new javax.swing.JButton();
        brand = new javax.swing.JLabel();
        cusID_textfield = new javax.swing.JTextField();
        model = new javax.swing.JLabel();
        cusName_textfield = new javax.swing.JTextField();
        confirm_booking_btn = new javax.swing.JButton();
        brand1 = new javax.swing.JLabel();
        carId_txt = new javax.swing.JTextField();
        model1 = new javax.swing.JLabel();
        carName_txt = new javax.swing.JTextField();
        model2 = new javax.swing.JLabel();
        carDuration_txt = new javax.swing.JTextField();
        model3 = new javax.swing.JLabel();
        price_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        car_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Car_Brand", "Car_Model", "Car_Type", "Number_Plate", "Car_Gear", "Passenger_Occupancy", "Fuel_Type", "Travel_Distance", "Car_cc", "Manufacture_Year", "Serial_Number", "Engine_ID", "Engine_Type", "Car_HP", "Rent_Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
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

        Auto_Click.setText("jButton1");
        Auto_Click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_ClickActionPerformed(evt);
            }
        });

        brand.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        brand.setText("Customer ID:");

        cusID_textfield.setEditable(false);
        cusID_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cusID_textfield.setText(customerid_value);
        cusID_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusID_textfieldActionPerformed(evt);
            }
        });

        model.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        model.setText("Customer Name:");

        cusName_textfield.setEditable(false);
        cusName_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cusName_textfield.setText(customername_value);

        confirm_booking_btn.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        confirm_booking_btn.setText("Confirm Booking");
        confirm_booking_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_booking_btnActionPerformed(evt);
            }
        });

        brand1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        brand1.setText("Vehicle ID:");

        carId_txt.setEditable(false);
        carId_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        carId_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carId_txtActionPerformed(evt);
            }
        });

        model1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        model1.setText("Vehicle Name:");

        carName_txt.setEditable(false);
        carName_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        model2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        model2.setText("Days");

        carDuration_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        model3.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        model3.setText("Rent Duration");

        price_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setText("per day");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(booking_back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(Auto_Click)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(model1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(model3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addComponent(confirm_booking_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(carId_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carName_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carDuration_txt)
                                    .addComponent(price_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(model2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(booking_back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(Auto_Click))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(carId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carDuration_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(model3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirm_booking_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(price_lbl)
                        .addComponent(jLabel3)))
                .addGap(424, 424, 424))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booking_back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_back_btnActionPerformed
        // TODO add your handling code here:
        CustomerClass back = new CustomerClass();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_booking_back_btnActionPerformed

    private void Auto_ClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_ClickActionPerformed
            
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
                //System.out.println(car_line);
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
    }//GEN-LAST:event_Auto_ClickActionPerformed

    private void cusID_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusID_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusID_textfieldActionPerformed

    private void confirm_booking_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_booking_btnActionPerformed
        //Create booking id
        String not_available = "not-Available";
        
        //public Booking
        
        int line = 0;
        int pline = 0; 
        int action = 1;
        int index_bookingid = 0;
        List<String> booking_serial_list = new ArrayList<>();
        ArrayList<String> booking_id_list = new ArrayList<>();
        ArrayList<String> store_all_id = new ArrayList<>();
        String new_booking_id="";
        String new_payment_id="";
        
        
         if(carDuration_txt.getText().length()<=0){
             JOptionPane.showMessageDialog(null, "Please enter rent duration", "Error Message" , JOptionPane.ERROR_MESSAGE);
             
         }
         
        //Generate booking ID
        File get_booking_id = new File("Booking.txt");
        try(Scanner booking_id = new Scanner(get_booking_id)){
            while(booking_id.hasNextLine()){
                line = line + 1;
                String info = booking_id.nextLine();
                
                String new_information[] = info.split("\t");
                store_all_id.add(new_information[0]);
                
               // booking_id_list.add(new_information[0]);
//                System.out.println(booking_id_list);
                
//                System.out.println(line);
                
                //new_booking_id = Integer.toString(line);
                new_booking_id = String.valueOf(Integer.toString(line));
                
                
//                String new_line = String.valueOf(line);
//                
//                if(booking_id_list.contains(new_line)){
//                new_booking_id = (booking.getId() + 100);
//            }
                
            }

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //Ady in booking
        //Generate payment ID
        File get_payment_id = new File("Payment.txt");
        try(Scanner payment_id = new Scanner(get_payment_id)){
            while(payment_id.hasNextLine()){
                pline = pline + 1;
                String info = payment_id.nextLine();
                
                String new_information[] = info.split("\t");
                store_all_id.add(new_information[0]);
                
                new_payment_id = String.valueOf(Integer.toString(line));
                
                
            }

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       
        String cusid = cusID_textfield.getText();
        String cusname = cusName_textfield.getText();
        String carid = carId_txt.getText();
        String carname = carName_txt.getText();
        double duration = Double.parseDouble(carDuration_txt.getText());
        double rent = Double.parseDouble(price_lbl.getText());
        String rents = String.valueOf(duration * rent);
        String status = "Pending_for_approval";
        
        
        
        
        //starts here
        try {
            FileOutputStream file_booking_details = new FileOutputStream("Booking.txt",true);
            FileOutputStream file_payment_details = new FileOutputStream("Payment.txt",true);
            
            String booking_details;
            String payment_details;
            
            for(int number=0; number<store_all_id.size(); number++){
            if(store_all_id.contains(new_booking_id)){
                int update_id = Integer.parseInt(new_booking_id);
                update_id += 100;
                new_booking_id = String.valueOf(update_id);
            }
            }
            
            for(int number=0; number<store_all_id.size(); number++){
                if(store_all_id.contains(new_payment_id)){
                    int pupdate_id = Integer.parseInt(new_payment_id);
                    pupdate_id += 100;
                    new_payment_id = String.valueOf(pupdate_id);

            }
            }

           
            //write/create booking details
            booking_details = (new_booking_id + "\t" + cusid + "\t" + cusname + "\t" + carid + "\t" + carname + "\t" + rents + "\t" + status + "\n");
            
            
            
            byte[] booking = booking_details.getBytes();
            file_booking_details.write(booking);
            
            //write payment details
            payment_details = (new_payment_id + "\t" + new_booking_id + "\t" +  cusid + "\t" + carid + "\t" + rents + "\n");
            
            byte[] payment = payment_details.getBytes();
            file_payment_details.write(payment);

               
            
            //Write into booking and payment txt
            int okbooking = JOptionPane.showConfirmDialog(null,"Booking Successfully" + rents,"Information Message",JOptionPane.DEFAULT_OPTION);
            System.out.println("Exit");
            
            
                
            
            
            action = 1;
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Customer_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //change car status to not-available
        int flag = 0, cnt = 0;
        try {          
            File read_file = new File("Car.txt");
            Scanner scan_car = new Scanner(read_file);
            ArrayList<String> array_cars = new ArrayList<>();
            ArrayList<String> write_cars = new ArrayList<>();
            
            while(scan_car.hasNextLine()){
                String each_car = scan_car.nextLine();
                cnt = cnt + 1;
                
                String[] each_car_detail = each_car.split("\n");
                String[] each_car_dets = each_car_detail[0].split("\t");
                
                //Get car id and status of each car 
                String car_id_value = each_car_dets[0];
                String car_status = each_car_dets[16];

                //use for checking that line for Edit
                array_cars.add(each_car_detail[0]);

                if(carid.equals(car_id_value) && car_status.equals("Available")){
                    int change_item = Integer.parseInt(carid);
                    // start from 0 need minus 1
                    int minus_cut = cnt - 1;
                    action = 1; 
                    //show that changes line

                    String old_line = each_car_detail[0];
                    String[] each_element = old_line.split("\t");


                    String new_car_details = (each_car_detail[0].replace("Available", not_available));


                    //System.out.println(new_car_details);
                    //Crate write car for writing into Car.txt
                    write_cars.add(new_car_details);
                    array_cars.set(1, new_car_details);
                    

                }else{
                    array_cars.add(each_car_detail[0]);
                    write_cars.add(each_car_detail[0]);
                
                }


            }
                if(action == 1){
                //Change car status back into the car.txt (overwrite)
                Path output = Paths.get("Car.txt");
                for(int x = 0; x<write_cars.size(); x++){
                    //System.out.println(write_car.get(x));
                    
                    Files.write(output, write_cars);
                    
                }
                //Write into car txt file
                JOptionPane.showMessageDialog(this, "Booking Successfully, Have a Nice Day", "Information Message", JOptionPane.INFORMATION_MESSAGE);
                CustomerClass customerpage = new CustomerClass();
                customerpage.setVisible(true);
                dispose();
            }

            
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EditCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_confirm_booking_btnActionPerformed

    private void carId_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carId_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carId_txtActionPerformed

    private void car_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)car_table.getModel();
        int selectedRow = car_table.getSelectedRow();
        
        //temp data
        String tempcarid = model.getValueAt(selectedRow,0).toString();
        carId_txt.setText(model.getValueAt(selectedRow,0).toString());
        
        String cbrand = model.getValueAt(selectedRow,1).toString();
        String cname = model.getValueAt(selectedRow,2).toString();
        
        carName_txt.setText(cbrand + " " + cname);
        
        String rent = model.getValueAt(selectedRow,15).toString();
        
        //double rents = Double.parseDouble(rent);
        
       price_lbl.setText(rent);
        
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
    private javax.swing.JButton Auto_Click;
    private javax.swing.JButton booking_back_btn;
    private javax.swing.JLabel brand;
    private javax.swing.JLabel brand1;
    private javax.swing.JTextField carDuration_txt;
    private javax.swing.JTextField carId_txt;
    private javax.swing.JTextField carName_txt;
    private javax.swing.JTable car_table;
    private javax.swing.JButton confirm_booking_btn;
    private javax.swing.JTextField cusID_textfield;
    private javax.swing.JTextField cusName_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel model;
    private javax.swing.JLabel model1;
    private javax.swing.JLabel model2;
    private javax.swing.JLabel model3;
    private javax.swing.JLabel price_lbl;
    // End of variables declaration//GEN-END:variables
}
