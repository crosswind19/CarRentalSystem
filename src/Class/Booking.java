/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import carrentalsystem.CustomerClass;
import carrentalsystem.Customer_ReturnCar;
import carrentalsystem.Customer_booking;
import carrentalsystem.EditCar;
import carrentalsystem.EditCusBooking;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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

public class Booking{

    private int id; //Booking id
    String car_id;
    String booking_status;
    String update_status = "";
    String car_status_available = "Available";
    private String Rent_price;
    private Customer customer;
    private String customerid;
    private Vehicle vehicle;
    
    public Payment payment;
    
    String id_car;
    
    int cnt=0, flag=0, capture_flag = 0;
    
    public Booking(int id,String carID,String cusid,String status){
        this.id = id;
        this.car_id = carID;
        this.customerid = cusid;
        this.booking_status = status;
    }
    
    public Booking(int id,Customer customer,Vehicle vehicle){
        this.id = id;
       
        this.customer = customer;
        this.vehicle = vehicle;
    
    }
    
    public Booking(){
        this.payment = new Payment();
    }
    
    //booking id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void setCarID(String carID){
        this.id_car = carID;
    }
    
    //Get Car id
    public Booking(String carID){
        this.id_car = carID;
    }
    
    public int getCaptureFlag(){
        return capture_flag;
    }
    
    public void setCaptureFlag(int num){
        this.capture_flag = num;
    }
    
    //
    public String displayBookRent(){
        return Rent_price;
    }
    
    public void setBookRent(String rent){
        this.Rent_price = rent;
    }
    
    public String getBookRent(){
        return Rent_price;
    }
    
    
     public void returncar() throws IOException{
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
                    String customer_id = each_element[1];
                    String status = each_element[6];
                    
                    //convert cus id to string
                   
                    
                    //get car id
                    id_car = each_element[3];
                    String booking_id = Integer.toString(id);
                    
                    
                    //System.out.println(booking_id + " "  +cusID);
                    array_booking.add(each_booking[0]);
                    System.out.println("customer id" + booking_id);
                    if((car_id.equals(cusID) && (booking_id.equals(booking_ids)) && (customerid.equals(customer_id)))){
                        if(status.equals("Approved")){
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
                                    
                            
                            
                        
                        System.out.println("Status updated");
                        write_booking.add(update_status);
                        Customer_ReturnCar returnc = new Customer_ReturnCar();
                        //returnc.JOP = 1;
                        
                        }else{ 
                        flag = 2;
                        }
                    }
                    else{
                        System.out.println("Record not found");
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
                    get_JOPid(1);
                }else if(flag == 2){
                    get_JOPid(2);
                }else{
                    get_JOPid(0);
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

    public int calTotalCustomer(){
        int count=0;
        try {          
            File read_car_file = new File("Customer_Information.txt");
            Scanner scan_car = new Scanner(read_car_file);       
            while(scan_car.hasNextLine()){
                String each_car = scan_car.nextLine();
                count = count + 1;
            }
        }catch(Exception e){
            
        } 
        return count;
        
    }
    
    static void get_JOPid(int i){
        int id = i;
        Customer_ReturnCar.jopvalue = id;
    }

    
}
