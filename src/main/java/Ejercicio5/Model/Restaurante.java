package Ejercicio5.Model;

import Ejercicio5.Model.Tarjetas.Tarjeta;

import java.time.LocalDateTime;
import java.util.List;

public class Restaurante extends ObservableRestaurante{

    private String nombre;
    private Pedido pedido;
    public Restaurante(String nombre, List<Observer> interesados) {
        super(interesados);
        this.nombre = nombre;
        pedido = new Pedido();
    }

    public double pagarCuenta(Tarjeta tarjeta) {

        double dineroPagar = 0;

        pedido.calcularPrecioPlato();
        dineroPagar = tarjeta.aplicarDescuento(pedido.calcularPrecioTotal());

        LocalDateTime tiempo = LocalDateTime.now();
        
        String mensaje = tiempo.toString() + "---" + pedido.calcularPrecioTotal() + "\n";

        //calcularPropina(propinaPorc, (int) dineroPagar);

        this.notificar((int) dineroPagar);

        return dineroPagar;
    }


    public int calcularPropina(int porcentaje, int precioTotal) {

        int propina = 0;

        if (porcentaje < 6 && porcentaje != 4 && porcentaje > 1) {
            propina = (porcentaje * precioTotal) / 100;
        } else {
            throw new RuntimeException("cantidad de porcentaje no valida, tiene que ser 2, 3 o 5");
        }

        return propina;
    }

    public void AgregarPedido(Plato plato) {
        //this.notificar(plato);
        pedido.agregar(plato);
        System.out.println("se agrego un producto");
    }
}
