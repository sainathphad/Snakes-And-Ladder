package com.bridgelabz;


public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snakes And Ladder Simulation");
        //CONSTANTS
        int START_POSITION = 0;

        //VARIABLES
        int newPosition = 0;

        //ROLLING_DIE
           int rollDie = 1 + (int)(Math.random() * 6);
            System.out.println("Dice: " +rollDie);
        //OPTIONS
        int optionCheck = 1 + (int)(Math.random() * 3);
            switch (optionCheck) {
                case 1:
                    System.out.println("No Play");
                    newPosition = START_POSITION;
                    break;

                case 2:
                    newPosition = newPosition + rollDie;
                    System.out.println("Ladder");
                    break;

                case 3:
                    if (rollDie > newPosition) {
                        newPosition = newPosition;
                    }
                    else {
                        newPosition = newPosition - rollDie;
                    }
                    System.out.println("Snakes");
                    break;
            }
                    System.out.println("New Position: " + newPosition);
    }
}
