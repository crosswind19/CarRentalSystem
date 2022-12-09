/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author bende
 */
public class Login {
    
    String username;
    String password;
    
    //constructor
    
    public Login(){
        
    }
    
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void setVerifyUsername(String username){
        this.username = username;
    }
    
    public String getVerifyUsername(){
        return username;
    }
    
    public void setVerifyPassword(String pass){
        this.password = pass;
    }
    
    public String getVerifyPassword(){
        return password;
    }
        
    
}
