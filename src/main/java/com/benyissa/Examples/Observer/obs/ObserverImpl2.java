package org.example.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {

    private List<Integer> historique = new ArrayList<>();

    @Override
    public void update(int state) {
        historique.add(state);
        System.out.print("===================> Observer 2 :  ");
        System.out.println(historique);

    }
}
