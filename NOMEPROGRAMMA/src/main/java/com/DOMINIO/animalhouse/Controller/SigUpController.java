/*
 *
 * Controller for managment sig up
 *
 */
package com.ivotek.animalhouse.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
//import org.apache.log4j.Logger;

/**
 *
 * @author Daniele Loddo alias ivotek www.ivotek.it ivotek@gmail.com
 *
 */
@RestController
@CrossOrigin("*")
public class SigUpController {
/*
    //public static final Logger logger = Logger.getLogger(SigUpController.class);

    @Autowired
    SigUpService sigUpService;

    //Login user for access
    @RequestMapping(value = "/animalhouse/sigup") 
    public ResponseSigUp login(@RequestBody RequestSigUp requestSigUp ) {
        
        ResponseSigUp responseSigUp;

        //logger.info("Controller SigInController enter -- SigUp");
        //logger.info("Email: " + requestSigUp.getEmail() + "Password: " + requestSigUp.getPassword());
        
        responseSigUp =  sigUpService.sigUp(requestSigUp.getEmail(), requestSigUp.getPassword());
        //logger.info("Controller SigInController exit -- SigUp");
        
        return responseSigUp;
    }
*/

}
