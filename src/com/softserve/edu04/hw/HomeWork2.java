package com.softserve.edu04.hw;

import java.util.Scanner;

public class HomeWork2 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.print("Enter the first of the three integers: ");
        int num1 = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.print("Enter the second of the three integers: ");
        int num2 = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.print("Enter the third of the three integers: ");
        int num3 = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.println();

        int numMinMax = findMaxNum( num1, num2, num3 );
        System.out.println(numMinMax + " is the largest of the three entered numbers.");
        numMinMax = findMinNum( num1, num2, num3 );
        System.out.println(numMinMax + " is the smallest of the three entered numbers.");
    }

    // Math.max() would save us some hassle here
    static int findMaxNum( int num1, int num2, int num3 ) {
        if ( ( num1 > num2 ) && ( num1 > num3 ) ) { return num1; }
        else if ( ( num2 > num3) ) { return num2; }
        else { return num3; }
    }

    // likewise, Math.min() would be of immense help
    static int findMinNum( int num1, int num2, int num3 ) {
        if ( ( num1 < num2 ) && ( num1 < num3 ) ) { return num1; }
        else if ( ( num2 < num3) ) { return num2; }
        else { return num3; }
    }
}
