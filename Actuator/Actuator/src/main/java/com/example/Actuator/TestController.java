package com.example.Actuator;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private Counter counter;


    public TestController(MeterRegistry meterRegistry){
        this.counter = Counter.builder("invocaciones hello").description("Invocaciones totales de hello").register(meterRegistry);
    }


    @GetMapping("/hello")
    public String helloWorld(){
        counter.increment();
        return "hello World";
    }



}
