package com.softserve.edu05.hw.HomeTask1;

import java.util.Scanner;

/*A month number and calculates the number of days in that month based on an array
that contains the number of days in each month.*/
public class Task1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] month = {
                "January", "February",
                "March", "April", "May",
                "June", "July", "August",
                "September", "October", "November",
                "December"
        };
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter month number [1 - 12]: ");
        int monthNumber = Integer.parseInt(SCANNER.nextLine());
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("Invalid month number: " + monthNumber);
        }
        System.out.println(daysInMonth[monthNumber - 1] + " days in " + month[monthNumber - 1]);

    }
}
