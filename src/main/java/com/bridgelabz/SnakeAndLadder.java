package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snakes And Ladder Simulation");
        //CONSTANTS
        int START_POSITION = 0;

        //VARIABLES
        int player1 = START_POSITION;
        int newPosition = 0;

        //ROLLING_DIE
           int rollDie = 1 + (int)(Math.random() * 6);
            System.out.println("Dice: " +rollDie);
    }
}
