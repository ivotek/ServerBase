/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivotek.animalhouse.Controller;

import com.ivotek.animalhouse.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ivotek
 */
@RestController
@CrossOrigin("*")
public class TestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    
    @RequestMapping("/test")
    public String init() {
        System.out.println("Entrato nel controller Home");
        System.out.println("CIAO");
        return "Ciao";
    }
    
   @RequestMapping("/test1")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println("SONO DENTRO test1");
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    

}
