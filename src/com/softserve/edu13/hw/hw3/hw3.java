package com.softserve.edu13.hw.hw3;

import java.util.Scanner;

public class hw3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter year: ");
        int yearText = Integer.parseInt(SCANNER.nextLine());
        if (yearLeap(yearText)) {
            System.out.println("Year " + yearText + " is a leap");
        }
        else{
            System.out.println("Year " + yearText + " is not leap");
        }
    }


    static boolean yearLeap(int year) {
        return year > 1584 &&
                (
                        (year % 400 == 0) ||
                                (year % 4 == 0 && year % 100 != 0)
                );
    }
}
