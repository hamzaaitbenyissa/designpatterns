package com.benyissa.Examples.adapter;

public class App {

    public static void main(String[] args) {
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
