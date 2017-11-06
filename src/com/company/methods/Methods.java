package com.company.methods;

public class Methods {

    //metoda bez parametrow ktora nic nie zwraca
    void methodName() {
        int a=1;
        int b=2;
        addAndPrint(1, 2);
        System.out.println(sum(1, 2));

        int someSum = sum(sum(a,b), sum(a,b));

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


}
