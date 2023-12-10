package com.softserve.edu05.hw.HomeTask2;

import java.util.Scanner;

public class HomeTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int number1;
        int number2;
        String answer;
        do {
            System.out.print("Enter number 1: ");
            number1 = Integer.parseInt(SCANNER.nextLine());
            System.out.print("Enter number 2: ");
            number2 = Integer.parseInt(SCANNER.nextLine());
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            System.out.println("Do you want to continue? [Yes / No]");
            answer = SCANNER.nextLine();
        } while ("yes".equalsIgnoreCase(answer) | "y".equalsIgnoreCase(answer));

    }
}
