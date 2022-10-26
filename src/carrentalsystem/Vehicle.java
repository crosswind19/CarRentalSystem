/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author bende
 */
public class Vehicle {
    
    private String brand;
    private String model;
    private String carType;
    private String number_plate;
    private int numberOfPassenger;
    private double rent_price;
    private int manufactureNumber;
    private int manufactureYear;
    
    public Vehicle(String brand, String model, String carType, String number_plate, int numberOfPassenger, double rent_price, int manufactureNumber, int manufactureYear){
        this.brand = brand;
        this.model = model;
        this.carType = carType;
        this.number_plate = number_plate;
        this.numberOfPassenger = numberOfPassenger;
        this.rent_price = rent_price;
        this.manufactureNumber = manufactureNumber;
        this.manufactureYear = manufactureYear;
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
    
    public int getManufactureNumber(){
        return manufactureNumber;
    }
    public void setManufactureNumber(int num){
        this.manufactureNumber = num;
    }
    
    public int getManufactureYear(){
        return manufactureYear;
    }
    public void setManufactureYear(int year){
        this.manufactureYear = year;
    }
}
