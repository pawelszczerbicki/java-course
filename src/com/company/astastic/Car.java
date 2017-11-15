package com.company.astastic;

public class Car {
    private static final int WHEEL_AMOUNT = 4;

    private String model;
    private int year;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

//    public boolean equals(Object o) {
//        if (o == this)
//            return true;
//        Car c = (Car) o;
//        return model.equals(c.model) && year == c.year;
//    }
}
