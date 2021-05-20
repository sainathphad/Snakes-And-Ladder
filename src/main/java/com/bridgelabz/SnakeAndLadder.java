package com.bridgelabz;


public class SnakeAndLadder {
    //CONSTANTS
    static final int START_POSITION = 0;
    static final int WINNING_POSITION = 100;

    //ROLLING_DIE_COMPUTATION
     static void dieRoll() {
        //VARIABLES
        int newPosition = 0;
        int prevPosition;
        int dieRollCount = 0;

        while (newPosition < WINNING_POSITION) {
            int rollDie = 1 + (int) (Math.random() * 6);
            //OPTIONS
            int optionCheck = 1 + (int) (Math.random() * 3);
            switch (optionCheck) {
                case 1:
                    //NO PLAY
                    prevPosition = newPosition;
                    newPosition = newPosition;
                    break;

                case 2:
                    //LADDER
                    prevPosition = newPosition;
                    newPosition = newPosition + rollDie;
                    if ( newPosition > WINNING_POSITION ) {
                        newPosition = prevPosition;
                    }
                    break;

                case 3:
                    //SNAKE
                        newPosition = newPosition - rollDie;
                    if (newPosition < 0) {
                        newPosition = 0;
                    }
                        break;
            }
            dieRollCount++;
            System.out.println("New Position: " + newPosition);
        }
         System.out.println("Total die roll: " + dieRollCount);
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Snakes And Ladder Simulation");
        dieRoll();

    }
}
