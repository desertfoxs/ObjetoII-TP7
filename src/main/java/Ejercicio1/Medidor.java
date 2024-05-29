package Ejercicio1;

import java.util.List;

public class Medidor extends Observable{

    private String temperatura;
    private ClimaOnline clima;

    public Medidor(ClimaOnline clima, List<Observer> interesados) {
        super(interesados);
        this.clima = clima;
    }

    public String leerTemperatura() {
        this.temperatura = this.clima.temperatura();
        this.notificar(temperatura);
        return temperatura;
    }

}
