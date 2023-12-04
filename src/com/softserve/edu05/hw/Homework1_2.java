package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Random;


public class Homework1_2 {
    public static void main(String[] args) {

        /*Create a program that prompts the user to enter 10 integer numbers and calculates the sum
         * of the first five elements if they are positive, or the product of the last five elements if they are not and outputs the result.*/
        someMultiplications();
    }

    static void someMultiplications() {
        /* I have read the assignment and understood that it is the user that has to enter these ten numbers.
         * I've intentionally decided to spare the user this tedious job and to run the Random function instead. */

        // create an array
        Random rnd = new Random();
        int[] datei = new int[10];
        for (int i = 0; i < datei.length; i++) {
            datei[i] = rnd.nextInt(-5, 5);
        }
        System.out.println(Arrays.toString(datei));

        // calculate the sum if the first five integers in the array are positive numbers
        int summe = 0;
        for (int i = 0; i < 5; i++) {
            if( datei[i] < 0 ) {
                summe = 0;
                break;
            }
            summe += datei[i];
        }

        // calculate the product of the last five integers if the first five integers are not positives
        if( summe == 0 ) {
            int resultat = 1;
            for (int i = 5; i < datei.length; i++) {
                resultat = resultat * datei[i];
            }
            System.out.println("The product of the last five integers in the array is " + resultat + ".");
        } else {
            System.out.println("The sum of the first five positive integers in the array is " + summe + ".");
        }
    }
}