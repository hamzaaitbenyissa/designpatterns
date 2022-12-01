package com.benyissa.Examples.LearnBuilder;

public class Person {

    String name;
    String email;
    String city;
    int age;

    public Person Name(String name) {
        this.name = name;
        return this;
    }

    public Person(PersonBuilder personBuilder) {

        this.age = personBuilder.getAge();
        this.name = personBuilder.getName();
        this.email = personBuilder.getEmail();
        this.city = personBuilder.getCity();
    }

    PersonBuilder Builder() {
        return new PersonBuilder();
    }
}
