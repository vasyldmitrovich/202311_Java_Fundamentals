package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1_3 {
    public static final Scanner SCANNER = new Scanner( System.in );
    public static void main(String[] args) {

        // Create a program that prompts the user to enter 5 integer numbers
        int[] datei = createArray();
        System.out.println(Arrays.toString(datei));

        // position of the second positive number
        findPositionOf2ndPositiveInt( datei );

        // minimum value and its position in the array
        findMinAndItsPosition( datei );

        // calculate the product of all entered even numbers (exclude 0 from even if entered by user).
        findProduct( datei );

    }

    static int[] createArray() {
        int[] datei = new int[5];
        System.out.println("User, you have to enter five integers.");
        for (int i = 0; i < datei.length; i++) {
            System.out.print("number " + ( i + 1 ) + ": ");
            datei[i] = SCANNER.nextInt();
            SCANNER.nextLine();
        }
        return datei;
    }
    static void findPositionOf2ndPositiveInt( int[] datei ) {
        int counter = 0;
        for (int i = 0; i < datei.length; i++) {
            if (datei[i] > 0) {
                counter++;
            }
            if (counter == 2) {
                System.out.println("The second positive number is stored in position " + i + " in the array.");
                break;
            }
        }

        if (counter == 0) {
            System.out.println("There are no positive integers in the array.");
        } else if ( counter == 1 ) {
            System.out.println("There is just one positive integer in the array, i.e. there is no second positive integer.");
        } else { return; }
    }

    static void findMinAndItsPosition( int[] datei ) {
        int minNum = datei[0];
        int position = 0;
        for (int i = 0; i < datei.length; i++) {
            if( datei[i] < minNum ) {
                minNum = datei[i];
                position = i;
            }
        }
        System.out.println("The smallest value in the array is " + minNum + ".  " + "This value is stored in position " + position + ".");
    }

    static void findProduct( int[] datei ) {
        int product = 1;
        int counter = 0;
        for( int d: datei ) {
            int mod = d % 2;
            if( ( d != 0 ) && ( mod == 0 ) ) {
                product = product * d;
                counter++;
            }
        }
        if( counter == 0 ) {
            System.out.println("There are no positive even numbers in this array.");
        } else if( counter == 1 ) {
            System.out.println("There is just one positive even number in this array and this number is " + product + ".");
        } else {
            System.out.println("The product of positive even numbers stored in this array is " + product + ".");
        }
    }
}
