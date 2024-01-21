package com.softserve.edu13.hw.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int yearToCheck = scanner.nextInt();

        if (isLeapYear(yearToCheck)) {
            System.out.println(yearToCheck + " is a leap year.");
        } else {
            System.out.println(yearToCheck + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
