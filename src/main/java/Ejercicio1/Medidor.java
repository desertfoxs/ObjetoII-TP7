package Ejercicio1;

import java.util.List;

public class Medidor implements LeerClima{

    private String temperatura;
    private ClimaOnline clima;

    public Medidor(ClimaOnline clima) {
        this.clima = clima;
    }

    public String leerTemperatura() {
        this.temperatura = this.clima.temperatura();
        //this.notificar(temperatura); //sacar esto y agregar un decorador
        return temperatura;
    }
}
