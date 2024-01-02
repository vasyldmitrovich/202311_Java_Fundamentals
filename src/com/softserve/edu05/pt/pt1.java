package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class pt1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String[] names = {"Jo", "Bob", "Elis"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        double[] numbers = {5, 10, 3.5, 7, 8};
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        System.out.println("The avarage value is :" + (sum / numbers.length));

        System.out.println("Enter the name to search:");
        String nameToSearch = SCANNER.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The name'" + nameToSearch + "' found the list");

        } else {
            System.out.println("The name'" + nameToSearch + "' not found the list");
        }

        if (Arrays.binarySearch(names, nameToSearch) >= 0) {
            System.out.println("The name'" + nameToSearch + "' found the list");

        } else {
            System.out.println("The name'" + nameToSearch + "' not found the list");
        }

    }
}
