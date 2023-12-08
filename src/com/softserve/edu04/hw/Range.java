package com.softserve.edu04.hw;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        if (num1 >= -5 && num1 <= 5 && num2 >= -5 && num2 <= 5 && num3 >= -5 && num3 <= 5) {
            System.out.println("Numbers " + num1 + ", " + num2 + " and " + num3 + " belong to the range [-5, 5]");
        }
        else System.out.println("Not all numbers belong to the range [-5, 5]");
    }
}
