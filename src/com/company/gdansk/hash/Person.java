package com.company.gdansk.hash;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o){
        Person p = (Person) o;
        return name.equals(p.name) && age == p.age;
    }

    public int hashCode(){
        return name.hashCode() + age;
    }
}
