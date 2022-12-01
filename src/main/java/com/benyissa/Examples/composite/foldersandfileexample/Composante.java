package com.benyissa.Examples.composite.foldersandfileexample;

import java.util.ArrayList;
import java.util.List;

public abstract class Composante {
    String nom;

    public Composante(String nom) {
    }

    public void afficher() {
        List l = new ArrayList();
        l.forEach(System.out::print);
        System.out.println("test d'affichagee");
    }
}
