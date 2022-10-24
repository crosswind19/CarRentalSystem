/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentalsystem;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Crosswind Cheah
 */
public class CarRentalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test Test
        System.out.println("Testing from Ben123");
        System.out.println("TEsting from kx");
        System.out.println("tets");
        
        //Put Welcome wording in Main 
        JLabel welcome_word = new JLabel("Welcome to Car Rental System");
        welcome_word.setBounds(170, 10, 400, 70);
        welcome_word.setFont(new Font("Georgia", Font.ITALIC, 25));
        
        //Choose ur role wording
        JLabel role = new JLabel("Please Select Your Role.");
        role.setBounds(170, 100, 400, 50);
        role.setFont(new Font("Arial", Font.BOLD, 25));
        
        //Admin & Customer Chosen Button
        JButton admin_btn = new JButton("Admin");
        admin_btn.setBounds(170, 200, 120, 50);
        admin_btn.setFont(new Font("Sans-Serif", Font.ITALIC, 18));
        admin_btn.setHorizontalAlignment(JButton.CENTER);
        admin_btn.setVerticalTextPosition(JButton.CENTER);
        JButton cus_btn = new JButton("Customer");
        cus_btn.setBounds(350, 200, 120, 50);
        cus_btn.setFont(new Font("Sans-Serif", Font.ITALIC, 18));
        cus_btn.setHorizontalAlignment(JButton.CENTER);
        cus_btn.setVerticalTextPosition(JButton.CENTER);
        
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(700, 500);
        frame.setResizable(false);
        frame.setTitle("Car Rental System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        //add welcome word
        frame.add(welcome_word);
        //add role word
        frame.add(role);
        //add admin button
        frame.add(admin_btn);
        //add customer button
        frame.add(cus_btn);
        
    }
    
}
