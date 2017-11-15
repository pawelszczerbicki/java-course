package com.company;

import com.company.astastic.Car;

public class Sda {

    public static void main(String[] args) {

        Car audi = null;
        Car bwm = new Car(2017, "a5");

        System.out.println(audi == bwm);
        System.out.println(audi.equals(bwm));

        if(audi.equals(null))
            System.out.println("jest nullem");
        else
            System.out.println("nie jest nullem");
    }
}
