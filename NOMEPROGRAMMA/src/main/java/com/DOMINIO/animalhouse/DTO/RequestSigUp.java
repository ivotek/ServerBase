/*
 * 
 * DTO for request sig up
 * 
 */
package com.ivotek.animalhouse.DTO;

/**
 *
 * @author Daniele Loddo alias ivotek www.ivotek.it ivotek@gmail.com
 * 
 */

public class RequestSigUp {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
