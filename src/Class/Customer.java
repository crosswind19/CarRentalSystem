/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Crosswind Cheah
 */
public class Customer {
    
    int id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String gender;
    
    
    
    
    public Customer (){
        //this.id=id;
    }
    
    //Insert
    public Customer (int id,String name,String gender,String phoneNumber,String emailAddress,String address){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString(){
        return (id + "\t" + name + "\t" + gender + "\t" + phoneNumber + "\t" + emailAddress + "\t" + address);
    }
    
    
}
