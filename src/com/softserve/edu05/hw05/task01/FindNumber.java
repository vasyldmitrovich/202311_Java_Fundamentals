package com.softserve.edu05.hw05.task01;

import java.util.Scanner;

public class FindNumber {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int[] inputNumber() {
        final int SIZE = 5;
        int[] arr = new int[SIZE];
        System.out.println("Enter 5 numbers of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr[" + i + "]: ");
            arr[i] = SCANNER.nextInt();
        }
        return arr;
    }

    static int findPositionOFSecondPositiveNumber(int[] arr) {
        int position = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && count <= 1) {
                count++;
                position = i;
            }
        }
        return position;
    }

    static int findMinimumValueAndItsPosition(int[] arr) {
        int min = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                position = i;
            }
        }
        return position;
    }


    static int calculateTheProductOfAllEnteredEvenNumbers(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                product *= arr[i];
            }
        }
        return product;

    }

    static void outputInformation() {
        int[] arr = inputNumber();
        System.out.println("Position of second positive number: " + findPositionOFSecondPositiveNumber(arr));
        System.out.println("Position of minimum value in array: " + findMinimumValueAndItsPosition(arr));
        System.out.println("Product of all entered even numbers: " + calculateTheProductOfAllEnteredEvenNumbers(arr));

    }

    public static void main(String[] args) {
        outputInformation();
    }
}
