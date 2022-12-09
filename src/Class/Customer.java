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


public class Customer extends Login{
    
    int id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String gender;

    //Aggregiation
    public Address address;
    

    public Customer(){

    }
    
    public Customer (String username,String password,int id,String name,String gender,String emailAddress,String phoneNumber,Address address){
        super(username,password);
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        //Aggregation
        this.address = address;
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
    


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String register(){
        String address_details = (address.Street + "\t" + address.Postal + "\t" + address.City + "\t" + address.State + "\n");
        String person_details = (id + "\t" + super.getVerifyUsername() + "\t" + super.getVerifyPassword() + "\t" +name + "\t" +gender + "\t" +emailAddress + "\t" +phoneNumber + "\t" + address_details);
        
        return person_details;
        
    }
    
    @Override
    public String toString(){
        return (id + "\t" + name + "\t" + gender + "\t" + phoneNumber + "\t" + emailAddress + "\t" + address);
    }

    
    
}
