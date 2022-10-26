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
    private int car_gear=1;
    //insurance will cost RM250 for electric car
    private double car_insurance;

    public Electric_Car(String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, int manufactureNumber, int manufactureYear) {
        super(brand, model, carType, number_plate, numberOfPassenger, rent_price, manufactureNumber, manufactureYear);
    }
    
    public int getCarGear(){
        return car_gear;
    }
    
    public double doElectricCarInsurance(double insurance){
        Double rent_price = super.getRentPrice();
        Double totalRentPrice = (rent_price + 250);
        return totalRentPrice;
    }
    
}
