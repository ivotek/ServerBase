/*
 * 
 * CRUD per la gestione della staffetta
 * 
 */
package com.animalhouse.AnimalHouseweb.Controller;

//import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ivotek alias Daniele Loddo
 * ivotek@gmail.com
 * www.ivotek.it
 * 
 */

@RestController
@CrossOrigin("*")
public class CRUDRelayRaceController {
    
    
    //public static final Logger logger = Logger.getLogger(CRUDRelayRaceController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createrelayrace")
    public void createRelayRace() {

        //logger.info("Controller CRUDRelayRace -- createRelayRace");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deleterelayrace")
    public void deleteRelayRace() {

        //logger.info("Controller CRUDRelayRace -- deleteRelayRace");

    }

    @RequestMapping(value = "/animalhouse/updaterelayrace")
    public void updateRelayRace() {

        //logger.info("Controller CRUDRelayRace -- updateRelayRace");

    }

    @RequestMapping(value = "/animalhouse/readrelayrace")
    public void readRelayRace() {

        //logger.info("Controller CRUDRelayRace -- readRelayRace");

    }
    
}
