package com.softserve.edu05.hw.task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int number;
        System.out.print("Try to guess a random number from 0 to 10: ");
        do {
            number = scanner.nextInt();
            if (number > randomNumber) {
                System.out.print("Too high, try again: ");
            } else if (number < randomNumber) {
                System.out.print("Too low, try again: ");
            } else {
                System.out.print("Yay! You guessed it) The guessed number is " + randomNumber);
            }
        } while (number != randomNumber);
    }
}
