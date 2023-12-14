package com.softserve.edu05.hw.HomeTask1;

import java.util.Scanner;

/*A month number and calculates the number of days in that month based on an array
that contains the number of days in each month.*/
public class Task1 {
    //private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        report();

    }

    static void report() {
        int monthNumber = getMonthNumber();
        try {
            System.out.println(getDaysInMonth(monthNumber) + " days in " + getMonth(monthNumber));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid month number: " + monthNumber);
        }
    }

    static int getMonthNumber() {
        var scanner = new Scanner(System.in);
        System.out.print("Enter month number [1 - 12]: ");
        int monthNumber = Integer.parseInt(scanner.nextLine());
        if (monthNumber < 1 || monthNumber > 12) {
            return -1; //ArrayIndexOutOfBoundsException
        }
        return monthNumber;
    }

    static String getMonth(int monthNumber) {
        String[] month = {
                "January", "February",
                "March", "April", "May",
                "June", "July", "August",
                "September", "October", "November",
                "December"
        };
        return month[monthNumber - 1];
    }

    static int getDaysInMonth(int monthNumber) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[monthNumber - 1];
    }


}
