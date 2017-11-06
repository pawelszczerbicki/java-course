package com.company.excercises;

public class UpperCaseLetters {
    public static void main(String[] args) {
        char[] letters = {'a', 'A', 'd', 'g', 'Z', '@'};

        for (char letter : letters) {
            if(letter >='a' && letter <= 'z')
                System.out.println(letter + " - Jest mala litera");

            else if(letter >='A' && letter <= 'Z')
                System.out.println(letter + " - Jest duza litera");

            else System.out.println(letter + " - Nie jest litera");
        }

    }
}
