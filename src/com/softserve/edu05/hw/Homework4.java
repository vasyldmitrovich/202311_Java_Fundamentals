package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static final Scanner SCANNER = new Scanner( System.in );
    public static void main(String[] args) {
        Random rnd = new Random();
        int upperBound = 5;
        int lowerBound = -5;
        int nummer = rnd.nextInt(lowerBound, upperBound);

        System.out.println("User, guess an integer that equals or is higher than " + lowerBound +
                " and is lower than " + upperBound + ": ");
        int userGuess = SCANNER.nextInt();
        SCANNER.nextLine();

        while ( userGuess != nummer ) {
            if( userGuess < nummer ) {
                System.out.println("The target integer is higher then the number you've entered.");
            } else {
                System.out.println("The target integer is lower then the number you've entered.");
            }
            System.out.print("Your next guess is: ");
            userGuess = SCANNER.nextInt();
            SCANNER.nextLine();
        }
        System.out.println();
        System.out.println("Congratulations! You've made it!");
    }
}
