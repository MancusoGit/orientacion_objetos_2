package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    List<Ingrediente> ingredientes = new ArrayList<>();

    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public double calcularPrecio() {
        return this.ingredientes.stream()
                .mapToDouble(i -> i.getPrecio())
                .sum();
    }

    public void mostrarDetalle() {
        System.out.println("Ingredientes:");
        ingredientes.forEach(ing -> System.out.println(" - " + ing.toString()));
        System.out.println("Precio Total: $" + calcularPrecio() + "\n"); 
    }

}
