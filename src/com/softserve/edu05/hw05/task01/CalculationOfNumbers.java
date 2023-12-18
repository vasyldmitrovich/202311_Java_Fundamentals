package com.softserve.edu05.hw05.task01;

import java.util.Arrays;
import java.util.Scanner;

public class CalculationOfNumbers {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int[] inputNumber() {
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        System.out.println("Enter 10 numbers of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr[" + i + "]: ");
            arr[i] = SCANNER.nextInt();
        }
        return arr;
    }

    static int calculateSumOfTheFirstFiveNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int calculateProductOfTheLastFiveNumbers(int[] arr) {
        int product = 1;
        for (int i = 5; i < 10; i++) {
            product *= arr[i];
        }
        return product;
    }

    static boolean checkPositiveOfTheFirstFiveNumber(int[] arr) {
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                return false;
            }
        }
        return true;
    }

    static void outputInformation() {
        int[] arr = inputNumber();
        System.out.println("You array is: " + Arrays.toString(arr));
        if (checkPositiveOfTheFirstFiveNumber(arr)) {
            System.out.println("Sum of the first five numbers: " + calculateSumOfTheFirstFiveNumbers(arr));
        } else {
            System.out.println("Product of the last five numbers: " + calculateProductOfTheLastFiveNumbers(arr));
        }
    }

    public static void main(String[] args) {
        outputInformation();
    }


}
