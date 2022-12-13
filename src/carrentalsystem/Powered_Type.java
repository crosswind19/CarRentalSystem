/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import Class.Vehicle;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bende
 */
public class Powered_Type extends Vehicle{
    //fuel or electric
    private String fuel_type;
    private int travel_distance;
    private double rent_price=0;

    public Powered_Type(int id,String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, String manufactureNumber, int manufactureYear, int car_gear, String fuel_type, int travel_distance,int car_cc, int engine_id, String engine_type, int car_hp,String status) {
        super(id,brand, model, carType, number_plate, numberOfPassenger, rent_price, manufactureNumber, manufactureYear, car_gear, fuel_type, travel_distance,car_cc, engine_id, engine_type, car_hp,status);
    }
    
    public Powered_Type(){
        
    }

    public String getPowerType(){
        return fuel_type;
    }
    public void setPowerType(String power){
        this.fuel_type = power;
    }

    public double doCarInsurance(double price){
        Double totalRentPrice = (price + 100);
        return totalRentPrice;
    }
    
    //Use for generate Pdf
    public int doCalculateTotalCar(){
        int count=0;
        try {          
            File read_car_file = new File("Car.txt");
            Scanner scan_car = new Scanner(read_car_file);       
            while(scan_car.hasNextLine()){
                String each_car = scan_car.nextLine();
                count = count + 1;
            }
        }catch(Exception e){
            
        } 
        return count;
        
    }
    
    public int doCalculateElectricCar(){
        int num = 0;
        try {          
            File car_file = new File("Car.txt");
            Scanner scan_data = new Scanner(car_file);
            
            while(scan_data.hasNextLine()){
                String each_line = scan_data.nextLine();
                String[] each_car_details = each_line.split("\n");
                String[] each_car_det = each_car_details[0].split("\t"); 
                
                if(each_car_det[7].equals("Electric")){
                    num += 1;
                }
            }
        }catch(Exception e){
            
        }
    return num;
    }
    
        public int doCalculateConvenctionalCar(){
        int count = 0;
        try {          
            File car_file = new File("Car.txt");
            Scanner scan_data = new Scanner(car_file);
            
            while(scan_data.hasNextLine()){
                String each_line = scan_data.nextLine();
                String[] each_car_details = each_line.split("\n");
                String[] each_car_det = each_car_details[0].split("\t"); 
                
                if(each_car_det[7].equals("Combustion")){
                    count += 1;
                }
            }
        }catch(Exception e){
            
        }
    return count;
    }
       
        
    public int doCalculateAvailableCar(){
        int counter = 0;
        try {          
            File car_file = new File("Car.txt");
            Scanner scan_data = new Scanner(car_file);
            
            while(scan_data.hasNextLine()){
                String each_line = scan_data.nextLine();
                String[] each_car_details = each_line.split("\n");
                String[] each_car_det = each_car_details[0].split("\t"); 
                
                if(each_car_det[16].equals("Available")){
                    counter += 1;
                }
            }
        }catch(Exception e){
            
        }
    return counter;
    }
        
    
    public int doCalculateNotAvailableCar(){
        int counting = 0;
        try {          
            File car_file = new File("Car.txt");
            Scanner scan_data = new Scanner(car_file);
            
            while(scan_data.hasNextLine()){
                String each_line = scan_data.nextLine();
                String[] each_car_details = each_line.split("\n");
                String[] each_car_det = each_car_details[0].split("\t"); 
                
                if(each_car_det[16].equals("not-Available")){
                    counting += 1;
                }
            }
        }catch(Exception e){
            
        }
    return counting;
    }
    
}
