package com.company.objects;

public class Car {

    private static final int MAX_SPEED = 10;
    public static int MIN_SPEED = 50;

    private String name;
    private int speedInMilesPerHour = 0;

    public Car(String name) {
        this.name = name;
  
    }

    public void accelerate() {
        if (speedInMilesPerHour < MAX_SPEED)
            speedInMilesPerHour++;
    }

    public void stop() {
        speedInMilesPerHour = 0;
    }

    public String getName() {
        return name;
    }

    public int getSpeedInMilesPerHour() {
        return speedInMilesPerHour;
    }

    public boolean isMoving() {
        return speedInMilesPerHour > 0;
    }
}
