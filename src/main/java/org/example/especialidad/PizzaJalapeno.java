package org.example.especialidad;

import org.example.base.pizza.Pizza;

public class PizzaJalapeno extends Pizza {
    private String jalapeno;

    public PizzaJalapeno(String jalapeno) {
        this.jalapeno = jalapeno;
    }

    public String getJalapeno() {
        return jalapeno;
    }
}
