package com.company.gdansk.lists;

import com.company.gdansk.Vehicle;

import java.util.ArrayList;

public class TestGeneric<T extends Vehicle, K, V> {

    private T value;
    private K key;
    private V other;
    private String name;


    private ArrayList<T> elements;

    private ArrayList<? super Vehicle> vehicles;

    public TestGeneric(T value) {
        this.value = value;
    }

    public T some(){
        return null;
    }

    public void some(T t){

    }

}
