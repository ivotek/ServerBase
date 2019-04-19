/*
 *
 * CRUD per la gestione dell'animale
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
public class CRUDAnimalController {

    //public static final Logger logger = Logger.getLogger(CRUDAnimalController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createanimal")
    public void createAnimal() {

        //logger.info("Controller CRUDAnimal -- createAnimal");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deleteanimal")
    public void deleteAnimal() {

        //logger.info("Controller CRUDAnimal -- deleteAnimal");

    }

    @RequestMapping(value = "/animalhouse/updateanimal")
    public void updateAnimal() {

        //logger.info("Controller CRUDAnimal -- updateAnimal");

    }

    @RequestMapping(value = "/animalhouse/readanimal")
    public void readAnimal() {

        //logger.info("Controller CRUDAnimal -- readAnimal");

    }

}
