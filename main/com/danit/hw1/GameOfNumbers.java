package com.danit.hw1;

import java.util.Random;
import java.util.Scanner;

public class GameOfNumbers {
    private String name;
    private int numberGame;
    private int numberUser;
    private final int RANGE = 101;

    public void start(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        numberGame = random.nextInt(RANGE);

        System.out.print("Input your name: ");
        name = scan.nextLine();

        System.out.println("Let the game begin!");
        System.out.println("Random Game (top secret) - " + numberGame);

        while (true) {
            System.out.print("Input your game number: ");
            numberUser = scan.nextInt();

            if(numberUser < numberGame) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (numberUser > numberGame) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + " !");
                System.out.println("==== NEW GAME ====");
                numberGame = random.nextInt(RANGE);
                System.out.println("Random Game (top secret) - " + numberGame);
            }
        }
    }
}
