package com.company.gdansk.lists;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList names = new MyArrayList() ;

        MyArrayList cars = new MyArrayList();

        names.add("name 1");
        names.add("name 2");
        names.add("name 3");


        System.out.println("imie 1 = " + names.get(1));
        System.out.println("auto 1 =  " + cars.get(1));
    }
}
