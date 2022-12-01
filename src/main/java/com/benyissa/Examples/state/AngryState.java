package com.benyissa.Examples.state;

public class AngryState implements State {

    private final Mammoth mammoth;
    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }


    @Override
    public void onEnterState() {
        System.out.println("{} gets angry!");
    }

    @Override
    public void observe() {
        System.out.println("{} is furious!");
    }

}
