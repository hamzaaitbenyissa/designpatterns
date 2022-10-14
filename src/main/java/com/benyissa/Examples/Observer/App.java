package org.example;

import org.example.obs.ObservableImpl;
import org.example.obs.Observer;
import org.example.obs.ObserverImpl2;
import org.example.obs.ObserverImpl3;

public class App {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        Observer observer2 = new ObserverImpl2();
        Observer observer3 = new ObserverImpl3();
        observable.subscribe(observer2);
        observable.subscribe(observer3);
        observable.setState(80);
    }
}
