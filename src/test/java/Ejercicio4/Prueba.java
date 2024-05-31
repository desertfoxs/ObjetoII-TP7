package Ejercicio4;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class Prueba {

    @Test
    public void enviarUnGmail(){
        Participante participante0 = new Participante("Angel", 44705032);
        Concurso concurso0 = new Concurso(2, "Boletira", LocalDateTime.now().plusMonths(1), List.of(new EnviarGmail()));
        concurso0.inscribir(participante0);
    }

}
