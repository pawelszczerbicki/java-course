package com.company.loops;

public class Loops {

    public static void main(String[] args) {

        double[] numbers = new double[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = i * 2;
            System.out.println(numbers[i]);
        }

        int i = 0;
        while (i < 10) {
            i++;
        }

        int y = 0;

        do {
            y++;
        } while (y < 10);

        int [] someDigits = {5,6,3,1,6,7};

        for (int current : someDigits) {
            System.out.println(current);
        }

        for (int j = 0; j < someDigits.length; j++) {
            int current = someDigits[j];
            System.out.println(current);
        }
    }
}
