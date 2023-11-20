package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();

        // Task 2
        App.task2();
    }

    public static void task1 () {
        System.out.println("Enter string one:  ");
        String name1 = scanner.nextLine();
        System.out.println("Enter string two:  ");
        String name2 = scanner.nextLine();
        System.out.println("Enter string three:  ");
        String name3 = scanner.nextLine();

        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name1);
    }

    public static void task2() {
        System.out.println("Enter the first number:  ");
        double firstNum = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the second number:  ");
        double secondNum = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the third number:  ");
        double thirdNum = scanner.nextDouble();
        scanner.nextLine();

        System.out.println( ( firstNum + secondNum + thirdNum ) / 3 );

    }
}
