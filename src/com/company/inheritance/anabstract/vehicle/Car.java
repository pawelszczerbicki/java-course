package com.company.inheritance.anabstract.vehicle;

public class Car extends VehicleWithEngine {
    @Override
    public void start() {
        super.start();
        System.out.println("move");
    }

    @Override
    public void stop() {
        System.out.println("break");
    }
}
