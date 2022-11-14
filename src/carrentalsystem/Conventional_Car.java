/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author bende
 */
public class Conventional_Car extends Powered_Type{
    //car insurance will cost RM500 for conventional car, RM250 for electric car
    private double car_insurance;

    public Conventional_Car(String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, String manufactureNumber, int manufactureYear, int car_gear, String fuel_type, int travel_distance, int engine_id, String engine_type, int car_hp) {
        super(brand, model, carType, number_plate, numberOfPassenger, rent_price, manufactureNumber, manufactureYear, car_gear, fuel_type, travel_distance, engine_id, engine_type, car_hp);
    }

    
    public double doConventionalCarInsurance(double price){
        Double rent_price = super.getRentPrice();
        Double totalRentPrice = (rent_price + 500);
        return totalRentPrice;
    }
//    
//    public String toString(){
//        return super.getBrand();
//    }
}
