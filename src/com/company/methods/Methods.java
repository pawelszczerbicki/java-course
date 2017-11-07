package com.company.methods;

public class Methods {

    //metoda bez parametrow ktora nic nie zwraca
    void methodName() {
        int a=1;
        int b=2;
        addAndPrint(1, 2);
        System.out.println(sum(1, 2));
        int someSum = sum(sum(a,b), sum(a,b));

        int [] oneDimension = {};
        int [][] twoDimension = {};
        printArray(oneDimension);
        printArray(twoDimension);

    }

    //metoda z parametrami ktora nic nie zwraca - void
    void addAndPrint(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    void divideAndPrint(int a, int b) {
        if (b == 0) {
            System.out.println("dzielenie przez 0");
            return;
        }
        int x = a / b;
        System.out.println(x);

    }

    //metoda z dwoma parametrami int ktora zwraca inta
    int sum(int a, int b) {
        return a + b;
    }

    void print(String  test){
        System.out.println(test);
    }

    void print(int test){
        System.out.println(test);
    }

    //metoda przeladowana rozni się przyjmowamymi parametrami lub ich kolejnoscia
    void printArray(int [] toPrint){
        for (int value : toPrint) {
            System.out.println(value);
        }
    }

    void printArray(int [][] toPrint){
        for (int[] values : toPrint) {
            // wyswietlajac tablice dwuwymiarowa mozemy
            //X razy wyswietlic tablice jednowymiarowa
            printArray(values);
        }
    }


    void test(String a, int b){
    }

    void  test (int b, String a){

    }

}
