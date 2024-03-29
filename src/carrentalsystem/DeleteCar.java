/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bende
 */
public class DeleteCar extends javax.swing.JFrame {

    /**
     * Creates new form DeleteCar
     */
    public DeleteCar() {
        initComponents();
    }

    String del_serial;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delete_car_lbl = new javax.swing.JLabel();
        car_serial_lbl = new javax.swing.JLabel();
        delete_car_textfield = new javax.swing.JTextField();
        delete_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        delete_car_lbl.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        delete_car_lbl.setText("Admin Delete Car");

        car_serial_lbl.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        car_serial_lbl.setText("Car Serial Number:");

        delete_car_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delete_car_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                delete_car_textfieldKeyTyped(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(delete_car_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(car_serial_lbl)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_car_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(delete_car_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(car_serial_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_car_textfield))
                .addGap(18, 18, 18)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        String delete_serial = delete_car_textfield.getText();
        int del_action = 0, del_line = 0;
        try {          
            File car_file = new File("Car.txt");
            Scanner scan_data = new Scanner(car_file);
            ArrayList<String> left_car = new ArrayList<>();
            
            while(scan_data.hasNextLine()){
                String each_line = scan_data.nextLine();
                del_line = del_line + 1;
                String[] del_car_details = each_line.split("\n");
                String[] each_car_del = del_car_details[0].split("\t");
                del_serial = each_car_del[11];
                

                //number start with 1 in textfile no need minus 1
                if(delete_serial.equals(del_serial)){
                    if(each_car_del[16].equals("Available")){
                        del_action = 1;
                    }else{
                        //car is still renting out
                        del_action = 2;
                    }

                    //if found in this statement, car details will not added into left_car

                }else{
                    // if the serial number not found, will be added into the left_car
                    left_car.add(del_car_details[0]);
                }
                
            }
            
            if(del_action == 1){
                int ans = JOptionPane.showConfirmDialog(this, "Are You Sure To Delete this Car with this Serial Number "+delete_serial + " ?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(ans == JOptionPane.YES_OPTION){
                    delete_btn.setEnabled(false);
                    
                    //write the new car details (With not include delete car details)
                    Path write_output = Paths.get("Car.txt");
                    for(int x = 0; x<left_car.size(); x++){
                    
                    Files.write(write_output, left_car);
                    
                }
                    JOptionPane.showMessageDialog(this, "Car Details Removed Successfully!", "Information Message", JOptionPane.INFORMATION_MESSAGE);

                    
                }else if(ans == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(this, "No Changes Will Be Made!", "Information Message", JOptionPane.INFORMATION_MESSAGE);

                }
            }else if(del_action == 0){
                    JOptionPane.showMessageDialog(this, "No Car Serial Number Found!", "Information Message", JOptionPane.WARNING_MESSAGE);
                
            }else if(del_action == 2){
                    JOptionPane.showMessageDialog(this, "Car Serial Number Found, But Still Renting Out!", "Information Message", JOptionPane.WARNING_MESSAGE);
                
            }else{
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }//GEN-LAST:event_delete_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        AdminClass bck_admin_class = new AdminClass();
        bck_admin_class.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void delete_car_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_delete_car_textfieldKeyTyped
        char key_entered = evt.getKeyChar();
        // only allow number and alphabetic character
        if(!(Character.isAlphabetic(key_entered)) && (!(Character.isDigit(key_entered)))){
            evt.consume();  
            error.setText("Invalid Input " + key_entered);
        }else{
            error.setText("");
        }
    }//GEN-LAST:event_delete_car_textfieldKeyTyped

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel car_serial_lbl;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel delete_car_lbl;
    private javax.swing.JTextField delete_car_textfield;
    private javax.swing.JLabel error;
    // End of variables declaration//GEN-END:variables
}
