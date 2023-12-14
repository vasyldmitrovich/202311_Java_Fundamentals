package com.softserve.edu05.hw.HomeTask1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = inputArray();
        //int[] arr = {1,2,3,4,5,6,7,8,9,10};  //result: 15
        //int[] arr = {10,9,-8,7,6,2,2,2,2,2}; //result: 32
        System.out.println("Your array: " + Arrays.toString(arr));
        if (firstFiveNumbersArePositive(arr)) {
            System.out.println(sumOfFirstFiveElements(arr));
        } else {
            System.out.println(productOfLastFiveElements(arr));
        }


    }

    static int productOfLastFiveElements(int[] arr) {
        int prduct = 1;
        for (int i = 5; i < 10; i++) {
            prduct *= arr[i];
        }
        return prduct;
    }

    static int sumOfFirstFiveElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean firstFiveNumbersArePositive(int[] arr) {
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                return false;
            }
        }
        return true;
    }

    static int[] inputArray() {
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        System.out.println("Enter 10 numbers of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr[" + i + "]: ");
            arr[i] = SCANNER.nextInt();
        }
        return arr;
    }


}
