package org.example.base.pizza.interfaz;

public class pizzaBase {
    private double precio;
    public pizzaBase(String n, double p){
        this.nombre= n;
        this.precio=p;
    }
    @Override
    public void prepare(){
        System.out.println("preparandp pizza");
        System.out.println("pizza lista");
    }
}
