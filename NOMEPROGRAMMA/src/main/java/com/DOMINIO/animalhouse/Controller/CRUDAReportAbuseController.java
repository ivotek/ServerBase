/*
 *
 * CRUD per la gestione della segnalazione di un abuso
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
public class CRUDAReportAbuseController {

    //public static final Logger logger = Logger.getLogger(CRUDAReportAbuseController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createreporabuse")
    public void createReporAbuse() {

        //logger.info("Controller CRUDAReportAbuse -- createReporAbuse");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deletereporabuse")
    public void deleteReporAbuse() {

        //logger.info("Controller CRUDAReportAbuse -- deleteReporAbuse");

    }

    @RequestMapping(value = "/animalhouse/updatereporabuse")
    public void updateReporAbuse() {

        //logger.info("Controller CRUDAReportAbuse -- updateReporAbuse");

    }

    @RequestMapping(value = "/animalhouse/readreporabuse")
    public void readReporAbuse() {

        //logger.info("Controller CRUDAReportAbuse -- readReporAbuse");

    }

}
