/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Crosswind Cheah
 */

//Serializable means turn object into bytes and save in the memory
public class Booking implements Serializable {

    private int id; //Booking id
    private Customer customer;
    private Vehicle vehicle;
    private long borrowTime;
    private long returnTime;
    
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
    
    
    
    
    
    
}
