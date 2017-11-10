package com.company.inheritance.anabstract.vehicle;

public abstract class Vehicle {

    private int wheels;

    public abstract void start();

    public abstract void stop();

    public int getWheels() {
        return wheels;
    }

    public void closeGarage(){
        System.out.println("close");
    }
}
