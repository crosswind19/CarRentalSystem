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
    //how many gear does the car have
    private int car_gear;
    //car insurance will cost RM500 for conventional car, RM250 for electric car
    private double car_insurance;
    
    public Conventional_Car(String brand, String model, String number_plate, int numberOfPassenger, double rent_price, int manufactureNumber, int manufactureYear) {
        super(brand, model, number_plate, numberOfPassenger, rent_price, manufactureNumber, manufactureYear);
        
    }
    public int getCarGear(){
        return car_gear;
    } 
    public void setCarGear(int gear){
        this.car_gear = gear;
    }
    
    public double doConventionalCarInsurance(double price){
        Double rent_price = super.getRentPrice();
        Double totalRentPrice = (rent_price + 500);
        return totalRentPrice;
    }
}
