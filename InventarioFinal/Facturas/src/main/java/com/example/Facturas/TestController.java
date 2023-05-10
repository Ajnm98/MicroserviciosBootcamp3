package com.example.Facturas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/obtener")
    public String facturas(){
        return "facturas";
    }
}