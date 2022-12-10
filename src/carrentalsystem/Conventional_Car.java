/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author bende
 */
public class Conventional_Car extends Powered_Type{
    //car insurance will cost RM500 for conventional car, RM250 for electric car
    private double car_insurance;

    public Conventional_Car(int id,String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, String manufactureNumber, int manufactureYear, int car_gear, String fuel_type, int travel_distance, int car_cc, int engine_id, String engine_type, int car_hp,String status) {
        super(id,brand, model, carType, number_plate, numberOfPassenger, rent_price, manufactureNumber, manufactureYear, car_gear, fuel_type, travel_distance, car_cc, engine_id, engine_type, car_hp,status);
    }

    
     
    @Override
    public double doCarInsurance(double price){
        Double totalRentPrice = (price + 500);
        return totalRentPrice;
    }
//    
//    public String toString(){
//        return super.getBrand();
//    }
}
