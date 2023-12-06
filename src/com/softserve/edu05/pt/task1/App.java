package com.softserve.edu05.pt.task1;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //item 1
        String[] arr = {"Toyota", "Hundai", "Mitsubishi", "Nissan", "Nesla"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //item 2
        double[] numbers = {1, 3, 1, 7, 9};
        double sumOfNumbers = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            sumOfNumbers += numbers[i];
        }
        double average = sumOfNumbers / numbers.length;
        System.out.println("Average: " + average);

        //item 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter double number: ");
        double numCheck = Double.parseDouble(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == numCheck) {
                System.out.println("Number " + numCheck + " is found in position " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number " + numCheck + " is not found");
        }

    }
}
