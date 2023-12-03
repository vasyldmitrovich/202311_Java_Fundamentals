package com.softserve.edu03.pt.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum = getNumber("Enter the first number: ");
        int secondNum = getNumber("Enter the second number: ");

        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " +
                getTotal(firstNum, secondNum));
        System.out.println("The average of " + firstNum + " and " + secondNum + " is " +
                getAverage(firstNum, secondNum));
    }

    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static double getAverage(int num1, int num2) {
        return (double) (num1 + num2) / 2;
    }

    static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
