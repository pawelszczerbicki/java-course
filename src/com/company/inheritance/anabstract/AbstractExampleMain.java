package com.company.inheritance.anabstract;

public class AbstractExampleMain {
    public static void main(String[] args) {
        //nie mozna inicjializowac obiektu klasy
        //absttrakcvyjnej
//        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal fish = new Fish();
        dog.makeSound();
        fish.makeSound();
    }

    public static void noise(Animal a){
        a.makeSound();
    }
}
