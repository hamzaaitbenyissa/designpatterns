package com.benyissa.Examples.composite.sentenceexample;

public class Main {

    public static void main(String[] args) {
        var messenger = new Messenger();
        System.out.println("Message from the orcs: ");
        messenger.messageFromOrcs().print();

        System.out.println();
        System.out.println("Message from the elves: ");
        messenger.messageFromElves().print();
    }
}
