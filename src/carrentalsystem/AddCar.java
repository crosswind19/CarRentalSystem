/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bende
 */
public class AddCar extends javax.swing.JFrame {
    
    /**
     * Creates new form AddCar
     */
    public AddCar() {
        initComponents();
    }
    CarEngine engine;
    Vehicle vehicle;
    Powered_Type powered_type;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        number_plate = new javax.swing.JLabel();
        gear = new javax.swing.JLabel();
        pasenger = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Serial_numner = new javax.swing.JLabel();
        manufacture_Year = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Engine_id = new javax.swing.JLabel();
        Engine_type = new javax.swing.JLabel();
        Engine_hp = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        fuelType = new javax.swing.JLabel();
        TravelDistance = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        addCar_btn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        carBrand_textfield = new javax.swing.JTextField();
        carModel_textfield = new javax.swing.JTextField();
        numPlate_textfield = new javax.swing.JTextField();
        carGear_textfield = new javax.swing.JTextField();
        numPassenger_textfield = new javax.swing.JTextField();
        travelDistance_textfield = new javax.swing.JTextField();
        rentPrice_textfield = new javax.swing.JTextField();
        manufactureYear_textfield = new javax.swing.JTextField();
        serialNum_textfield = new javax.swing.JTextField();
        engineID_textfield = new javax.swing.JTextField();
        engineHP_textfield = new javax.swing.JTextField();
        carType_combobox = new javax.swing.JComboBox<>();
        fuelType_combobox = new javax.swing.JComboBox<>();
        engineType_combo = new javax.swing.JComboBox<>();
        confirm_vehicle = new javax.swing.JButton();
        CC = new javax.swing.JLabel();
        car_cc_textfield = new javax.swing.JTextField();
        km = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Admin Add Car");

        brand.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        brand.setText("Brand:");

        model.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        model.setText("Model:");

        number_plate.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        number_plate.setText("Number Plate:");

        gear.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        gear.setText("Gear:");

        pasenger.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        pasenger.setText("Passenger Occupancy:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Manufacture");

        Serial_numner.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        Serial_numner.setText("Serial Number: ");

        manufacture_Year.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        manufacture_Year.setText("Year:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Vehicle");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Engine");

        Engine_id.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        Engine_id.setText("ID:");

        Engine_type.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        Engine_type.setText("Type:");

        Engine_hp.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        Engine_hp.setText("HorsePower:");

        type.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        type.setText("Type:");

        fuelType.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        fuelType.setText("Fuel Type:");

