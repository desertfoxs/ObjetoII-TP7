package Ejercicio1;

import java.util.List;

public class Notificar extends Observable implements LeerClima{

    private LeerClima leerClima;

    public Notificar(LeerClima leerClima, List<Observer> interesados) {
        super(interesados);
        this.leerClima = leerClima;
    }

    @Override
    public String leerTemperatura() {
        String temperatura = this.leerClima.leerTemperatura();
        this.notificar(temperatura);
        return temperatura;
    }
}
