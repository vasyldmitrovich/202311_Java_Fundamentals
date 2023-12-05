package com.softserve.edu05.hw.task2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);
        String answer;
        do {
            System.out.println("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Sum of numbers: " + (num1 + num2));
            System.out.println("Continue?");
            answer = scanner.nextLine().toLowerCase();
        }
        while (answer.equals("yes"));

    }
}
