/*
 *
 * CRUD per la gestione della reputazione
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
public class CRUDAReputationController {

    //public static final Logger logger = Logger.getLogger(CRUDAReputationController.class);

//    @Autowired
//    AGestioneCasseService gcs;
    @RequestMapping(value = "/animalhouse/createreputation")
    public void createReputation() {

        //logger.info("Controller CRUDAReputation -- createReputation");
//        ModelAndView mav = new ModelAndView("/angliagestionecassa");
//
//        return mav;
    }

    @RequestMapping(value = "/animalhouse/deletereputation")
    public void deleteReputation() {

        //logger.info("Controller CRUDAReputation -- deleteReputation");

    }

    @RequestMapping(value = "/animalhouse/updatereputation")
    public void updateRputation() {

        //logger.info("Controller CRUDAReputation -- updateRputation");

    }

    @RequestMapping(value = "/animalhouse/readreputation")
    public void readReputation() {

        //logger.info("Controller CRUDAReputation -- readReputation");

    }

//      @RequestMapping(value = "/AInserisciProdotto")
//    public RigaScontrino inserisciProdotto(@RequestBody FindProdottiRichiestaDto ean) {
//        logger.debug("Siamo nel controller inserisciProdotto ");
//        logger.debug("Valore ean: " + ean.getIdScontrino());
//
//        RigaScontrino rs = gcs.inserisciInScontrino(ean);
//        return rs;
//    }
}
