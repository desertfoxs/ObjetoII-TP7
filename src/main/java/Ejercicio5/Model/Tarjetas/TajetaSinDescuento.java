package Ejercicio5.Model.Tarjetas;

public class TajetaSinDescuento extends Tarjeta {


    public TajetaSinDescuento(String propietario, int numTarj, double descuento) {
        super(propietario, numTarj, descuento);
    }

    @Override
    public double aplicarDescuento(int montoTotal) {
        return montoTotal;
    }

}
