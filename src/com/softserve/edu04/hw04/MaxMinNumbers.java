package com.softserve.edu04.hw04;

import java.util.Scanner;

public class MaxMinNumbers {


    int firstNumber;
    int secondNumber;
    int thirdNumber;

    static Scanner scanner = new Scanner(System.in);
    public void inputNumbers() {
        System.out.print(" Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.print(" Enter second number: ");
        secondNumber = scanner.nextInt();
        System.out.print(" Enter third number: ");
        thirdNumber = scanner.nextInt();
    }
    public int determinateTheMax(){
        int max = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        return max;
    }

    public int determinateTheMin(){
        int min = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        return min;
    }


    public void menu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Select the desired menu\n 1. Input tree numbers \n 2. Check max and min numbers \n 3. Exit");
            int menuinput = scanner.nextInt();
            if (menuinput == 1) {
                inputNumbers();
            } else if (menuinput == 2) {
                System.out.println("Maximum of number is " + determinateTheMax());
                System.out.println("Minimum of number is " + determinateTheMin());

            } else if (menuinput == 3) {
                System.out.println("Have a nice day! Buy!");
                exit = true;
            }
        }
    }

}
