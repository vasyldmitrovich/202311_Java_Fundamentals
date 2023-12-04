package com.softserve.edu05.pt;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task2 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        String jaNicht = "Y";
        while (jaNicht.equals("Y")) {

            checkingForPrimeNumber();

            System.out.print("Would you like to continue checking whether numbers are prime or not prime? Y/N ");
            jaNicht = SCANNER.nextLine();
            jaNicht = jaNicht.toUpperCase();
            if ( jaNicht.equals("N") ) break;
        }
    }

    public static void checkingForPrimeNumber() {
        int nummer = 0;

        // prompting the user for a positive integer
        do {
            System.out.print("Enter a positive integer: ");
            nummer = SCANNER.nextInt();
            SCANNER.nextLine();
        } while (nummer <= 0);

        //
        if ( ( nummer == 1 ) || ( nummer == 2 ) ) {
            System.out.println(nummer + " is a prime number.");
            return;
        }

        // trial division to check for primarity
        for (int i = 2; i <= sqrt(nummer); i++) {
            if ( nummer % i == 0 ) {
                System.out.println(nummer + " is not a prime number.");
                return;
            }
        }

        System.out.println(nummer + " is a prime number.");
    }
}
