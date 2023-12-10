package com.softserve.edu05.hw.HomeTask4;

import java.util.Random;
import java.util.Scanner;

public class HomeTask4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        gameStart();
    }

    private static void gameStart() {
        Random random = new Random();
        int numberToGuess = random.nextInt(0, 1000);
        int inputNumber;
        int numberOfAttempts = 0;

        System.out.println("Try to guess number [From 0 to 1000]");
        while (true) {
            System.out.print("Enter number: ");
            inputNumber = Integer.parseInt(SCANNER.nextLine());
            if (inputNumber == numberToGuess) {
                System.out.println("CORRECT!!!");
                numberOfAttempts++;
                System.out.println("Number of attempts: " + numberOfAttempts);
                break;
            } else if (inputNumber < numberToGuess) {
                System.out.println("Too low, try again.");
                numberOfAttempts++;
            } else {
                System.out.println("Too high, try again");
                numberOfAttempts++;
            }

        }
    }
}
