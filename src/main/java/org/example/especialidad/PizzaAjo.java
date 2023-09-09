package org.example.especialidad;

import org.example.base.pizza.Pizza;

public class PizzaAjo extends Pizza {
    private String ajo;

    public PizzaAjo(String ajo) {
        this.ajo = ajo;
    }

    public String getAjo() {
        return ajo;
    }
}
