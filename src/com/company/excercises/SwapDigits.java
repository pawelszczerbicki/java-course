package com.company.excercises;

public class SwapDigits {

    public static void main(String[] args) {
        int[] digits = {1, 1, 1, 3, 4, 6, 1, 4, 1, 6};
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] < digits[i + 1]) {
                swap(digits, i, i+1);
                break;
            }
        }

        print(digits);
    }

    //zmiana dwoch elementow w tablicy pomiedzy soba
    private static void swap(int[] array, int src, int dest){
         int temp = array[src];
         array[src] = array[dest];
         array[dest] = temp;
    }

    //metoda do wyswietlania liczby ktora powstala po zamianie cyfr
    private static void print(int[] digits) {
        for (int digit : digits)
            System.out.print(digit);
    }
}
