package Ejercicio5.UI;

import Ejercicio5.Model.*;
import Ejercicio5.Model.Tarjetas.Visa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class SeleccionarPlatos{

    private Restaurante restaurante;

    SeleccionarPlatos(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void iniciar() {
        //CuentaBancaria cuenta = new CuentaBancaria(0);

        JFrame dialog = new JFrame("Cajero Automático");
        dialog.setLayout(new FlowLayout());
        JButton bebida1 = new JButton("Pepsi $1000");
        bebida1.setFont(new Font("Dialog", Font.PLAIN, 20));
        bebida1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //cuenta.depositar(1000);
                //monitor.nuevoMonto(cuenta.saldo());
                Plato plato = new Bebida("Pepsi", 1000);
                restaurante.AgregarPedido(plato);
            }

        });

        JButton bebida2 = new JButton("CocaCola $1500");
        bebida2.setFont(new Font("Dialog", Font.PLAIN, 20));
        bebida2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //cuenta.depositar(1000);
                //monitor.nuevoMonto(cuenta.saldo());
                Plato plato = new Bebida("CocaCola", 1500);
                restaurante.AgregarPedido(plato);
            }
        });

        JButton comida1 = new JButton("Pizza $3500");
        comida1.setFont(new Font("Dialog", Font.PLAIN, 20));
        comida1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Plato plato = new Comida("pizza", 3500);
                restaurante.AgregarPedido(plato);
            }
        });

        JButton comida2 = new JButton("Hamburguesa $4500");
        comida2.setFont(new Font("Dialog", Font.PLAIN, 20));
        comida2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Plato plato = new Comida("Hamburguesa", 45000);
                restaurante.AgregarPedido(plato);
            }
        });

        JButton pagar = new JButton("PAGAR");
        pagar.setFont(new Font("Dialog", Font.PLAIN, 20));
        pagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restaurante.pagarCuenta( new Visa("olivetti", 000, 0.1));
            }
        });

        dialog.add(bebida1);
        dialog.add(bebida2);
        dialog.add(comida1);
        dialog.add(comida2);
        dialog.add(pagar);

        dialog.setBounds(200,200,400,180);
        dialog.setLocation(600, 200);
        dialog.setVisible(true);


    }
    

}
