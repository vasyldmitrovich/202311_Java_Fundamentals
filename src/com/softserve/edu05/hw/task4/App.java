package com.softserve.edu05.hw.task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberControl = 27;
        int number = 0;
        while (number != numberControl) {
            System.out.println("Enter the number: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number > numberControl) {
                System.out.println("Too high, try again.");
            } else if (number < numberControl) {
                System.out.println("Too low, try again.");
            } else System.out.println("Exact! Correct!");
        }
    }
}
