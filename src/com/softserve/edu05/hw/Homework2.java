package com.softserve.edu05.hw;

import java.util.Scanner;

public class Homework2 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        String jaNicht = "N";
        do {
            System.out.println("User, we ask you to enter below to positive integers.");

            System.out.print("integer 1: ");
            int num1 = SCANNER.nextInt();
            SCANNER.nextLine();

            System.out.print("integer 2: ");
            int num2 = SCANNER.nextInt();
            SCANNER.nextLine();

            System.out.println("The sum of these two integers is " + ( num1 + num2 ) + ".");
            System.out.println();

            System.out.print("Would you like to do this exercise one more time? Y/N ");
            jaNicht = SCANNER.nextLine().toUpperCase();

            if( jaNicht.equals("Y") ) {  // this is just a formatting thing
                System.out.println();
            }

        } while ( jaNicht.equals("Y") );
        System.out.println("Wir danken Ihnen vielmals für das Mitspielen. Kommen Sie bald wieder.");
    }
}
