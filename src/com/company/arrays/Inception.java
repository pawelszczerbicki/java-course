package com.company.arrays;

public class Inception {
    public static void main(String[] args) {
        int[][] box = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        for (int i = 0; i < box.length; i++) {
            System.out.println();
            for (int j = 0; j < box[i].length; j++) {
                System.out.print(box[i][j]);
            }
        }
    }
}
