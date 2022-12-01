package com.benyissa.Examples.LearnBuilder;

public class PersonBuilder {

    private String name;
    private String email;
    private String city;
    private int age;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

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
        return new Person(this);
    }

}

