package com.company.gdansk.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.company.gdansk.compare.Car.YEAR_COMPARATOR;

public class CompareMain {
    public static void main(String[] args) {
        Person p1 = new Person("a", "a", 30);
        Person p2 = new Person("b", "a", 20);
        Person p3 = new Person("a", "z", 29);
        Person p4 = new Person("a", "z", 28);

        List<Person> persons = Arrays.asList(p3, p4, p2, p1);

        System.out.println("---before sort---");
        for (Person person : persons) {
            System.out.println(person);
        }

        Collections.sort(persons, new AgeComparator());

        System.out.println("\n---after sort---");
        for (Person person : persons) {
            System.out.println(person);
        }

        List<Car> cars = new ArrayList<>();
        Collections.sort(cars, YEAR_COMPARATOR);
    }
}
