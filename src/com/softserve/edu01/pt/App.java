package com.softserve.edu01.pt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Practical tasks

        // Task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input answer1: ");
        String an1 = scanner.nextLine();
        System.out.println("Input answer2: ");
        String an2 = scanner.nextLine();
        System.out.println("Input answer3: ");
        String an3 = scanner.nextLine();
        System.out.println(an3);
        System.out.println(an2);
        System.out.println(an1);


        // Task 2

        System.out.println("Input first number: ");
        int answer1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int answer2 = scanner.nextInt();
        System.out.println("Input third number: ");
        int answer3 = scanner.nextInt();
        double average = (answer1 + answer2 + answer3) / 3.0; //fixed
        System.out.println("average number" + average);

        // Task 3...


        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

    }
}
