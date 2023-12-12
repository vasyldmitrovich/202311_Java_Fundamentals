package com.softserve.edu01.hw03;

import java.util.Scanner;

public class task02 {
    public static class RangeCheck {
        public static void main(String[] args) {
            var scanner = new Scanner(System.in);

            System.out.println("Enter three integer numbers:");
            System.out.print("Number 1: ");
            int num1 = scanner.nextInt();

            System.out.print("Number 2: ");
            int num2 = scanner.nextInt();

            System.out.print("Number 3: ");
            int num3 = scanner.nextInt();
            scanner.close();

            int max = num1;
            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }
            int min = num1;
            if (num2 < min) {
                min = num2;
            }
            if (num3 < min) {
                min = num3;
            }
            System.out.println("Maximum value among the three numbers: " + max);
            System.out.println("Minimum value among the three numbers: " + min);
        }
    }
}
