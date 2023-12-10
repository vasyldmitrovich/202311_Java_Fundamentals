package com.softserve.edu05.pt.PracticalTask1;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTask1 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //Create a string array and sort it
        String[] names = {
                "Bob",
                "Alice",
                "Jack"
        };
        Arrays.sort(names);
        System.out.println("Sorted string array: " + Arrays.toString(names));

        //Create an array with 5 elements and calculate the average value
        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double avg = sum / numbers.length;
        System.out.println("Average: " + avg);

        //Сheck if the array (any of the previous ones) contains the value ( value enter from the
        //console). Output the result of the search.
        System.out.print("Enter the name to search: ");
        String nameToSearch = SCANNER.nextLine();
        boolean isFound = false;
        //Out method to search
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("The name '" + nameToSearch + "' is on the list");
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }

        //Using binary search
        System.out.print("Enter the name to search(Binary search): ");
        String nameToSearchUsingBinary = SCANNER.nextLine();
        int ix = Arrays.binarySearch(names, nameToSearchUsingBinary);
        if (ix >= 0) {
            System.out.println("The name '" + nameToSearch + "' is on the list in position " + ix);
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }
    }
}
