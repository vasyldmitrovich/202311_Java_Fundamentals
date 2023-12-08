package com.softserve.edu04.hw.task2;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int maximal = max(num1, num2, num3);
        int minimal = min(num1, num2, num3);

        System.out.println("The maximum value is " + maximal + " and the minimum is " + minimal);
    }
    public static int max(int num1, int num2, int num3) {
        int max = Math.max(
                Math.max(num1, num2),
                Math.max(num2, num3));
        return max;
    }
    public static int min(int num1, int num2, int num3) {
        int min = Math.min(
                Math.min(num1, num2),
                Math.min(num2, num3));
        return min;
    }
}
