/*
 *
 * CRUD per la gestione della posizione dell'animale da adottato
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
public class CRUDAnimalPositionAdoptedController {

    //public static final Logger logger = Logger.getLogger(CRUDAnimalPositionAdoptedController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createanimalpositionadopted")
    public void createAnimalPositionAdopted() {

        //logger.info("Controller CRUDAnimalPositionAdopted -- createAnimalPositionAdopted");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deleteanimalpositionadopted")
    public void deleteAnimalPositionAdopted() {

        //logger.info("Controller CRUDAnimalPositionAdopted -- deleteAnimalPositionAdopted");

    }

    @RequestMapping(value = "/animalhouse/updateanimalpositionadopted")
    public void updateAnimalPositionAdopted() {

        //logger.info("Controller CRUDAnimalPositionAdopted -- updateAnimalPositionAdopted");

    }

    @RequestMapping(value = "/animalhouse/readanimalpositionadopted")
    public void readAnimalPositionAdopted() {

        //logger.info("Controller CRUDAnimalPositionAdopted -- readAnimalPositionAdopted");

    }

}
