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


public class Customer {
    
    int id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String gender;
    private String username;
    private String password;
    //Aggregiation
    public Address address;
    
    
    
    
    public Customer (){
      
    }
    
    //Insert
    public Customer (int id,String username, String password,String name,String gender,String emailAddress,String phoneNumber,Address address){
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        //Aggregation
        this.address = address;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
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
    
    public String register(){
        String address_details = (address.Street + "\t" + address.Postal + "\t" + address.City + "\t" + address.State + "\n");
        String person_details = (id + "\t" + username + "\t" + password + "\t" +name + "\t" +gender + "\t" +emailAddress + "\t" +phoneNumber + "\t" + address_details);
        
        return person_details;
        
        //("\n" + line + "\t" + new_customer_username + "\t" + new_customer_password + "\t" + 
        //new_customer_name + "\t" + new_gender + "\t" + new_email + "\t" + new_phoneno + "\t" + new_Address);
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
