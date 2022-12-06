/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Crosswind Cheah
 */
public class Customer_Change_Status extends changeStatus {
    
    String cusName;
    String carID;
    String carName;
    String rent;
    
    public Customer_Change_Status(String bookingID, String cusID, String cusName, String carID, String carName, String rent, String status) {
        super(bookingID,cusID,status);
       this.cusName = cusName;
       this.carID = carID;
       this.carName = carName;
       this.rent = rent;
        
    }
    
    public void customerDoBooking(){
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
    }
    
       @Override
    public void changeCarStatus() {
        int flag = 0, cnt = 0, action = 0;
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
                //JOptionPane.showMessageDialog(this, "Booking Successfully, Have a Nice Day", "Information Message", JOptionPane.INFORMATION_MESSAGE);
                CustomerClass customerpage = new CustomerClass();
                customerpage.setVisible(true);
                
            }

            
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EditCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    
   
    
}
