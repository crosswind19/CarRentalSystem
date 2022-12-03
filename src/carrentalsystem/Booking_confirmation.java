/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import Class.Payment;
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
public class Booking_confirmation {
    
    String booking_id;
    String cus_id;
    String booking_status;
    String[] array = null;
    String approve_word = "Approved";
    String reject_word = "Rejected";
    String car_status_available = "Available";
    String update_status = "";
    
    String id_car;
    String booking_ids;
    
    BookingConfirmation booking;
    
    int cnt=0, flag=0, capture_flag = 0;
    
    //parse in booking id, customer id, and combobos number
    Booking_confirmation(String bookingID, String cusID, String status){
        this.booking_id = bookingID;
        this.cus_id = cusID;
        this.booking_status = status;
    }
    
    Booking_confirmation(String carID){
        this.id_car = carID;
    }
    
    public void setBookID(String book){
        this.booking_id = book;
    }
    
    public String getBookID(){
        return booking_id;
    }
    
    public void setCusID(String cus){
        this.cus_id = cus;
        
    }
    public String getCusID(){
        return cus_id;
    }
    public void setStatus(String status){
        this.booking_status = status;
    }
    
    public String getStatus(){
        return booking_status;
    }
    
    public int getCaptureFlag(){
        return capture_flag;
    }
    
    public void setCaptureFlag(int num){
        this.capture_flag = num;
    }
 
    public void doBookingConfirmation() throws IOException{
        try {
            File read_confirmation = new File("Booking.txt");

                Scanner scan_cus = new Scanner(read_confirmation);
                ArrayList<String> array_booking = new ArrayList<>();
                ArrayList<String> write_booking = new ArrayList<>();
                
                while(scan_cus.hasNextLine()){
                    String get_line = scan_cus.nextLine();
                    cnt += 1;
                    
                    String[] each_booking = get_line.split("\n");
                    String[] each_element = each_booking[0].split("\t");
                    
                    //get the both id
                    booking_ids = each_element[0];
                    String cusID = each_element[1];
                    
                    //get car id
                    id_car = each_element[3];
                    
                    
                    //System.out.println(booking_id + " "  +cusID);
                    array_booking.add(each_booking[0]);
                    
                    if((cus_id.equals(cusID) && (booking_id.equals(booking_ids)))){
     
                        flag = 1;
                        int new_cnt = cnt - 1;
                        //System.out.println(new_cnt);
                       String changes_index = booking_status;
                       int int_change_index = Integer.parseInt(changes_index);
                        //System.out.println(changes);
                        switch (int_change_index) {
                            case 0 ->                                 {
                                //approve 0
                                    
                                    String before_word = each_element[int_change_index+6];
                                    
                                    //System.out.println(each_element[changes+4]);
                                    update_status = (array_booking.get(new_cnt).replace(before_word, approve_word));
                                }
                            case 1 ->                                 {
                                //reject 1
                                    String before_word = each_element[int_change_index+5];
                                        System.out.println(before_word);
                                    update_status = (array_booking.get(new_cnt).replace(before_word, reject_word));
                                
                                    //car status change back from not-Available to Available    
                                    this.changeCarStatus();
                                    
                                    //remove the payment details
                                    this.deletePaymentData();
                                    
                                }
                            default -> {
                            }
                        }
                       
                        write_booking.add(update_status);
                        
                    }
                    else{

                        write_booking.add(each_booking[0]);
                    }
                }
            
                for(int x=0; x<write_booking.size(); x++){
                    System.out.println(write_booking.get(x));
                }
                
                
                
                if(flag == 1){
                    //write into booking textfile
                    Path write_to_file = Paths.get("Booking.txt");
                for (String write_booking1 : write_booking) {
                    Files.write(write_to_file, write_booking);
                }
                    
                }else{

                }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EditCusBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void changeCarStatus(){
     
        int action = 0, counter = 0;
        try {          
            File read_car_file = new File("Car.txt");
            Scanner scan_car = new Scanner(read_car_file);
            ArrayList<String> array_cars = new ArrayList<>();
            ArrayList<String> write_cars = new ArrayList<>();
            
            while(scan_car.hasNextLine()){
                String each_car = scan_car.nextLine();
                counter = counter + 1;
                
                String[] each_car_detail = each_car.split("\n");
                String[] each_car_dets = each_car_detail[0].split("\t");
                
                //Get car id and status of each car 
                String car_id_value = each_car_dets[0];
                String car_status = each_car_dets[16];

                //use for checking that line for Edit
                array_cars.add(each_car_detail[0]);

                if(id_car.equals(car_id_value) && car_status.equals("not-Available")){
                    int change_item_status = Integer.parseInt(id_car);
                    // start from 0 need minus 1
                    int minus_cut = counter - 1;
                    action = 1; 
                    //show that changes line

                    String old_line = each_car_detail[0];
                    String[] each_element = old_line.split("\t");


                    String new_car_details = (old_line.replace("not-Available", car_status_available));


                    //System.out.println(new_car_details);
                    //Crate write car for writing into Car.txt
                    write_cars.add(new_car_details);
                    array_cars.set(1, new_car_details);
                    

                }else{
                    array_cars.add(each_car_detail[0]);
                    write_cars.add(each_car_detail[0]);
                
                }


            }
                for(int y=0; y<write_cars.size(); y++){
                    System.out.println(write_cars.get(y));
                }
                
                
                if(action == 1){
                //Change car status back into the car.txt (overwrite)
                Path output = Paths.get("Car.txt");
                for (String write_car : write_cars) {
                    //System.out.println(write_car.get(x));
                    
                    Files.write(output, write_cars);
                }

            }

           this.capture_flag = 1; 
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EditCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void deletePaymentData(){
        // get the booking id
        Payment pay = new Payment();
        pay.setPaymentID(booking_id);
        
        pay.setAns(1);
        pay.doDeletePayment();
        
        
    }



}
