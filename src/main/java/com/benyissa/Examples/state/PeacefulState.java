package com.benyissa.Examples.state;

public class PeacefulState implements State {

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println("{} calms down.");
    }

    @Override
    public void observe() {
        System.out.println("{} is calm and peaceful.");
    }

}
