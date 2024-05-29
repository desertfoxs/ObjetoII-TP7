package Ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {

    @Test
    public void cambioDeTemp(){

        var medidor = new Medidor(new WeatherChannelService(), List.of(new ConsolaLog()));
        assertEquals("11,10 °C", medidor.leerTemperatura());
    }
}
