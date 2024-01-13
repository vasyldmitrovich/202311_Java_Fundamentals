package com.softserve.edu15.edu05.hw.Task1;

import java.util.Scanner;


public class App1 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Create a program (in different java documents) that prompts the user to enter:
        //a month number and calculates the number of days in that month based on an array

        Scanner scanner = new Scanner(System.in);

        //arrays initialization
        int[] january = new int[31];
        int[] february = new int[29];
        int[] march = new int[31];
        int[] april = new int[30];
        int[] may = new int[31];
        int[] june = new int[30];
        int[] july = new int[31];
        int[] august = new int[31];
        int[] september = new int[30];
        int[] october = new int[31];
        int[] november = new int[30];
        int[] december = new int[31];

        System.out.println("Enter a month number to calculate the number of days.");
        int input = scanner.nextInt();

        switch (input){
            case 1 -> System.out.printf("Number of days in %dst month = %d", input, january.length);
            case 2 -> System.out.printf("Number of days in %dnd month = %d", input, february.length);
            case 3 -> System.out.printf("Number of days in %drd month = %d", input, march.length);
            case 4 -> System.out.printf("Number of days in %d month = %d", input, april.length);
            case 5 -> System.out.printf("Number of days in %d month = %d", input, may.length);
            case 6 -> System.out.printf("Number of days in %d month = %d", input, june.length);
            case 7 -> System.out.printf("Number of days in %d month = %d", input, july.length);
            case 8 -> System.out.printf("Number of days in %d month = %d", input, august.length);
            case 9 -> System.out.printf("Number of days in %d month = %d", input, september.length);
            case 10 -> System.out.printf("Number of days in %d month = %d", input, october.length);
            case 11 -> System.out.printf("Number of days in %d month = %d", input, november.length);
            case 12 -> System.out.printf("Number of days in %d month = %d", input, december.length);
            default -> System.out.println("The number is not in range of numbers of months!");
        }


    }
}
