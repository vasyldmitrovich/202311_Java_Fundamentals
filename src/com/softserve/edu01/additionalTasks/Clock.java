package com.softserve.edu01.additionalTasks;

import java.util.Scanner;

public class Clock {

    public static Scanner scanner = new Scanner(System.in);

    public static int func(int h, int m, int s){

        return (h * 3600000) + (m * 60000) + (s * 10000);


    }
    public static void main(String[] args) {

        //Task: Clock shows h hours, m minutes and s seconds after midnight.
        //
        //Your task is to write a function which returns the time since midnight in milliseconds.

        System.out.println("Enter the time separately (hours,minutes,seconds)");

        System.out.println("Enter hours:");
        int hours = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter minutes:");
        int minutes = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter seconds:");
        int seconds = Integer.parseInt(scanner.nextLine());

        System.out.printf("Result = %d ms.",func(hours,minutes,seconds));

    }
}
