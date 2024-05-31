package Ejercicio5.Model;

public class Bebida implements Plato{

    private String nombre;
    private int precio;

    public Bebida(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
