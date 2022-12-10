/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Crosswind Cheah
 */
public class Address {
    String Street;
    String Postal;
    String City;
    String State;
    
    public Address(String Street,String Postal, String City,String State){
        this.Street = Street;
        this.Postal = Postal;
        this.City = City;
        this.State = State;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getPostal() {
        return Postal;
    }

    public void setPostal(String Postal) {
        this.Postal = Postal;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
    
}
