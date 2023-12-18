package com.softserve.edu04.hw04;

import java.util.Scanner;

public class Range {


    double max = 5.0;
    double min = -5.0;
    double firstNumber;
    double secondNumber;
    double thirdNumber;
    static Scanner scanner = new Scanner(System.in);

    public boolean checkNumbers(double input) {

            return input >= min && input <= max ;
    }

    public void inputNumbers() {
        System.out.print(" Enter first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print(" Enter second number: ");
        secondNumber = scanner.nextDouble();
        System.out.print(" Enter third number: ");
        thirdNumber = scanner.nextDouble();
    }

    public void menu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Select the desired menu\n 1. Input tree numbers \n 2. Check tree numbers belong to the range[-5, 5]\n 3. Exit");
            int menuinput = scanner.nextInt();
            if (menuinput == 1) {
                inputNumbers();
            } else if (menuinput == 2) {
                boolean b = true;
                if (checkNumbers(firstNumber) == b && (checkNumbers(secondNumber) == b) && (checkNumbers(thirdNumber) == b)) {
                    System.out.println("All tree numbers belong to the range[-5, 5]");
                } else {
                    System.out.println("No all tree numbers belong to the range[-5, 5]");
                }
            } else if (menuinput == 3) {
                System.out.println("Have a nice day! Buy!");
                exit = true;
            }
        }
    }
}
