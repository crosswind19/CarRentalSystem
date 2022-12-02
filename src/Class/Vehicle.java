/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import carrentalsystem.DeleteCar;
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

/**
 *
 * @author bende
 */
public class Vehicle {
    private int id;
    private String brand;
    private String model;
    private String carType;
    private String number_plate;
    private int numberOfPassenger;
    private double rent_price;
    private String manufactureNumber;
    private int manufactureYear;
    private int car_gear;
    private String fuel_type;
    int travel_distance;
    int engine_id;
    String engine_type;
    int car_hp;
    String status;
    
    int flag = 0, ans = -1, action;
    
   public void Vehicle(){
       
   }
   
   public Vehicle(){
       
   }
    
    public Vehicle(int id,String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, String manufactureNumber, int manufactureYear, int car_gear, String fuel_type, int travel_distance, int engine_id, String engine_type, int car_hp,String status){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.carType = carType;
        this.number_plate = number_plate;
        this.numberOfPassenger = numberOfPassenger;
        this.rent_price = rent_price;
        this.manufactureNumber = manufactureNumber;
        this.manufactureYear = manufactureYear;
        this.car_gear = car_gear;
        this.fuel_type = fuel_type;
        this.travel_distance = travel_distance;
        this.engine_id = engine_id;
        this.engine_type = engine_type;
        this.car_hp = car_hp;
        this.status = status;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getmodel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
    public String getCarType(){
        return carType;
    }
    public void setCarType(String type){
        this.carType = type;
    }
    
    public String getNumberPlate(){
        return number_plate;
    }
    public void setNumberPlate(String number_plate){
        this.number_plate = number_plate;
    }
    
    public int getNumberOfPassenger(){
        return numberOfPassenger;
    }
    public void setNumberOfPassenger(int num){
        this.numberOfPassenger = num;
    }
    
    public double getRentPrice(){
        return rent_price;
    }
    public void setRentPrice(double rent_price){
        this.rent_price = rent_price;
    }
    
    public String getManufactureNumber(){
        return manufactureNumber;
    }
    public void setManufactureNumber(String num){
        this.manufactureNumber = num;
    }
    
    public int getManufactureYear(){
        return manufactureYear;
    }
    public void setManufactureYear(int year){
        this.manufactureYear = year;
    }
    
    public int getCarGear(){
        return car_gear;
    } 
    public void setCarGear(int gear){
        this.car_gear = gear;
    }
    
    public String getfuel_type(){
        return fuel_type;
    }
    public void setfuel_type(String fuel){
        this.fuel_type = fuel;
    }
    
    public int getTravel_distance(){
        return travel_distance;
    }
    public void setTravel_distance(int km){
        this.travel_distance = km;
    }
    
    public int getEngine_id(){
        return engine_id;
    }
    public void setEngine_id(int eng_id){
        this.engine_id = eng_id;
    }
    
    public String getEngine_type(){
        return engine_type;
    }
    public void setEngine_type(String type){
        this.engine_type = type;
    }
    
    public int getCar_hp(){
        return car_hp;
    }
    public void setCar_hp(int hp){
        this.car_hp = hp;
    }
    
    public void setAction(int act){
        this.action = act;
    }
    
    public void returnCar(){
        int return_function = 0, return_line = 0;
        try {          
        File booking_file = new File("Booking.txt");
        Scanner scan_pay = new Scanner(booking_file);
        ArrayList<String> return_car = new ArrayList<>();

        while(scan_pay.hasNextLine()){
            String each_line = scan_pay.nextLine();
            return_line = return_line + 1;
            String[] del_pay_details = each_line.split("\n");
            String[] each_pay_del = del_pay_details[0].split("\t");
            String vehicleID = each_pay_del[0];
            //int carID = Integer.parseInt(vehicleID);
            String carid = Integer.toString(this.id);
            //number start with 1 in textfile no need minus 1
            if(carid.equals(vehicleID)){

                return_function = 1; 
                //if found in this statement, car details will not added into left_car

            }else{
                // if the serial number not found, will be added into the left_car
                this.action = 0;
                this.flag = 0;
                return_car.add(del_pay_details[0]);
            }

        }
//        for(int x=0; x<left_pay.size(); x++){
//            System.out.println(left_pay);
//        }
        
        
        if(return_function == 1){
            
            this.action = 1;
            //write the new car details (With not include delete car details)
            Path write_output = Paths.get("Booking.txt");
            for(int x = 0; x<return_car.size(); x++){
            //System.out.println(write_car.get(x));

            Files.write(write_output, return_car);
            this.flag = 1;
        }


        }


    } catch (FileNotFoundException ex) {
        Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, null, ex);
    }catch (IOException ex) {
        Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
