package Ejercicio5.Model;

import java.util.HashMap;
import java.util.Map;

public class Pedido {

    Map<Plato, Integer> platos = new HashMap<>();
    Map<Comida, Integer> comidas = new HashMap<>();
    Map<Bebida, Integer> bebidas = new HashMap<>();
    private int costoTotal;
    private int costoDescuento;
    private int precioTotalComida;
    private int precioTotalBebida;
    private int propina;

    public Pedido() {
        this.costoTotal = 0;
        this.costoDescuento = 0;
        this.propina = 0;
    }

    public void agregar(Plato plato) {
        if (precioTotalComida == 0) {
            if (platos.containsKey(plato)) {
                platos.put(plato, (platos.get(plato)) + 1);
            } else {
                platos.put(plato, 1);
            }
        }
    }

    public int calcularPrecioTotal() {
        precioTotalComida = calcularPrecioPlato();

        return calcularPrecioPlato();
    }

    public int calcularPrecioPlato() {

        int precioComidaFinal = 0;

        for (Plato plato : platos.keySet()) {
            precioComidaFinal += plato.getPrecio();
        }

        return precioComidaFinal;

    }
}
