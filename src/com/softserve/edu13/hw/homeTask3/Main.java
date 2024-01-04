package com.softserve.edu13.hw.homeTask3;

public class Main {
    public static void main(String[] args) {
        //int year = LocalDate.now().getYear();
        int year = 1700;
        System.out.println("Year " + year + " is leap?\nAnswer: " + isLeapYear(year));
    }

    static boolean isLeapYear(int year){
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }


}
