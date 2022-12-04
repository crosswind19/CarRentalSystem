/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import carrentalsystem.DeleteCar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author bende
 */
public class Payment {

String payment_id;
String booking_id;
String customer_id;
String car_id;
String payment_amount;  
private String Rent_price;


int flag = 0, ans = -1, action;

public void Payment(String payid){
    this.payment_id = payid;

}

public void setPayment(String payrent){
    this.payment_amount = payrent;

}

public void setPaymentID(String payid){
    this.payment_id = payid;
}

public String getPaymentAmount(){
    return payment_amount;
}


public void setAns(int ans){
    this.ans = ans;
}

public int getAns(){
    return ans;
}

public void setAction(int act){
    this.action = act;
}

public int getAction(){
    return action;
}

//booking (composition)
public String displayRent(){
    return Rent_price;
}

public void setRent(String rent){
    this.Rent_price = rent;
}

public String getRent(){
    return Rent_price;
}


public void doDeletePayment(){
    int del_action = 0, del_line = 0;
    try {          
        File pay_file = new File("Payment.txt");
        Scanner scan_pay = new Scanner(pay_file);
        ArrayList<String> left_pay = new ArrayList<>();

        while(scan_pay.hasNextLine()){
            String each_line = scan_pay.nextLine();
            del_line = del_line + 1;
            String[] del_pay_details = each_line.split("\n");
            String[] each_pay_del = del_pay_details[0].split("\t");
            String paymentID = each_pay_del[0];


            //number start with 1 in textfile no need minus 1
            if(payment_id.equals(paymentID)){

                del_action = 1; 
                //if found in this statement, car details will not added into left_car

            }else{
                // if the serial number not found, will be added into the left_car
                this.action = 0;
                this.flag = 0;
                left_pay.add(del_pay_details[0]);
            }

        }
//        for(int x=0; x<left_pay.size(); x++){
//            System.out.println(left_pay);
//        }
        
        
        if(del_action == 1){
            
            this.action = 1;
            //write the new car details (With not include delete car details)
            Path write_output = Paths.get("Payment.txt");
            for(int x = 0; x<left_pay.size(); x++){
            //System.out.println(write_car.get(x));

            Files.write(write_output, left_pay);
            this.flag = 1;
        }


        }


    } catch (FileNotFoundException ex) {
        Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, null, ex);
    }catch (IOException ex) {
        Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}

public double TotalRevenue(){
    int cal_line=0, revenue=0;
    try {          
        File pay_file = new File("Payment.txt");
        Scanner scan_pay = new Scanner(pay_file);

        while(scan_pay.hasNextLine()){
            String each_line = scan_pay.nextLine();
            cal_line = cal_line + 1;
            String[] del_pay_details = each_line.split("\n");
            String[] each_pay_del = del_pay_details[0].split("\t");
            
            //get the payment data
            String payment = each_pay_del[4];
            try{
                Double new_payment = Double.parseDouble(payment);
                revenue += new_payment;
            }catch(NumberFormatException e){
                
            }
}
} catch (FileNotFoundException ex) {
        Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, null, ex);
    }
    return revenue;
}
}