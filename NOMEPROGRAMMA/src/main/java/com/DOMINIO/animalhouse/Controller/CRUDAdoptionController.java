/*
 *
 * CRUD per la gestione dell'adozione
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
public class CRUDAdoptionController {

    //public static final Logger logger = Logger.getLogger(CRUDAdoptionController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createadoption")
    public void createAdoption() {

        //logger.info("Controller CRUDAdoption -- createAdoption");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deleteAdoption")
    public void deleteAdoption() {

        //logger.info("Controller CRUDAdoption -- deleteAdoption");

    }

    @RequestMapping(value = "/animalhouse/updateAdoption")
    public void updateAdoption() {

        //logger.info("Controller CRUDAdoption -- updateAdoption");

    }

    @RequestMapping(value = "/animalhouse/readanimalreportingadopted")
    public void readAnimalReportingAdopted() {

        //logger.info("Controller CRUDAdoption -- readAnimalReportingAdopted");

    }

}
