package com.example.temperatura;

public class Temperatura {

    private double grados;
    private String tipo;


    public Temperatura(double grados, String tipo) {
        this.grados = grados;
        this.tipo = tipo;
    }

    public Temperatura cambiarTipo() {

        switch (tipo) {
            case "Celsius":
                return new Temperatura(grados * (9 / 5) + 32, "Fahrenheit");
            case "Fahrenheit":
                return new Temperatura((grados - 32) * 5 / 9, "Celsius");
            default: return this;
        }

    }

}
