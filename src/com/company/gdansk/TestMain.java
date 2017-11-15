package com.company.gdansk;

public class TestMain {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Bike v2 = new Bike();
        Vehicle v3 = new Truck();

        printStart(v1);
        printStart(v2);
        printStart(v3);

        //anonymous
        Vehicle v = new Vehicle() {
            @Override
            public void start() {
            }
        };
    }

    public static void printStart(Vehicle v) {
        v.start();
        if (v instanceof Bike) {
            Bike b = (Bike) v;
            b.test();
        }

        if (Bike.class.isAssignableFrom(v.getClass())) {
            Bike b = (Bike) v;
            b.test();
        }
    }
}
