package com.company.gdansk.hash;

import java.util.HashSet;

public class HashMainTest {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("aab");
        names.add("b");
        names.add("aab");

//        System.out.println(names.size());
//
//        for (String name : names) {
//            System.out.println(name);
//        }

        HashSet<Person> persons = new HashSet<>();
        persons.add(new Person("jan", 20));
        persons.add(new Person("jan", 20));
        persons.add(new Person("jan", 20));

        System.out.println(persons.size());
    }
}
