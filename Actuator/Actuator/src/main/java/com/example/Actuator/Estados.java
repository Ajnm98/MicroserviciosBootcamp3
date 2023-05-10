package com.example.Actuator;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Endpoint(id="estados")
public class Estados {

    private List<String> listEstado = new ArrayList<>();

    @ReadOperation
    public List<String> listEstados(){

        return listEstado;
    }
    @WriteOperation
    public void saveEstado(@Selector String estado){
        listEstado.add(estado);
    }


    @DeleteOperation
    public void deleteEstado(@Selector String estado){
        listEstado.remove(estado);
    }
}
