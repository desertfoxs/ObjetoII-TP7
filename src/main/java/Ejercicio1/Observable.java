package Ejercicio1;

import java.util.List;

public abstract class Observable {

    private List<Observer> observadores;

    public Observable(List<Observer> observadores) {
        this.observadores = observadores;
    }

    public void agregarObservadores(Observer obs){
        this.observadores.add(obs);
    }

    protected void notificar(String valor){
        for (Observer observer : observadores){
            observer.actualizar(valor);
        }
    }

}
