package org.example.obs;

public class ObserverImpl3 implements Observer {

    int laststate;

    @Override
    public void update(int state) {
        System.out.print("===================> Observer 3 :  ");


        if (state > laststate)
            System.out.println("UP");
        else
            System.out.println("DOWN");
        laststate = state;

    }
}
