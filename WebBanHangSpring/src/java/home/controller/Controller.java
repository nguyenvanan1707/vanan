/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author PC
 */
@org.springframework.stereotype.Controller
public class Controller {
     @RequestMapping(value = "/index")
     public String hello(ModelMap map){
         map.addAttribute("test", "hello");
         return "index";
     }
}
