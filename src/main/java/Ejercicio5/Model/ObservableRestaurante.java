package Ejercicio5.Model;
import Ejercicio5.Model.Observer;
import Ejercicio5.Model.Plato;

import java.util.List;

public abstract class ObservableRestaurante {

    private List<Observer> observadores;

    public ObservableRestaurante(List<Observer> observadores) {
        this.observadores = observadores;
    }

    public void notificar(int plato){
        for (Observer observer : observadores){
            observer.notificar(plato);
        }
    }
}
