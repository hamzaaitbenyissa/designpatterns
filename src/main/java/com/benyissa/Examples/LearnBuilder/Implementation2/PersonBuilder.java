package com.benyissa.Examples.LearnBuilder.Implementation2;

public class PersonBuilder {

    private String name;
    private String email;
    private String city;
    private int age;

    public PersonBuilder Name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder Email(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder City(String city) {
        this.city = city;
        return this;

    }

    public PersonBuilder Age(int age) {
        this.age = age;
        return this;
    }

    public Person Build() {
        Person person = new Person();
        person.setAge(this.age);
        person.setEmail(this.email);
        person.setName(this.name);
        person.setCity(this.city);
        return person;
    }

}

