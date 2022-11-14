/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author bende
 */
public class CarEngine {
    
    private String EngineType;
    private String EngineID;
    private int EngineHP;
    //composition
    public Powered_Type powertype;
    
    public CarEngine(){
        powertype.setBrand("null");
        powertype.setManufactureNumber("null");
        powertype.setManufactureYear(0);
        powertype.setModel("null");
        powertype.setNumberOfPassenger(0);
        powertype.setNumberPlate("null");
        powertype.setPowerType("null");
        powertype.setRentPrice(0);
        powertype.setTravelDistance(0);
        
    }
    public String getEngineID(){
        return EngineID;
    }
    public void setEngineID(String id){
        this.EngineID = id;
    }
    public String getEngineType(){
        return EngineType;
    }
    public void setEngineType(String type){
        this.EngineType = type;
    }
    public int getEngineHP(){
        return EngineHP;
    }
    public void setEngineHP(int hp){
        this.EngineHP = hp;
    }
    
}
