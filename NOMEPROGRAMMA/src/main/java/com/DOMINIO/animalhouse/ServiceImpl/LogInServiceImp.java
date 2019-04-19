/*
 * Implementation the login service
 * 
 */
package com.ivotek.animalhouse.ServiceImpl;

import com.animalhouse.AnimalHouseweb.Entity.ResponseRestoreUsernameDTO;
import com.ivotek.animalhouse.DTO.ResponseDeleteAccountDTO;
import com.ivotek.animalhouse.DTO.ResponseLogInDTO;
import com.ivotek.animalhouse.DTO.ResponseRestorePasswordDTO;
import com.ivotek.animalhouse.Service.LoginService;
import org.springframework.stereotype.Service;


/**
 *
 * @author Daniele Loddo alias ivotek
 * www.ivotek.it
 * ivotek@gmail.com
 */

@Service
public class LogInServiceImp implements LoginService{

    @Override
    public ResponseLogInDTO logIn(String username, String password ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseRestorePasswordDTO restorePassword(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseRestoreUsernameDTO restoreUsername(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseDeleteAccountDTO deleteAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
