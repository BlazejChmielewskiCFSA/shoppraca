package pl.testing.naukaw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Api {

    @GetMapping("/forUser")
    public String getUser(Principal principal){
        return "Hello user: " + principal.getName();
    }

    @GetMapping("/forAll")
    public String getAll(){
        return "Hello all";
    }

    @GetMapping("/forAdmin")
    public String getAdmin(Principal principal){
        return "Hello Admin: " + principal.getName();
    }

}
