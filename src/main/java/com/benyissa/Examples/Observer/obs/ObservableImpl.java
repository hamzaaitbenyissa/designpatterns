package org.example.obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state = 10;

    public void setState(int newstate) {
        state = newstate;
        this.notifyObservers();
    }


    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
