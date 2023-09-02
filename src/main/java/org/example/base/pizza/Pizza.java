package org.example.base.pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    public class pizza {
        private String name;
        private double price;
        private List<Topping> toppings = new ArrayList<>();

        //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
        public pizza(String name, double price, Topping... toppings) {
            this.name = name;
            this.price = price;
            for (Topping topping : toppings) {
                this.toppings.add(topping);
            }
        }

        public void addTopping(Topping topping) {
            this.toppings.add(topping);
        }

        public void removeTopping(int index) {
            this.toppings.remove(index);
        }

        public List<Topping> getToppings() {

            return Collections.unmodifiableList(new ArrayList<>(toppings));
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Pizza{" + "name='" + name + '\'' + ", price=" + price + ", toppings=" + toppings + '}';
        }

        public void prepare() {
            System.out.println("Preparing..... " + name);
            System.out.println("Adding toppings:");
            for (Topping topping : toppings) {
                System.out.println("- " + topping.getNombre());
                //put 1 second delay
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("The Pizza is ready!");
        }
    }
    public class Topping {



        private String nombre; // Nombre del topping
        private ArrayList<String> ingredientes = new ArrayList<>(); // Ingredientes del topping

        public void agregarIngrediente(String ingrediente) {
            this.ingredientes.add(ingrediente);
        }

        public Topping(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Topping{" + "nombre='" + nombre + '\'' + ", ingredientes=" + ingredientes + '}';
        }


        //getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public ArrayList<String> getIngredientes() {
            return ingredientes;
        }

        public void setIngredientes(ArrayList<String> ingredientes) {
            this.ingredientes = ingredientes;
        }


    }
}
