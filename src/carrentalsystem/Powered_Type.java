/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author bende
 */
public class Powered_Type extends Vehicle{
    //fuel or electric
    private String fuel_type;
    private int travel_distance;

    public Powered_Type(String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, int manufactureNumber, int manufactureYear) {
        super(brand, model, carType, number_plate, numberOfPassenger, rent_price, manufactureNumber, manufactureYear);
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
   
    
}
