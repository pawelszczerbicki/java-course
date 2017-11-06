package com.company.excercises;

public class UpperCaseLetters {
    public static void main(String[] args) {
        char[] letters = {'a', 'A', 'd', 'g', 'Z', '@'};

        for (int i = 0; i < letters.length; i++) {
            if(letters[i] >='a' && letters[i] <= 'z')
                System.out.println(letters[i] + " - Jest mala litera");

            else if(letters[i] >='A' && letters[i] <= 'Z')
                System.out.println(letters[i] + " - Jest duza litera");

            else System.out.println(letters[i] + " - Nie jest litera");
        }

    }
}
