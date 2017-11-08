package com.company.excercises;

public class RobotMethods {
    private int SLOTS_AMOUNT = 10;
    private int SLOTS_CAPACITY = 15;
    private int[] slots = new int[SLOTS_AMOUNT];
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

    public void moveArmToPosition(int position) {
        if (position < SLOTS_AMOUNT)
            this.position = position;
    }

    private void serviceLower() {
        if (robotHoldsBlock && slots[position] < SLOTS_CAPACITY) {
            slots[position]++;
            robotHoldsBlock = false;
        }
    }

    private void serviceMove() {
        if (position < SLOTS_AMOUNT)
            position++;

    }

    private void servicePickup() {
        robotHoldsBlock = true;
        position = 0;
    }
}
