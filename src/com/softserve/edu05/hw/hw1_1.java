package com.softserve.edu05.hw;

import java.util.Scanner;

public class hw1_1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Enter the month number:");
        int numberMonth = SCANNER.nextInt();
        if (numberMonth>0&&numberMonth<=12){
        System.out.println("days in a month:" + month[numberMonth-1]);
        }else {
            System.out.println("no such month");
        }
    }
}
