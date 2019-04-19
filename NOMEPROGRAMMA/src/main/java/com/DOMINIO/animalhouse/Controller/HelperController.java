/*
 *
 * Controller per la gestione delle richieste di aiuto
 * e le segnalazioni di bug
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
public class HelperController {

    //public static final Logger logger = Logger.getLogger(HelperController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/sendquestion")
    public void sendQuestion() {

        //logger.info("Controller HelperController -- sendQuestion");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/findquestion")
    public void findQuestion() {

        //logger.info("Controller HelperController -- findQuestion");

    }

    @RequestMapping(value = "/animalhouse/sendemail")
    public void sendEmail() {

        //logger.info("Controller HelperController -- sendEmail");

    }

    @RequestMapping(value = "/animalhouse/sendbug")
    public void sendBug() {

        //logger.info("Controller HelperController -- sendBug");

    }

}
