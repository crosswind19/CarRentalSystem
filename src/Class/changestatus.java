/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import Class.Payment;

/**
 *
 * @author Crosswind Cheah
 */
abstract class changeStatus{
    String booking_id;
    String cus_id;
    String booking_status;
    String[] array = null;
    String approve_word = "Approved";
    String reject_word = "Rejected";
    String car_status_available = "Available";
    String not_available = "Not-Available";
    String update_status = "";
    
    String id_car;
    String booking_ids;
    
    //BookingConfirmation booking;
    
    int cnt=0, flag=0, capture_flag = 0;
    
       //parse in booking id, customer id, and combobos number
    changeStatus(String bookingID, String cusID, String status){
        this.booking_id = bookingID;
        this.cus_id = cusID;
        this.booking_status = status;
    }
    
    changeStatus(String carID){
        this.id_car = carID;
    }
    
    public void setBookID(String book){
        this.booking_id = book;
    }
    
    public String getBookID(){
        return booking_id;
    }
    
    public void setCusID(String cus){
        this.cus_id = cus;
        
    }
    public String getCusID(){
        return cus_id;
    }
    public void setStatus(String status){
        this.booking_status = status;
    }
    
    public String getStatus(){
        return booking_status;
    }
    
      public void setCarID(String carID){
        this.id_car = carID;
    }
    
    
    public int getCaptureFlag(){
        return capture_flag;
    }
    
    public void setCaptureFlag(int num){
        this.capture_flag = num;
    }
    
    public abstract void changeCarStatus();
    
    public void deletePaymentData(){
        // get the booking id
        Payment pay = new Payment();
        pay.setPaymentID(booking_ids);
        
        pay.setAns(1);
        pay.doDeletePayment();
        
        
    }
    
    public abstract void change_booking_status();
}

