/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author bende
 */
public class Admin extends VerifyUser{
    
    private String admin_username;
    private String admin_password;
    private String admin_position;
    
    public String getAdminPosition(){
        return admin_position;
    }
    
    public void setAdminPosition(String position){
        this.admin_position = position;
    }
    
    
    
}