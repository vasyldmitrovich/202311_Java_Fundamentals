package com.softserve.edu05.hw05.task01;

import java.util.Scanner;

public class DayInTheMonth {

    private static final Scanner SCANNER = new Scanner(System.in);


    static int getMonthNumber() {
        System.out.println("Enter month number from 1 to 12: ");
        int selectMonthNumber = Integer.parseInt(SCANNER.nextLine());
        if (selectMonthNumber >= 1 && selectMonthNumber <= 12) {
            return selectMonthNumber - 1;
        } else {
            System.out.println("Such a month does not exist. \n ");
            getMonthNumber();
        }
        return selectMonthNumber - 1;
    }

    public static String getMonth(int monthNumber) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return month[monthNumber];
    }

    public static int getDayInTheMonth(int monthNumber) {
        int[] dayInTheMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dayInTheMonth[monthNumber];
    }


    static void output() {
        int monthNumber = getMonthNumber();
        System.out.println("In " + getMonth(monthNumber) + ": " + getDayInTheMonth(monthNumber) + " days");
    }


    public static void main(String[] args) {
        output();

    }

}
