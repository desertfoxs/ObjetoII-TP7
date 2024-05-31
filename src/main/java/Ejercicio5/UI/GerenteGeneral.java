package Ejercicio5.UI;

import Ejercicio5.Model.Observer;

import javax.swing.*;
import java.awt.*;

public class GerenteGeneral implements Observer {
    private JLabel label;

    public GerenteGeneral() {
        JFrame frame = new JFrame("Pantalla Gerente");
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        label = new JLabel("...");
        label.setFont(new Font("Dialog", Font.PLAIN, 20));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }

    public void nuevoMonto(int precio) {
        if(precio > 300000){
            label.setText(String.valueOf(precio));
            label.setForeground(Color.red);
        }
        else{
            label.setText(String.valueOf(precio));
            label.setForeground(Color.BLACK);
        }

    }

    @Override
    public void notificar(int precio) {
        nuevoMonto(precio);
    }
}
