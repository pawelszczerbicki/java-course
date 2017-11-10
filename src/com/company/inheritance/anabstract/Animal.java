package com.company.inheritance.anabstract;

public abstract class Animal {
    private int weight;
    private int age;

    public abstract void makeSound();

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

}
