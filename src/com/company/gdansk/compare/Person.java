package com.company.gdansk.compare;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person p) {
        if (!surname.equals(p.surname))
            return surname.compareTo(p.surname);
        if (!name.equals(p.name))
            return name.compareTo(p.name);
        return age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
