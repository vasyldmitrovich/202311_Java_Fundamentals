package com.softserve.edu05.hw;

import java.util.Scanner;

public class Homework1_1 {
    public static final Scanner SCANNER = new Scanner( System.in );
    public static void main(String[] args) {

        /*Create a program that prompts the user to enter a month number and calculates the number of
        days in that month based on an array that contains the number of days in each month. */
        numDaysInMonth();
    }

    static void numDaysInMonth() {
        int numMonth;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        do {
            System.out.print("Enter an integer to represent the number of a month: ");
            numMonth = SCANNER.nextInt();
        } while ( ( numMonth > 12 ) || ( numMonth < 1 ) );

        System.out.println("There are " + days[ numMonth - 1 ] + " days in the month with ordinal number " + numMonth + ".");
    }
}
