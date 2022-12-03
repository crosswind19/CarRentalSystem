/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import Class.Vehicle;

/**
 *
 * @author bende
 */
public class Powered_Type extends Vehicle{
    //fuel or electric
    private String fuel_type;
    private int travel_distance;
    private double rent_price=0;

    public Powered_Type(int id,String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, String manufactureNumber, int manufactureYear, int car_gear, String fuel_type, int travel_distance, int engine_id, String engine_type, int car_hp,String status) {
        super(id,brand, model, carType, number_plate, numberOfPassenger, rent_price, manufactureNumber, manufactureYear, car_gear, fuel_type, travel_distance, engine_id, engine_type, car_hp,status);
    }

    public String getPowerType(){
        return fuel_type;
    }
    public void setPowerType(String power){
        this.fuel_type = power;
    }
    public int getTravelDistance(){
        return travel_distance;
    }
    public void setTravelDistance(int travel){
        this.travel_distance = travel;
    }
    
    public double getRentPrice_power(){
        return rent_price;
    }
    
    public void setRentPrice_power(double rent){
        this.rent_price = rent;
    }
    
    public double doCarInsurance(double price){
        Double totalRentPrice = (price + 500);
        return totalRentPrice;
    }
    
}
