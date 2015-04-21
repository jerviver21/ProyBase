package edu.paideia.base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping("/app/empleados")
    public String r1(){
        return "protected/empleados";
    }
	

	@RequestMapping("/resources/js/angular.js")
    public String r2(){
        return "resources/js/angular.js";
    }
	
	@RequestMapping("/resources/js/modules.js")
    public String r3(){
        return "resources/js/modules.js";
    }
	
	@RequestMapping("/resources/js/empleados/empleados_controller.js")
    public String r4(){
        return "resources/js/empleados/empleados_controller.js";
    }

}
