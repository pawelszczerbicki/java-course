package com.company.objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Person father;
    private Person mother;

    //Konstruktor domyslny ktory jest w kazej klasie
    //o ile nie napiszemy innego konstruktora
    //ten konstuktor nie jest tutaj potrzebny poniewaz pozwala na stworzenie
    //osoby bez imienia i nazwiska co ma maly sens
    public Person() {
    }


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Person father) {
        //pozbywamy sie duplikacji kodu i wywolujemy konstruktor ktory juz istnieje
        this(name, surname);
        this.father = father;
    }

    public Person(String name, String surname, int newAge) {
        this(name, surname);
        age = newAge;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    //metoda zbyt malo uniwersalna - jest to zla praktyka
    public String getDisplayName() {
        String display = "My name is: " + name + ", my surname is " + surname;
        return display;
    }

}
