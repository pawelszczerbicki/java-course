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




        System.out.println(bmw.MIN_SPEED);
        System.out.println(audi.MIN_SPEED);
        bmw.MIN_SPEED = 150 ;
        Car.MIN_SPEED = 3;
        System.out.println("------------- po zmianie");

        System.out.println(bmw.MIN_SPEED);
        System.out.println(audi.MIN_SPEED);

        Car[] cars = {bmw, audi};

        for (Car car : cars)
            if (car.isMoving())
                System.out.println("Car " + car.getName() + " is moving");



    }
}
