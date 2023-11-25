package com.softserve.edu01.pt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Practical tasks

        // Task 1
        var scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String thirdInput = scanner.nextLine();
        System.out.println("Output text:");
        System.out.println(thirdInput);
        System.out.println(secondInput);
        System.out.println(firstInput);

        // Task 2
        System.out.print("Number 1: ");
        double inputFirst = scanner.nextDouble();
        System.out.print("Number 2: ");
        double inputSecond = scanner.nextDouble();
        System.out.print("Number 3: ");
        double inputThird = scanner.nextDouble();
        double average = (inputFirst + inputSecond + inputThird) / 3;
        System.out.print(average);

        // Task 3*
        int a;
        int b;
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.print("a / b = " + ((double) a / (double) b));

        // Task 4*
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.print("You are " + answer);
    }
}
