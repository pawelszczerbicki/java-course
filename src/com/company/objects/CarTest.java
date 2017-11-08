package com.company.objects;

public class CarTest {

    public static void main(String[] args) {
        Car bmw = new Car("bmw x");
        Car audi = new Car("a5");

        bmw.accelerate();
        bmw.accelerate();
        bmw.accelerate();
        bmw.accelerate();

        audi.accelerate();
        audi.accelerate();
        audi.accelerate();

        bmw.stop();

        Car[] cars = {bmw, audi};

        for (Car car : cars)
            if (car.isMoving())
                System.out.println("Car " + car.getName() + " is moving");



    }
}
