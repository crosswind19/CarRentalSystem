/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author bende
 */
public class VerifyUser {
    
    private String username;
    private String password;
    
    //constructor
    public void VerifyUser(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public String getPassword(){
        return password;
    }
        
    
}
