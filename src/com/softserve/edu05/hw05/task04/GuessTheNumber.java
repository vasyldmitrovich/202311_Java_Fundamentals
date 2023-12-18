package com.softserve.edu05.hw05.task04;

import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {

    private static final Scanner SCANNER = new Scanner(System.in);


    public static void guessNumber() {
        Random rnd = new Random();
        int random = rnd.nextInt(0, 100);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the number: ");
            int selectNumber = SCANNER.nextInt();
            if (selectNumber == random) {
                System.out.println("You guessed a random number ");
                exit = true;
            } else if (selectNumber > random) {
                System.out.println("Too high, try again \n");
            } else {
                System.out.println("Too low, try again \n");
            }
        }
    }


    public static void main(String[] args) {
        guessNumber();
    }


}
