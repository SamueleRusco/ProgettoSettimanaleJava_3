package com.spring_progettoSettimanale3.model;

import com.spring_progettoSettimanale3.model.Observer;
import lombok.Data;
import java.util.List;
import java.util.ArrayList;




@Data
public class Sonda {
    private List<Observer> observers = new ArrayList<>();
    private int idSonda;
    private double latitudine;
    private double longitudine;
    private int livelloFumo;

    public Sonda(int idSonda, double latitudine, double longitudine, int livelloFumo) {
        this.idSonda = idSonda;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.livelloFumo = livelloFumo;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setLivelloFumo(int livelloFumo) {
        this.livelloFumo = livelloFumo;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(idSonda, latitudine, longitudine, livelloFumo);
        }
    }
}
