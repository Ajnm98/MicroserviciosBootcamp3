package com.example.Personal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/obtener")
    public String personal(){
        return "personal";
    }
}