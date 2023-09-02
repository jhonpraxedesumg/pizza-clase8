package org.example;

import org.example.base.pizza.Topping;
import org.example.especialidad.PizzaItaliana;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PizzaItaliana p = new PizzaItaliana ("pizza margarita",10.99,"salsa de almejas");
        p.addTopping(new Topping("Tomato"));
        p.addTopping(new Topping("Mozarella"));
        p.addTopping(new Topping("Basil"));
        System.out.println("esta es la salsa"+ p.getSalsa());
        p.prepare();
    }
}