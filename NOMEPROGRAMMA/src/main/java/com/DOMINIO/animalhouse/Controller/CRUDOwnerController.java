/*
 * 
 * CRUD per la gestione del padrone
 * 
 */
package com.animalhouse.AnimalHouseweb.Controller;

//import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ivotek alias Daniele Loddo ivotek@gmail.com www.ivotek.it
 *
 */
@RestController
@CrossOrigin("*")
public class CRUDOwnerController {

    //public static final Logger logger = Logger.getLogger(CRUDOwnerController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createowner")
    public void createOwner() {

        //logger.info("Controller CRUDOwner -- createOwner");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deleteowner")
    public void deleteOwner() {

        //logger.info("Controller CRUDOwner -- deleteOwner");

    }

    @RequestMapping(value = "/animalhouse/updateowner")
    public void updateOwner() {

        //logger.info("Controller CRUDOwner -- updateOwner");

    }

    @RequestMapping(value = "/animalhouse/readowner")
    public void readOwner() {

        //logger.info("Controller CRUDOwner -- readOwner");

    }

}
