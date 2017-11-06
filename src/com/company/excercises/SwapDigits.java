package com.company.excercises;

public class SwapDigits {

    public static void main(String[] args) {
        int[] digits = {1, 3, 7, 0};
        int temp;
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] < digits[i + 1]) {
                temp = digits[i];
                digits[i] = digits[i+1];
                digits[i+1] = temp;
            }
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}
