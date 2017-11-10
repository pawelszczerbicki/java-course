package com.company.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Fish fish = new Fish();
//        dog.makeSound();
//        fish.makeSound();
        
        Animal otherDog = new Dog();

        makeSomeSound(fish);
        makeSomeSound(dog);
        makeSomeSound(otherDog);
    }


    public static void makeSomeSound(Animal a){
//        Dog.class.isAssignableFrom(a.getClass());
        if(a instanceof Dog){
            System.out.print("I'm dog ----");
            Dog d = (Dog) a;  // rzutowanie
            System.out.print("my race is " + d.getBreed() + " ");
        }
        a.makeSound();
    }

}
