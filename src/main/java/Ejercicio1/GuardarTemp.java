package Ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GuardarTemp implements Observer{

    private String url = "C:/Users/desertfoxs/Desktop/txt Tp7/";
    private String nombre = "TemperaturaHoy.txt";

    @Override
    public void actualizar(String valor){
        try {
            if (Files.notExists(Path.of(url+ nombre))) {
                Files.writeString(Paths.get(url + nombre), valor + "\n", StandardOpenOption.CREATE);
            }
            else{
                Files.writeString(Paths.get(url + nombre), valor + "\n", StandardOpenOption.APPEND);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
