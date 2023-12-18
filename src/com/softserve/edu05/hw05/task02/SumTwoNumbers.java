package com.softserve.edu05.hw05.task02;

import java.util.Scanner;

public class SumTwoNumbers {

    private static final Scanner SCANNER = new Scanner(System.in);


    private static void menu() {
        int firstNumber;
        int secondNumber;
        String answer;
        do {
            System.out.print("Enter first number: ");
            firstNumber = inputNumber();
            System.out.print("Enter second number: ");
            secondNumber = inputNumber();
            System.out.println(firstNumber + " + " + secondNumber + " = " + sum(firstNumber, secondNumber));
            System.out.println("Do you want to continue? [Yes / No]");
            answer = getAnswer();
        } while ("yes".equals(answer) | "y".equals(answer));
    }

    static int sum(int number1, int number2) {
        return number1 + number2;
    }

    static String getAnswer() {
        String answer = SCANNER.nextLine();
        answer = answer.toLowerCase();
        return answer;
    }

    static int inputNumber() {
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static void main(String[] args) {
        menu();
    }
}
