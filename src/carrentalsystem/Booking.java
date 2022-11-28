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
    
    public void Add(){
        ArrayList<Booking> booking = Booking.View();
        if(booking.isEmpty()){
            this.id = 1;
        } else {
            this.id = booking.get(booking.size() - 1).id + 1; //New id
            
        }
        this.returnTime = 0;
        booking.add(this);
        File file = new File("booking.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException ex){
                System.out.println("ex");
            }
        }
        //read object
        ObjectOutputStream outputStream = null;
        try{
            outputStream = new ObjectOutputStream(new FileOutputStream(file));
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        }catch (IOException ex){
            System.out.println(ex);
        } finally {
            if(outputStream != null){
                try{
                    outputStream.close();
                } catch (IOException ex){
                    System.out.println(ex);
                }
            }
        }
        
    }
    
    
    public static ArrayList<Booking> View(){
        ArrayList<Booking> booking = new ArrayList<>(0);
        ObjectInputStream bookingrecord = null;
        
        //open file for reading
        try{
            bookingrecord = new ObjectInputStream(new FileInputStream("booking.txt"));
            boolean END = false; //If file is not end
            
            while(!END){
                try{
                    Booking myBooking = (Booking) bookingrecord.readObject();
                    booking.add(myBooking);
                }catch(ClassNotFoundException e){
                    System.out.println(e);
                }catch (EOFException end){
                    END = true;
                }
            }
            
        }catch(FileNotFoundException e) {
            System.out.println(e);
       } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (bookingrecord != null) {
                    bookingrecord.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return booking;
    }
    
}
