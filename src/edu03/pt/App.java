package edu03.pt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // task 1
        var scanner = new Scanner(System.in);
        double num1 = getNumber("Enter first number: ", scanner);

        double num2 = getNumber("Enter second number: ", scanner);

        double total = getTotal(num1, num2);
        double average = getAverage(num1, num2);
        System.out.println("Total is: " + total);
        System.out.println("Average is: " + average);
        scanner.close();
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double getNumber(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            scanner.next(); // Clear the input
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }

}


