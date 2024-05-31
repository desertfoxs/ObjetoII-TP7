package Ejercicio5.Model;

public class Comida implements Plato{

    private String nombre;
    private int precio;

    public Comida(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
