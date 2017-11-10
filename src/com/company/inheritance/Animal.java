package com.company.inheritance;

public class Animal {
    protected int weight = 50;
    private int age=12;

    public void makeSound(){
        System.out.println("I can not make a sound");
    }


    public static void main(String[] args) {
       //wariant 1
        Animal animal = new Animal();
        System.out.println(animal.toString());

        //wariant 2
        System.out.println(new Animal());

        //wariant 1 = wariant 2
    }

    @Override
    public String toString(){
         return "age: " + age + " weight: " + weight;
    }
}
