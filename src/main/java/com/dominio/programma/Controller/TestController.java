/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.programma.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniele Loddo alias ivotek
 * www.ivotek.it
 * ivotek@gmail.com
 */
@RestController
@CrossOrigin("*")
public class TestController {

    @RequestMapping("/test")
    public String init() {
        System.out.println("Entrato nel controller test");
        System.out.println("Test controller ok");
        return "ok";
    }
   
}
