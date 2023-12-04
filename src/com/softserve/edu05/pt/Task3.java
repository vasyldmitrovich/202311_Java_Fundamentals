package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        // Create an array of ten random integers using a random number generator
        int[] datei = creatingArray();

        // output the largest number in the array
        int maxNum = maxNumInArray(datei);
        System.out.println("The largest integer in this array is " + maxNum + ".");

        // output the sum of positive numbers
        int summe = sumPositiveNumbers(datei);
        System.out.println("The sum of positive integers in this array is " + summe + ".");

        // output the number of negative integers
        int numNegative = countOfNegativeIntegers( datei );
        System.out.println("There are " + numNegative + " negative integers in this array.");

        // counting the number of positive and the number of negative integers
        countingPositiveAndNegativeInts( datei );

    }

    public static int[] creatingArray() {
        Random rnd = new Random();
        int[] datei = new int[10];

        for (int i = 0; i < datei.length; i++) {
            datei[i] = rnd.nextInt(-20, 20);
        }
        System.out.println(Arrays.toString(datei));
        return datei;
    }
    public static int maxNumInArray(int[] datei) {
        int maxNum = 0;
        for (int j : datei) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        return maxNum;
    }

    public static int sumPositiveNumbers( int[] datei) {
        int summe = 0;
        for( int d: datei ) {
            if( d > 0 ) {
                summe += d;
            }
        }
        return summe;
    }

    public static int countOfNegativeIntegers( int[] datei ) {
        int counter = 0;
        for( int d: datei ) {
            if( d < 0 ) {
                counter++;
            }
        }
        return counter;
    }

    public static void countingPositiveAndNegativeInts( int[] datei ) {
        int numNegative = countOfNegativeIntegers(datei);
        int numPositive = datei.length - numNegative;
        if( numPositive > numNegative ) {
            System.out.println("There are more positive integers in this array.");
        } else if ( numNegative > numPositive ) {
            System.out.println("There are more negative integers in this array.");
        } else {
            System.out.println("There are equal number of positive and negative integers in this array.");
        }
    }
}
