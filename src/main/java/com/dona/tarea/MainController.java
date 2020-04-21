package com.dona.tarea;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    
    @RequestMapping(value="/datos", method=RequestMethod.GET)
    public @ResponseBody String ejemplo() {
        
        return "Nombre: Alejandro Apellido: Hernandez Carnet: 00084417 ";
    }
}