/*
 *
 * CRUD per la gestione del volontario
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
public class CRUDVolunteerController {

    //public static final Logger logger = Logger.getLogger(CRUDVolunteerController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createvolunteerc")
    public void createVolunteer() {

        //logger.info("Controller CRUDVolunteer -- createVolunteer");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deletevolunteer")
    public void deleteVolunteer() {

        //logger.info("Controller CRUDVolunteer -- deleteVolunteer");

    }

    @RequestMapping(value = "/animalhouse/updatevolunteer")
    public void updateVolunteeer() {

        //logger.info("Controller CRUDVolunteer -- updateVolunteeer");

    }

    @RequestMapping(value = "/animalhouse/readvolunteer")
    public void readVolunteer() {

        //logger.info("Controller CRUDVolunteer -- readVolunteer");

    }

}
