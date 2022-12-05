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


public class Customer extends VerifyUser{
    
    int id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String gender;
    private String username;
    private String password;
    //Aggregiation
    public Address address;
    
    
   
  
    
    //Insert
    
//    public void Customer(String username, String password){
//        //super(username,password);
//    }
    public Customer(){

    }
    
    public Customer (String username,String password,int id,String name,String gender,String emailAddress,String phoneNumber,Address address){
//       this.username = username;
//       this.password = password;
        super(username,password);
        this.id = id;

        
        
        //getUsername() = username;
//        this.username = username;
//        this.password = password;
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        //Aggregation
        this.address = address;
    }
    

//    public String getUsername(){
//        return username;
//
//    }
//    
//    public void setUsername(String username){
//        this.username = username;
//    }
//    
//    public String getPassword(){
//        return password;
//    }
//    
//    public void setPassword(String password){
//        this.password = password;
//    }

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
        String person_details = (id + "\t" + super.getVerifyUsername() + "\t" + super.getVerifyPassword() + "\t" +name + "\t" +gender + "\t" +emailAddress + "\t" +phoneNumber + "\t" + address_details);
        
        return person_details;
        
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
