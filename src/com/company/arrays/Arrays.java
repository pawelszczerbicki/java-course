package com.company.arrays;

public class Arrays {

    public static void main(String[] args) {
        int test1 = 2;
        int test2 = 2;
        int test3 = 2;
        int test4 = 2;
        int test5 = 2;

        String a = new String("test");
        String b = "test";

        //init array withot values
        int[] intTab = new int[20];
        String[] intString = new String[20];

        test1=4;

        intTab[5]=10;
        intTab[2]=20;

        //print without new line. Prints reference to array
        System.out.print(intTab);

        //print 5 element from array
        System.out.println(intTab[5]);

        System.out.println(intTab[19]);

        //init array with values
        int[] tabWithElements = new int[]{1,10,34,321};

        int testIncrement = 0;

        //position 0
        System.out.println(tabWithElements[testIncrement]);

        //position 0
        System.out.println(tabWithElements[testIncrement++]);

        //position 1
        System.out.println(tabWithElements[++testIncrement]);
    }

}
