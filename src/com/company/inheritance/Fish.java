package com.company.inheritance;

public class Fish extends Animal {
    private String waterType;

    public int getWeight() {
        return weight;
    }

    @Override
    public void makeSound() {
        System.out.println("bul bul");
    }
}
