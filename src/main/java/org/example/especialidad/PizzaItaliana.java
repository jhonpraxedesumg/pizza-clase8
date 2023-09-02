package org.example.especialidad;

import org.example.base.pizza.Pizza;

public class PizzaItaliana extends Pizza {
    private String salsa;
    public PizzaItaliana(String name,double price, String salsa, Topping...toppings){
        super(name,price,toppings);
        this.salsa=salsa;
    }
    public String getSalsa(){
        return salsa;
    }

}
