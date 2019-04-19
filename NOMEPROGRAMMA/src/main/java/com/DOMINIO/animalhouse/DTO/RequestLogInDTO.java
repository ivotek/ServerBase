/*
 * 
 * DTO for request to login
 * 
 */
package com.ivotek.animalhouse.DTO;

/**
 *
 * @author Daniele Loddo alias ivotek www.ivotek.it ivotek@gmail.com
 * 
 */

public class RequestLogInDTO {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
