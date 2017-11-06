package com.company.excercises;

public class RobotMethods {
    private int SLOTS_DEFAULT_SIZE = 10;
    private int SLOTS_CAPACITY = 15;
    private int[] slots = new int[SLOTS_DEFAULT_SIZE];
    private boolean robotHoldsBlock = false;
    private int position = 0;

    public int[] performOperationsOnRobot(String operations) {
        char[] commands = operations.toCharArray();

        for (char command : commands) {
            if (command == 'P') servicePickup();
            if (command == 'M') serviceMove();
            if (command == 'L') serviceLower();
        }
        return slots;
    }


    private void serviceLower() {
        if (robotHoldsBlock && slots[position] < SLOTS_CAPACITY) {
            slots[position]++;
            robotHoldsBlock = false;
        }
    }

    private void serviceMove() {
        if (position < SLOTS_DEFAULT_SIZE)
            position++;

    }

    private void servicePickup() {
        robotHoldsBlock = true;
        position = 0;
    }
}
