package com.company.conditions;

public class Conditions {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        boolean work = true;
        boolean classes = true;
        boolean test = a > 3;

        if (work) {
            //Any code if true
            System.out.println("i was at work");
        } else {
            //Any code if false
            System.out.println("I Was absent at work");
        }

        if (classes) {
            System.out.println("i was in classes");
        }

        //connect with AND
        if (work && classes) {
            System.out.println("work and classess");
        }

        //connect with OR
        if (work || classes) {
            System.out.println("work or classes");
        }

        if (!work)
            System.out.println("i was NOT at work");


        if(1>2) System.out.println("1");
        else System.out.println("2");

        int c = 0;

        //wersja 1
        if (1 > 2) c = 1;
        else c = 2;

        //wersja 2
        c = 1>2 ? 1 : 2;

        //wersja 1 = wersja 2

    }
}
