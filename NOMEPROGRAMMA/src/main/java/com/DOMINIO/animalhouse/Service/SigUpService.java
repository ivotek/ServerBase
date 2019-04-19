/*
 * 
 * Interface for the SigUp
 * 
 */
package com.ivotek.animalhouse.Service;

import com.ivotek.animalhouse.DTO.ResponseSigUp;


/**
 *
 * @author Daniele Loddo alias ivotek
 * www.ivotek.it
 * ivotek@gmail.com
 */
public interface SigUpService {
    
    /**
     * Sig in user
     * @param username user
     * @param password user
     * @return DTO to message sig in
     */
    public ResponseSigUp sigUp (String username, String email);
    
    
}
