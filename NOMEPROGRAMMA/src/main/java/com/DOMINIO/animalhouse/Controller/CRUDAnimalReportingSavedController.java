/*
 *
 * CRUD per la gestione della segnalazione di un salvataggio
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
public class CRUDAnimalReportingSavedController {

    //public static final Logger logger = Logger.getLogger(CRUDAnimalReportingSavedController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createreportingsaved")
    public void createReportingSaved() {

        //logger.info("Controller CRUDAnimalReportingSaved -- createReportingSaved");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deletereportingsaved")
    public void deleteReportingSaved() {

        //logger.info("Controller CRUDAnimalReportingSaved -- deleteReportingSaved");

    }

    @RequestMapping(value = "/animalhouse/updatereportingsaved")
    public void updateReportingSaved() {

        //logger.info("Controller CRUDAnimalReportingSaved -- updateReportingSaved");

    }

    @RequestMapping(value = "/animalhouse/readreportingsaved")
    public void readReportingSaved() {

        //logger.info("Controller CRUDAnimalReportingSaved -- readReportingSaved");

    }

}
