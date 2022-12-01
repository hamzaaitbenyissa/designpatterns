package com.benyissa.Examples.composite.sentenceexample;

import java.util.List;

public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        words.forEach(this::add);
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
