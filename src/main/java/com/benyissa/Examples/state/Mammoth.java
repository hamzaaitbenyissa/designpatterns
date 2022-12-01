package com.benyissa.Examples.state;

public class Mammoth {
    private State state;

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    public Mammoth() {
        state = new PeacefulState(this);
    }

    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        } else {
            changeStateTo(new PeacefulState(this));
        }
    }

    @Override
    public String toString() {
        return "The mammoth";
    }

    public void observe() {
        this.state.observe();
    }
}
