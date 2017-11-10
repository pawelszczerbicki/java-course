package com.company.inheritance;

public class Dog extends Animal {
    private String breed;
    private int pawAmount;
    private boolean isSick;

    public void setSick(boolean isSick) {
        this.isSick = isSick;
    }


    public void makeSound() {
        if (isSick)
            super.makeSound();
        else
            System.out.println("Hau!");
    }

    public String getBreed() {
        return breed;
    }
}
