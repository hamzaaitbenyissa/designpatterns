package com.benyissa.Examples.LearnBuilder.Implementation2;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .Age(12)
                .Email("test")
                .City("Zagora")
                .Name("Hamza")
                .Build();
        System.out.println(person.age);
    }

}
