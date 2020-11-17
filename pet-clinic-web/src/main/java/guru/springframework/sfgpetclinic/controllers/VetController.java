package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    VetService vetService;

    @RequestMapping({"/vets","vets/index","/vets/index.html"})
    public String listVets(){


        return "vets/index";
    }
}
