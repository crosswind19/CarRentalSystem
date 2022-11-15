/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author Crosswind Cheah
 */
public class Customer {
    
    private static int nextRegNo = 1000;
    private int number;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String gender;
    
    
    
    public Customer (int number){
        this.number = number;
    }
    
    //Insert
    public Customer (String name,String gender,String phoneNumber,String emailAddress,String address){
        this.name = name;
        this.number = nextRegNo;
        this.gender = gender;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public static int getNextRegNo() {
        return nextRegNo;
    }

    public static void setNextRegNo(int nextRegNo) {
        Customer.nextRegNo = nextRegNo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
    
    public String toString(){
        return (name + "\t" + gender + "\t" + phoneNumber + "\t" + emailAddress + "\t" + address);
    }
}
