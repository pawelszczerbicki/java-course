package com.company.loops;

public class LoopsExercise {
    public static void main(String[] args) {

        boolean a = 15%2 == 0;

        for (int i = 0; i < 101; i++)
            if (i > 50)
                System.out.println(i);


        for (int i = 50; i < 101; i++) {
            System.out.println(i);
        }

        for (int i = 50; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i = i+2)
            System.out.println(i);
    }
}