        TravelDistance.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        TravelDistance.setText("Travel Distance:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel19.setText("Rent Price: (RM)");

        addCar_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addCar_btn.setText("Add");
        addCar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCar_btnActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        carBrand_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        carModel_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        numPlate_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        carGear_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        numPassenger_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        travelDistance_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rentPrice_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        manufactureYear_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        manufactureYear_textfield.setEnabled(false);

        serialNum_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        serialNum_textfield.setEnabled(false);

        engineID_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        engineID_textfield.setEnabled(false);

        engineHP_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        engineHP_textfield.setEnabled(false);

        carType_combobox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        carType_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SportCar", "SUV", "Sedan", "HatchBack", "MPV" }));

        fuelType_combobox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fuelType_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combustion", "Electric" }));
        fuelType_combobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fuelType_comboboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fuelType_comboboxMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fuelType_comboboxMousePressed(evt);
            }
        });
        fuelType_combobox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fuelType_comboboxKeyPressed(evt);
            }
        });

        engineType_combo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        engineType_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hybrid ", "Plug-in_Hybrid", "Petrol", "Diesel", "Fully_Electric", "Hybrid_Electric" }));
        engineType_combo.setEnabled(false);

        confirm_vehicle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        confirm_vehicle.setText("Confirm Vehicle");
        confirm_vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_vehicleActionPerformed(evt);
            }
        });

        CC.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        CC.setText("Car CC:");

        car_cc_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        km.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        km.setText("KM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(number_plate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(model, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pasenger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fuelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TravelDistance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(carBrand_textfield)
                        .addComponent(carModel_textfield)
                        .addComponent(numPlate_textfield)
                        .addComponent(carGear_textfield)
                        .addComponent(numPassenger_textfield)
                        .addComponent(carType_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fuelType_combobox, 0, 147, Short.MAX_VALUE)
                        .addComponent(car_cc_textfield))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(travelDistance_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Engine_hp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Engine_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Engine_id, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(engineID_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(engineHP_textfield)
                            .addComponent(engineType_combo, 0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(manufacture_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Serial_numner))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(52, 52, 52))
                            .addComponent(jLabel11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serialNum_textfield)
                            .addComponent(manufactureYear_textfield))))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addCar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(23, 23, 23)
                        .addComponent(rentPrice_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(confirm_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brand)
                            .addComponent(carBrand_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carModel_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type)
                            .addComponent(carType_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number_plate)
                            .addComponent(numPlate_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gear)
                            .addComponent(carGear_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pasenger)
                            .addComponent(numPassenger_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fuelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fuelType_combobox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(travelDistance_textfield)
                                .addComponent(km, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TravelDistance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manufacture_Year)
                            .addComponent(manufactureYear_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Serial_numner)
                            .addComponent(serialNum_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(engineID_textfield)
                            .addComponent(Engine_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Engine_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(engineType_combo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Engine_hp)
                            .addComponent(engineHP_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(car_cc_textfield)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addComponent(confirm_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(rentPrice_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addCar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        AdminClass adClass = new AdminClass();
        adClass.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addCar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCar_btnActionPerformed
        int line = 1;
        double new_price = 0;
        int action = 1;
        List<String> car_serial_list = new ArrayList<>();
        
        //Generate ID
        File get_car_id = new File("Car.txt");
        try(Scanner car_id = new Scanner(get_car_id)){
            while(car_id.hasNextLine()){
                String info = car_id.nextLine();
                line = line + 1;
                String new_information[] = info.split("\t");
                break;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int id = line; 
        String brand_name = carBrand_textfield.getText();
        String car_model = carModel_textfield.getText();
        String car_type = carType_combobox.getSelectedItem().toString();
        String num_plate = numPlate_textfield.getText();       
        String car_fuel_type = fuelType_combobox.getSelectedItem().toString();
        String engine_type = engineType_combo.getSelectedItem().toString();
        
        //Use for check empty data for integer and double only
        String occupancy = numPassenger_textfield.getText();
        String year = manufactureYear_textfield.getText();
        String SeNumber = serialNum_textfield.getText();
        String pricing = rentPrice_textfield.getText();
        String gearing = carGear_textfield.getText();
        String tra_distance = travelDistance_textfield.getText();
        String engID = engineID_textfield.getText();
        String carHP = engineHP_textfield.getText();
        String car_cc = car_cc_textfield.getText();
        String status = "Available";

        //Check all data are filled
        if(!((brand_name.isEmpty()) || (car_model.isEmpty()) || (car_type.isEmpty()) || (num_plate.isEmpty()) || (occupancy.isEmpty()) || (year.isEmpty()) || (SeNumber.isEmpty()) || (pricing.isEmpty()) || (gearing.isEmpty()) || (car_fuel_type.isEmpty()) || (tra_distance.isEmpty()) || (engID.isEmpty()) || (engine_type.isEmpty()) || (carHP.isEmpty() || (car_cc.isEmpty())))){

            int num_occupancy = Integer.parseInt(numPassenger_textfield.getText());
            int manu_year = Integer.parseInt(manufactureYear_textfield.getText());
            String manuSerialNumber = (serialNum_textfield.getText());
            double rent_price = Double.parseDouble(rentPrice_textfield.getText());
            int car_gear = Integer.parseInt(carGear_textfield.getText()); 
            int travel_distance = Integer.parseInt(travelDistance_textfield.getText());
            String check_engine_id = engineID_textfield.getText();
            int engine_id = Integer.parseInt(engineID_textfield.getText());
            int car_hp = Integer.parseInt(engineHP_textfield.getText());
        
            Vehicle car = new Vehicle(id,brand_name, car_model, car_type, num_plate, num_occupancy, rent_price, manuSerialNumber, manu_year, car_gear, car_fuel_type, travel_distance, engine_id, engine_type, car_hp,status);
            Electric_Car elec = new Electric_Car(id,brand_name, car_model, car_type, num_plate, num_occupancy, rent_price, manuSerialNumber, manu_year, car_gear, car_fuel_type, travel_distance, engine_id, engine_type, car_hp,status);
            Conventional_Car convenc = new Conventional_Car(id, brand_name, car_model, car_type, num_plate, num_occupancy, rent_price, manuSerialNumber, manu_year, car_gear, car_fuel_type, travel_distance, engine_id, engine_type, car_hp,status);

            //get from Parent class (multilevel inheritance)
            //System.out.println(elec.getRentPrice() + " from Vehicle class");
            

            

            //System.out.println(car.getBrand() +" "+ car.getmodel() +" "+ car.getCarType() +" "+ car.getNumberPlate() +" "+ car.getCarGear() +" "+ car.getNumberOfPassenger()+ " " + car.getfuel_type()+" "+ car.getTravel_distance()+" "+ car.getRentPrice()+" "+ car.getManufactureYear()+" "+ car.getManufactureNumber()+" "+ car.getEngine_id() +" "+ car.getEngine_type() +" "+ car.getCar_hp());
        
            //Electric car must match with fully electric engine
            if((car_fuel_type == "Combustion" && (engine_type != "Fully_Electric") || (car_fuel_type == "Electric") && (engine_type == "Fully_Electric"))){
            
            //disable everything (not able to change again)
            //if select electric car only allow 1 car gear
            //Rent price will + with insurance

            if("Electric".equals(car_fuel_type)){
                new_price =  elec.doElectricCarInsurance(elec.getRentPrice());
            }
            else{
               new_price = convenc.doConventionalCarInsurance(rent_price);
            }

            
            //Check if the serial number in the text file
            File read_car_file = new File("Car.txt");
                try {
                    Scanner scan_serial = new Scanner(read_car_file);
                    ArrayList<String> read_car_serial = new ArrayList<>();
                    while(scan_serial.hasNextLine()){
                        //read whole data from textfile
                        String car_data = scan_serial.nextLine();
                        String serial_car_split[] = car_data.split("\t");
                        
       
                        //Get the Car Manufacture Serial Number Column
                       if(manuSerialNumber.equals(serial_car_split[11]) && check_engine_id.equals(serial_car_split[12])){
                           JOptionPane.showMessageDialog(this, "Car Serial Number or Engine ID Found!", "Error Message", JOptionPane.ERROR_MESSAGE);
                           action = 0;
                       }
                        
                    }
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            
            if(action == 1){
                try {
                    //write into textfile
                    FileOutputStream append_car_details = new FileOutputStream("Car.txt", true);
                    String car_details;
                    car_details = (car.getId() + "\t" + car.getBrand() + "\t" + car_model + "\t" + car_type + "\t" + num_plate + "\t" + car_gear + "\t" + occupancy + "\t" + car_fuel_type + "\t" + tra_distance + "\t" +car_cc + "\t" +  manu_year + "\t" + manuSerialNumber + "\t" + engine_id + "\t" + engine_type + "\t" + car_hp + "\t" + new_price + "\t" + status + "\n");
                    //convert string to bytes
                    byte[] byte_details = car_details.getBytes(); 
                    append_car_details.write(byte_details);

                    JOptionPane.showMessageDialog(this, "Car Details Entered Successfully!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
                    append_car_details.close();
                    addCar_btn.setEnabled(false);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, null, ex);
                } 
   
            }         
            
                }else{
                    JOptionPane.showMessageDialog(this, "An Error Occur with Fuel Type & Engine Type, Please Try Again!", "Error Message", JOptionPane.ERROR_MESSAGE);
                    confirm_vehicle.setEnabled(true);
                    manufactureYear_textfield.setEnabled(false);
                    serialNum_textfield.setEnabled(false);
                    engineID_textfield.setEnabled(false);
                    engineType_combo.setEnabled(false);
                    engineHP_textfield.setEnabled(false);

                }
            }else{
                JOptionPane.showMessageDialog(this, "Please Fill Out all the Required Field", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_addCar_btnActionPerformed

    private void fuelType_comboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuelType_comboboxMouseClicked

    }//GEN-LAST:event_fuelType_comboboxMouseClicked

    private void fuelType_comboboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuelType_comboboxMouseExited

    }//GEN-LAST:event_fuelType_comboboxMouseExited

    private void fuelType_comboboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuelType_comboboxMousePressed

    }//GEN-LAST:event_fuelType_comboboxMousePressed

    private void fuelType_comboboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fuelType_comboboxKeyPressed

    }//GEN-LAST:event_fuelType_comboboxKeyPressed

    private void confirm_vehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_vehicleActionPerformed

        confirm_vehicle.setEnabled(false);
        int car_gear = Integer.parseInt(carGear_textfield.getText());
        String car_fuel_type = fuelType_combobox.getSelectedItem().toString();
        
        if(((car_fuel_type == "Electric") && (car_gear != 1))){
            JOptionPane.showMessageDialog(this, "An Error Occur with Car Gear & Engine Type, Please Try Again!", "Error Message", JOptionPane.ERROR_MESSAGE);
            confirm_vehicle.setEnabled(true);
            manufactureYear_textfield.setEnabled(false);
            serialNum_textfield.setEnabled(false);
            engineID_textfield.setEnabled(false);
            engineType_combo.setEnabled(false);
            engineHP_textfield.setEnabled(false);
        
        }else{
            manufactureYear_textfield.setEnabled(true);
            serialNum_textfield.setEnabled(true);
            engineID_textfield.setEnabled(true);
            engineType_combo.setEnabled(true);
            engineHP_textfield.setEnabled(true);
        }
        
        //Check if selected the electric type car
        if(fuelType_combobox.getSelectedItem().toString().equals("Electric")){
            engineType_combo.setEnabled(false);
            engineType_combo.setSelectedItem("Fully_Electric");
        }
        
        
    }//GEN-LAST:event_confirm_vehicleActionPerformed

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
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CC;
    private javax.swing.JLabel Engine_hp;
    private javax.swing.JLabel Engine_id;
    private javax.swing.JLabel Engine_type;
    private javax.swing.JLabel Serial_numner;
    private javax.swing.JLabel TravelDistance;
    private javax.swing.JButton addCar_btn;
    private javax.swing.JButton back;
    private javax.swing.JLabel brand;
    private javax.swing.JTextField carBrand_textfield;
    private javax.swing.JTextField carGear_textfield;
    private javax.swing.JTextField carModel_textfield;
    private javax.swing.JComboBox<String> carType_combobox;
    private javax.swing.JTextField car_cc_textfield;
    private javax.swing.JButton confirm_vehicle;
    private javax.swing.JTextField engineHP_textfield;
    private javax.swing.JTextField engineID_textfield;
    private javax.swing.JComboBox<String> engineType_combo;
    private javax.swing.JLabel fuelType;
    private javax.swing.JComboBox<String> fuelType_combobox;
    private javax.swing.JLabel gear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel km;
    private javax.swing.JTextField manufactureYear_textfield;
    private javax.swing.JLabel manufacture_Year;
    private javax.swing.JLabel model;
    private javax.swing.JTextField numPassenger_textfield;
    private javax.swing.JTextField numPlate_textfield;
    private javax.swing.JLabel number_plate;
    private javax.swing.JLabel pasenger;
    private javax.swing.JTextField rentPrice_textfield;
    private javax.swing.JTextField serialNum_textfield;
    private javax.swing.JTextField travelDistance_textfield;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
