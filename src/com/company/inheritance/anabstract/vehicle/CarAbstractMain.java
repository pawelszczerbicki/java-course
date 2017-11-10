package com.company.inheritance.anabstract.vehicle;

public class CarAbstractMain {
    public static void main(String[] args) {
        Vehicle v = new Car();
        VehicleWithEngine ve = new Car();
        Car c = new Car();

        startVehicle(v);

        Vehicle motorbike = new Vehicle() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };

        VehicleWithEngine engine = new VehicleWithEngine() {
            @Override
            public void stop() {

            }
        };
       //anonimowe stworzenie obiektu klasy abstrakcyjnej
      EmptyAbstract some =  new EmptyAbstract(){};
    }

    public static void startVehicle(Vehicle v){
        v.start();
    }
}
