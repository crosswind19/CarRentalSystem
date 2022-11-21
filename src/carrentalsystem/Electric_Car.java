/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author bende
 */
public class Electric_Car extends Powered_Type{
    //insurance will cost RM250 for electric car
    private double car_rent;

    public Electric_Car(String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, String manufactureNumber, int manufactureYear, int car_gear, String fuel_type, int travel_distance, int engine_id, String engine_type, int car_hp) {
        super(brand, model, carType, number_plate, numberOfPassenger, rent_price, manufactureNumber, manufactureYear, car_gear, fuel_type, travel_distance, engine_id, engine_type, car_hp);
    }
    
    public void setRentPrice_elec(double rent){
        this.car_rent = rent;

    }
    
    public double getRentPrice_elec(){
        return car_rent;
    }
    
    
    public double doElectricCarInsurance(double rent){
        Double totalRentPrice = (rent + 250);
        return totalRentPrice;
    }
    
}
