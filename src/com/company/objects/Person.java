package com.company.objects;

public class Person {
    public String name;
    public String surname;
    private int age;
    private Person father;
    private Person mother;

    //Konstruktor domyslny ktory jest w kazej klasie
    //o ile nie napiszemy innego konstruktora
    public Person() {

    }

    public Person(String name, String surname) {
         this.name = name;
    }

    public Person(String name, String surname, int age) {

    }

    public String getFullName() {
        return name + " " + surname;
    }
}
