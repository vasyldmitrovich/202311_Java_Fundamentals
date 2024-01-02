package com.softserve.edu05.hw;

import java.util.Scanner;

public class hw1_1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the month number:");
        daysInMonth(SCANNER.nextInt());

    }
    public static void daysInMonth(int numberMonth){
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (numberMonth>0&&numberMonth<=12){
            System.out.println("days in a month:" + month[numberMonth-1]);
        }else {
            System.out.println("no such month");
        }
    }
}
