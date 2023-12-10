package com.softserve.edu05.hw.HomeTask1;

import java.util.Scanner;

public class Task3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //int[] arr = inputArray();
        int[] arr = {1, -1, -2, 0, 4}; // Output: (3) (-2 2) (-8)

        //position of second positive number
        System.out.println("Position of second positive number is " + positionOfSecondPositiveNumber(arr));
        //Min value and its position
        System.out.println("Minimum values is " + arr[minimumValuePosition(arr)] + " and its index is " + minimumValuePosition(arr));
        //calculate the product of all entered even numbers
        System.out.println("The product of all entered even numbers is " + productOfAllEvenNumbers(arr));

    }

    private static long productOfAllEvenNumbers(int[] arr) {
        int product = 1;
        for (int element : arr) {
            if (element == 0) {
                continue;
            }
            if (element % 2 == 0) {
                product *= element;
            }
        }
        return product;
    }

    private static int minimumValuePosition(int[] arr) {
        int min = arr[0];
        int position = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                position = i;
            }
        }
        return position;
    }

    private static int positionOfSecondPositiveNumber(int[] arr) {
        int countOfPositives = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countOfPositives++;
            }
            if (countOfPositives == 2) {
                return i;
            }
        }
        return -1;
    }

    static int[] inputArray() {
        final int SIZE = 5;
        int[] arr = new int[SIZE];
        System.out.println("Enter 5 numbers of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr[" + i + "]: ");
            arr[i] = SCANNER.nextInt();
        }
        return arr;
    }
}
