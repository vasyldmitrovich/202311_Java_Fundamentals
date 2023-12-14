package com.softserve.edu05.hw.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;
        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.println("The sum of these two numbers = " + (num1 + num2));
            System.out.print("Do you want to repeat the operation again(y/n)? ");
            continueChoice = scanner.next().charAt(0);
        } while (Character.toLowerCase(continueChoice) == 'y');
    }
}
