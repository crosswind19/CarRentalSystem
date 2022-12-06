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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Crosswind Cheah
 */
public class Return_Change_Status extends changeStatus {

    public Return_Change_Status(String bookingID, String cusID, String status) {
        super(bookingID, cusID, status);
    }
    
    
    
    @Override
    public void change_booking_status(){
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
                    String booking_ids = each_element[0]; //Booking_id
                    String cusID = each_element[3]; //Car_id
                    
                    //get car id
                    id_car = each_element[3];
                   //String booking_id = Integer.toString(booking_id);
                    
                    
                    //System.out.println(booking_id + " "  +cusID);
                    array_booking.add(each_booking[0]);
                    
                    //Initially is car_id
                    if((cus_id.equals(cusID) && (booking_id.equals(booking_ids)))){
     
                        flag = 1;
                        int new_cnt = cnt - 1;
                        //System.out.println(new_cnt);
                       String changes_index = booking_status;
                       int int_change_index = Integer.parseInt(changes_index);
                        //System.out.println(changes);
                        
                           
                                    String before_word = each_element[int_change_index+6];
                                    //System.out.println(each_element[changes+4]);
                                    update_status = (array_booking.get(new_cnt).replace(before_word, "Returning"));
                                    
                                    //Close and return to main page
                                    
                            
                            
                        
                       
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
        } catch (IOException ex) {
            Logger.getLogger(Return_Change_Status.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
       @Override
    public void changeCarStatus(){
     
        int action = 0, counter = 0, jop=0;
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
               ApproveReturning appreturn = new ApproveReturning();
               appreturn.int_jop = 1;
//                JOptionPane.showMessageDialog(this, "Booking Successfully, Have a Nice Day", "Information Message", JOptionPane.INFORMATION_MESSAGE);

            }

           this.capture_flag = 1; 
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EditCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    

    
    
    
   
    
}
