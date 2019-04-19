/*
 * 
 * Interface for the login
 * 
 */
package com.ivotek.animalhouse.Service;

import com.animalhouse.AnimalHouseweb.Entity.ResponseRestoreUsernameDTO;
import com.ivotek.animalhouse.DTO.ResponseDeleteAccountDTO;
import com.ivotek.animalhouse.DTO.ResponseLogInDTO;
import com.ivotek.animalhouse.DTO.ResponseRestorePasswordDTO;



/**
 *
 * @author Daniele Loddo alias ivotek
 * www.ivotek.it
 * ivotek@gmail.com
 */
public interface LoginService {
    
    /**
     * Login user
     * @param username user
     * @param password user
     * @return DTO to ID session
     */
    public ResponseLogInDTO logIn (String username, String password);
    
    /**
     * Rescue password
     */
    public ResponseRestorePasswordDTO restorePassword(String username);
    
    /**
     * Restore username
     */
    public ResponseRestoreUsernameDTO restoreUsername(String email);
    
    /**
     * Delete account
     */
    public ResponseDeleteAccountDTO deleteAccount();
    
    
}
