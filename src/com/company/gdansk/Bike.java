package com.company.gdansk;

public class Bike implements Vehicle {
    public void test(){
        System.out.println("test");
    }

    @Override
    public void start() {
        System.out.println("Start a bike");
    }
}
