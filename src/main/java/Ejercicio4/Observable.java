package Ejercicio4;

import java.util.List;

public abstract class Observable {

    private List<Observer> observadores;

    public Observable(List<Observer> observadores) {
        this.observadores = observadores;
    }

    protected void notificar(String valor){
        for (Observer observer : observadores){
            observer.notificar(valor);
        }
    }
}
