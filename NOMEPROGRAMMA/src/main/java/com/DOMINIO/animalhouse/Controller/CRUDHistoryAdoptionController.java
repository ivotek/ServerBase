/*
 *
 * CRUD per la gestione della storia dell'adozione
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
public class CRUDHistoryAdoptionController {

    //public static final Logger logger = Logger.getLogger(CRUDHistoryAdoptionController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createhistoryadoption")
    public void createHistoryAdoption() {

        //logger.info("Controller CRUDHistoryAdoption -- createHistoryAdoption");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deletehistoryadoption")
    public void deleteHistoryAdoption() {

        //logger.info("Controller CRUDHistoryAdoption -- deleteHistoryAdoption");

    }

    @RequestMapping(value = "/animalhouse/updatehistoryadoption")
    public void updateHistoryAdoption() {

        //logger.info("Controller CRUDHistoryAdoption -- updateHistoryAdoption");

    }

    @RequestMapping(value = "/animalhouse/readhistoryadoption")
    public void readHistoryAdoption() {

        //logger.info("Controller CRUDHistoryAdoption -- readHistoryAdoption");

    }

}
