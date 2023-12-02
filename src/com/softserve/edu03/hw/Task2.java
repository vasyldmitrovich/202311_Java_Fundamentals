package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

        int minimum = smallestNumber(num1, num2, num3);

        System.out.println("The smallest number is: " + minimum);
    }

    public static int smallestNumber(int num1, int num2, int num3) {
        int min = Math.min(
                Math.min(num1, num2),
                Math.min(num2, num3));
        return min;
    }//Good
}
