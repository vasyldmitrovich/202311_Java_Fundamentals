package com.softserve.edu05.pt.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//Do not write all in main method, separate to different methods
        String[] countries = {"Ukraine", "France", "USA", "Germany", "Austria"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        double[] numbers = {3, 8, 11, 6, 24};
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i ++) {
            sum += numbers[i];
        }
        System.out.println("The average value is " + sum / numbers.length);

        System.out.print("Enter a word to check: ");
        Scanner scanner = new Scanner(System.in);
        String wordCheck = scanner.nextLine();
        boolean found = false;
        for (String v : countries) {
            if (v.equals(wordCheck)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The word " + wordCheck + " is included in the array");
        } else System.out.println("The word " + wordCheck + " is not included in the array");
    }
}
