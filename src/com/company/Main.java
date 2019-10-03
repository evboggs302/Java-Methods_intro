package com.company;

public class Main {

    public static void main(String[] args) {
//        methods can't be called within other methods
        System.out.println("this is the MAIN method executing this line of code.");

//        calculateScore(true, 800, 5, 100);
       int finalScore =  calculateScore(true, 10000, 8, 5000);
        System.out.println("this is the finalScore = " + finalScore);




        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Johnny", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sarah", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Nathan", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the highscore table.");
    }

    public static int calculateHighScorePosition(int playerScore){
//        System.out.println("this is their Score = " + playerScore);
//        if(playerScore > 1000){
//            return 1;
//        } else if (playerScore > 500){
//            return 2;
//        }else if (playerScore > 100) {
//            return 3;
//        }
//        return 4;

//        ONLY 1 RETURn
        int position = 4;
        if(playerScore > 1000){
            position = 1;
        } else if (playerScore > 500){
            position = 2;
        }else if (playerScore > 100) {
            position = 3;
        }
        return position;

    }
}
