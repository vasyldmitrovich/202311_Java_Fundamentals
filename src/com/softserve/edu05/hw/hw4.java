/*Create a program that generates a random number and prompts to the user to guess
what the number is. If the user's guess is higher than the random number, the program
should display "Too high, try again." If the user's guess is lower than the random number,
the program should display "Too low, try again." The program should use a loop that
repeats until the user correctly guesses the random number.*/
package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class hw4 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Random rnd = new Random();
        int numberRnd = rnd.nextInt(0, 10);
        int number = -1;
        do {
            System.out.print("Enter the number(0-10):");
            number = SCANNER.nextInt();
            if (number > numberRnd) {
                System.out.println("Too high, try again.");
            } else if (number < numberRnd) {
                System.out.println("Too low, try again.");
            }
        } while (number != numberRnd);
        System.out.println("luck");
    }
}
