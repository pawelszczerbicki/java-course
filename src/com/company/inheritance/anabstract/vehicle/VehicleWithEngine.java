package com.company.inheritance.anabstract.vehicle;

public abstract class VehicleWithEngine extends Vehicle {

    @Override
    public void start() {
        System.out.println("start engine");
    }
}
