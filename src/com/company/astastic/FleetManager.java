package com.company.astastic;

import com.company.objects.Car;

public class FleetManager {
    private Car[] fleet = new Car[10];
    private int currentAmount = 0;

    public void addToFleet(Car newCar){
        fleet[currentAmount] = newCar;
        currentAmount++;
    }

    public  int carsAmount(){
        return currentAmount;
    }
}
