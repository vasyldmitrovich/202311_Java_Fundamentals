package com.softserve.edu01.pt;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Practical tasks
        var scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        // Task 1
        System.out.println("Task 1");
        System.out.println("Input text: ");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        System.out.println("Output text:");
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);

        // Task 2
        System.out.println("Task 2");
        System.out.print("Input first number: ");
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Input first number: ");
        double number2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Input first number: ");
        double number3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Average is: " + ((number1+number2+number3)/3));

        // Task 3
        System.out.println("Task 3");
        System.out.println("Input a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Input b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a b b = " + (a /(double) b));

        //Task 4
        System.out.println("Task 4");
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.println("You are " + answer + ".");
    }
}
