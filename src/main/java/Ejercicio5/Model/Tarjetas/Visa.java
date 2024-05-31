package Ejercicio5.Model.Tarjetas;

import Ejercicio5.Model.Tarjetas.Tarjeta;

public class Visa extends Tarjeta {


    public Visa(String propietario, int numTarj, double descuento) {
        super(propietario, numTarj, descuento);
    }

    @Override
    public double aplicarDescuento(int montoTotal) {
        double montoApliado;
        montoApliado = montoTotal - montoTotal * descuento;
        return montoApliado;
    }

}
