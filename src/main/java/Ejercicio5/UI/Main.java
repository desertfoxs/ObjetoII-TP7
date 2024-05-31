package Ejercicio5.UI;

import Ejercicio5.Model.Restaurante;

import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().start();
            }
        });
    }

    private void start() {

        Restaurante restaurante = new Restaurante("Olivetti", List.of(new GerenteGeneral()));
        SeleccionarPlatos seleccionarPlatos = new SeleccionarPlatos(restaurante);
        seleccionarPlatos.iniciar();
    }
}
