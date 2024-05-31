package Ejercicio1;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba{
    @Test
    public void cambioDeTemp(){
        var medidor = new Notificar(new Medidor(new WeatherChannelService()), List.of(new ConsolaLog(), new GuardarTemp()));
        assertEquals("11,35 °C", medidor.leerTemperatura());
    }
}