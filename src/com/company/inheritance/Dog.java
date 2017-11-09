package com.company.inheritance;

public class Dog extends Animal {
    private String breed;
    private int pawAmount;

    public void makeSound() {
        System.out.println("Hau!");
    }

    public String getBreed() {
        return breed;
    }
}
