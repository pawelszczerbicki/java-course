package com.company.excercises;

public class Robot {


    public static void main(String[] args) {
        String commandsString = "MMMMPMMLMMPLPLPLPLPLPLPLPLPMMMML";
        char[] commands = commandsString.toCharArray();
        //duze litery dlatego ze to jest stala
        int SLOTS_DEFAULT_SIZE = 10;
        int SLOTS_CAPACITY = 15;
        int[] slots = new int[SLOTS_DEFAULT_SIZE];


        boolean robotHoldsBlock = false;
        int position = 0;
        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == 'P') {
                robotHoldsBlock = true;
                position = 0;
            }

            if(commands[i] =='M' && position < SLOTS_DEFAULT_SIZE)
                position++;

            if(commands[i] == 'L' && robotHoldsBlock && slots[position] < SLOTS_CAPACITY) {
                slots[position]++;
                robotHoldsBlock = false;
            }
        }

        for (int i = 0; i < slots.length; i++) {
            System.out.print(slots[i] + ", ");
        }
    }
}
