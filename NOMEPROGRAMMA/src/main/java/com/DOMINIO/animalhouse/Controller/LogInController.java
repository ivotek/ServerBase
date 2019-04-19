/*
 *
 * Controller for managment login
 *
 */
package com.ivotek.animalhouse.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniele Loddo alias ivotek www.ivotek.it ivotek@gmail.com
 *
 */
@RestController
@CrossOrigin("*")
public class LogInController {
/*
    //public static final Logger logger = Logger.getLogger(LogInController.class);

    @Autowired
    LoginService loginService;

    //Login user for access
    @RequestMapping(value = "/animalhouse/login") 
    public ResponseLogInDTO login(@RequestBody RequestLogInDTO requestLoginDto ) {
        
        ResponseLogInDTO responseLogInDTO;

        //logger.info("Controller LogInController enter -- login");
        responseLogInDTO =  loginService.logIn(requestLoginDto.getUsername(), requestLoginDto.getPassword());
        //logger.info("Controller LogInController exit -- restoreUsername");
        
        return responseLogInDTO;
    }

    //Restore passwor for email
    @RequestMapping(value = "/animalhouse/restorepassword")
    public ResponseRestorePasswordDTO restorePassword(@RequestBody RequestRestorePasswordDTO requestRestorePasswordDto ) {
        
        ResponseRestorePasswordDTO responseRestorePassword;
        
        //logger.info("Controller LogInController enter -- restorePassword");
        responseRestorePassword= loginService.restorePassword(requestRestorePasswordDto.getUsername());
        //logger.info("Controller LogInController exit -- restorePassword");
        
        return responseRestorePassword;

    }

    //Restore password for username
    @RequestMapping(value = "/animalhouse/restoreusername")
    public ResponseRestoreUsernameDTO restoreUsername(@RequestBody RequestRestoreUsernameDTO requestRestoreUsernameDto) {

        ResponseRestoreUsernameDTO responseRestoreUsername;
                
        //logger.info("Controller LogInController enter -- restoreUsername");
        responseRestoreUsername = loginService.restoreUsername(requestRestoreUsernameDto.getEmail());
        //logger.info("Controller LogInController exit -- restoreUsername");
   
        return responseRestoreUsername;

    }
    
    //Delete account
    @RequestMapping(value = "/animalhouse/deleteusername")
    public void deleteAccount() {

        //TO DO ALL
        //ResponseRestoreUsernameDTO responseRestoreUsername;
                
        //logger.info("Controller LogInController enter -- restoreUsername");
        //responseRestoreUsername= loginService.restoreUsername();
        //logger.info("Controller LogInController exit -- restoreUsername");
   
        //return responseRestoreUsername;

    }
*/
}
