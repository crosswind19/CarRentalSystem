/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.util.ArrayList;


/**
 *
 * @author Crosswind Cheah
 */
public class Booking {
    private int id; //Booking id
    private Customer customer;
    private Vehicle vehicle;
    
    public Booking(){
        
    }
    
    public Booking(int id,Customer customer,Vehicle vehicle){
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void Add(){
        ArrayList<Booking> booking = Booking.View();
        
    }
    
    
}
