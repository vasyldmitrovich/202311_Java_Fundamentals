package com.softserve.edu05.hw.HomeTask2;

import java.util.Scanner;

public class HomeTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        taskRun();

    }

    private static void taskRun() {
        int number1;
        int number2;
        String answer;
        do {
            System.out.print("Enter number 1: ");
            number1 = getNumber();
            System.out.print("Enter number 2: ");
            number2 = getNumber();
            System.out.println(number1 + " + " + number2 + " = " + sum(number1, number2));
            System.out.println("Do you want to continue? [Yes / No]");
            answer = getAnswer();
        } while ("yes".equals(answer) | "y".equals(answer)); //while ("yes".equalsIgnoreCase(answer) | "y".equalsIgnoreCase(answer));
    }

    static int sum(int number1, int number2) {
        return number1 + number2;
    }

    static String getAnswer(){
        String answer = SCANNER.nextLine();
        answer = answer.toLowerCase();
        return answer;
    }

    static int getNumber(){
        return Integer.parseInt(SCANNER.nextLine());
    }

}
