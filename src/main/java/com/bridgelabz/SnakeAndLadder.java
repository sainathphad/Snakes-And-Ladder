package com.bridgelabz;


public class SnakeAndLadder {
    //CONSTANTS
    static final int WINNING_POSITION = 100;

    //ROLLING_DIE_COMPUTATION
    public void dieRoll() {
        //VARIABLES
        int newPosition1 = 0;
        int newPosition2 = 0;
        int prevPosition1;
        int prevPosition2;
        int playerTurn = 1;
        int dieRollCount = 0;

        while ( newPosition1 < WINNING_POSITION && newPosition2 < WINNING_POSITION ) {
            int rollDie = 1 + (int) (Math.random() * 6);
            //OPTIONS
            int optionCheck = 1 + (int) (Math.random() * 3);
            switch (optionCheck) {
                case 1:
                    //NO PLAY
                    break;

                case 2:
                    //LADDER
                    if ( playerTurn == 1 ) {
                        prevPosition1 = newPosition1;
                        newPosition1 = newPosition1 + rollDie;

                        if ( newPosition1 > WINNING_POSITION ) {
                            newPosition1 = prevPosition1;
                        }
                        System.out.println("Player1 Position: " + newPosition1);
                    }
                    else {
                        prevPosition2 = newPosition2;
                        newPosition2 = newPosition2 + rollDie;

                        if (newPosition2 > WINNING_POSITION) {
                            newPosition2 = prevPosition2;
                        }
                        System.out.println("Player2 Position: " + newPosition2);
                    }
                    playerTurn = 3 - playerTurn;
                    break;

                case 3:
                    //SNAKE
                    if ( playerTurn == 1 ) {
                        newPosition1 = newPosition1 - rollDie;
                        if ( newPosition1 < 0 ) {
                            newPosition1 = 0;
                        }
                        System.out.println("Player1 Position: " + newPosition1);
                    }
                    else {
                        newPosition2 = newPosition2 - rollDie;
                        if (newPosition2 < 0) {
                            newPosition2 = 0;
                        }
                        System.out.println("Player2 Position: " + newPosition2);
                    }

                        break;
            }
            dieRollCount++;
            playerTurn = 3 - playerTurn;
        }
        if ( newPosition1 == WINNING_POSITION ) {
            System.out.println("Player 1 Won");
        }
        else {
            System.out.println("Player 2 Won");
        }
         System.out.println("Total die roll: " + dieRollCount);
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Snakes And Ladder Simulation");
        SnakeAndLadder obj = new SnakeAndLadder();
        obj.dieRoll();

    }
}
