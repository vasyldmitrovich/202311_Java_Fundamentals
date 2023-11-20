package com.softserve.edu01.hw;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Homeworks

        // Task 1
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
        System.out.println("input radius");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        double area = Math.PI * radius * radius;
        double perimeter = Math.PI * 2 * radius;
        System.out.println("area is " + area);
        System.out.println("perimeter is " + perimeter);

        // Task 2...
        System.out.println("What is your name: ");
        String answer = scanner.nextLine();
        System.out.println("You name is " + answer);
        System.out.println("Where do you live: ");
        String answer1 = scanner.nextLine();
        System.out.println("You live in " + answer1);
    }
}
