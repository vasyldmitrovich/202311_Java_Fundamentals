package com.softserve.edu01.hw02;

import java.util.Scanner;

public class Task2 {

    public static int Smallest(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        int smallestNumber = Smallest(number1, number2, number3);
        System.out.println("The smallest number is: " + smallestNumber);
    }
}
