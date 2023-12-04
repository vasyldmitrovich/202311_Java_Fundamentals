package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static final Scanner SCANNER = new Scanner( System.in );
    public static void main(String[] args) {

        // create a string array and sort it
        String[] matrix = {"Bob", "Sam", "Bill", "Pedro", "Pablo", "Rey", "Juan", "Perfecta", "Milagra"};
        Arrays.sort(matrix);

        // create an array of 5 elements and calculate the average value
        double[] datenfeld = {5, 6, 7, 8, 9};
        double summe = 0;
        for (double v : datenfeld) {
            summe += v;
        }
        double durchschnitt = summe / datenfeld.length;
        System.out.println("Average value in unserem Array ist " + durchschnitt);

        // Сheck if the array (any of the previous ones) contains the value ( value enter  from the console). Output the result of the search.
        System.out.print("Enter an integer value you would like to search: ");
        int wert = SCANNER.nextInt();
        SCANNER.nextLine();
        boolean jaNicht = false;
        for (int i = 0; i < datenfeld.length; i++) {
            if( datenfeld[i] == wert ) {
                jaNicht = true;
                System.out.println("Our array does contain value " + wert + ". It is stored at location " + i + " in the array." );
                break;
            }
        }
        if( !jaNicht ) {
            System.out.println("The array does not contain value " + wert + ".");
        }
    }
}
