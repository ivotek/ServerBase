/*
 * 
 * DTO for response to login
 * 
 */
package com.ivotek.animalhouse.DTO;

/**
 *
 * @author Daniele Loddo alias ivotek www.ivotek.it ivotek@gmail.com
 * 
 */

public class ResponseLogInDTO {
    
    private Long id;
    private Long responseIdSession;
    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getResponseIdSession() {
        return responseIdSession;
    }

    public void setResponseIdSession(Long responseIdSession) {
        this.responseIdSession = responseIdSession;
    }
       
}
