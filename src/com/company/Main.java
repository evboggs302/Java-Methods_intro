package com.company;

public class Main {

    public static void main(String[] args) {
//        methods can't be called within other methods
        System.out.println("this is the MAIN method executing this line of code.");

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 5000);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("the final Score was " + finalScore);
        }

    }
}
