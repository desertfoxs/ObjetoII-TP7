package Ejercicio5.Model.Tarjetas;

public class MasterCard extends Tarjeta {

    public MasterCard(String propietario, int numTarj, double descuento) {
        super(propietario, numTarj, descuento);
    }

    @Override
    public double aplicarDescuento(int montoTotal) {
        double montoApliado;
        montoApliado =  montoTotal - montoTotal* descuento;
        return montoApliado;
    }

}
