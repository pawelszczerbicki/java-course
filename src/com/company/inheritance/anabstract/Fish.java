package com.company.inheritance.anabstract;

public class Fish extends Animal{
    private String waterType;

    @Override
    public void makeSound() {
        System.out.println("bul");
    }
}
