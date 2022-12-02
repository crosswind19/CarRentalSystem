/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author bende
 */
public class Payment {

String payment_amount;  

public void setPaymentAmount(String pay){
    this.payment_amount = pay;
}

public String getPaymentAmount(){
    return payment_amount;
}

Payment(String pay){
    this.payment_amount = pay;
}

public void doEditPayment(){
    
}
}
