package com.company.objects;

public class Test {
    public static void main(String[] args) {
        Person john = new Person("John", "Test");
        Person mathew = new Person("Mathew", "Some surname");
        Person test = new Person("Test", "Other surname", john);

        System.out.println(john.getDisplayName());
        System.out.println(mathew.getDisplayName());
        System.out.println(test.getDisplayName());


//        john.name = "John";
//        john.surname = "Test";
//        System.out.println(john.getFullName());
        

        //jakis kod ktory dziala pol godziny
    }
}
