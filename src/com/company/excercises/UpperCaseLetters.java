package com.company.excercises;

public class UpperCaseLetters {
    public static void main(String[] args) {
        char[] letters = {'a', 'A', 'd', 'g', 'Z', '@'};

        for (char letter : letters) {
            if (isInRange(letter, 'a', 'z'))
                System.out.println(letter + " - Jest mala litera");

            else if (isInRange(letter,'A', 'Z'))
                System.out.println(letter + " - Jest duza litera");

            else System.out.println(letter + " - Nie jest litera");
        }

    }

    private static boolean isInRange(char letter, char left, char right){
        return letter >= left && letter <= right;
    }
}
