package com.company.excercises;


public class RobotRunner {

    public static void main(String[] args) {

        RobotMethods robot = new RobotMethods();
         robot.moveArmToPosition(3);
        int[] robotState = robot.performOperationsOnRobot("PLPLPLPLPL");
    }
}
