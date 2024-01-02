package com.softserve.edu05.hw;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw1_2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //int[] arr = genereteRandomsNumbers(10);
        int[] arr = enterNumbers(10);
        System.out.println(Arrays.toString(arr));
        calculateFirstCondition(arr);

        //int[] arr1 = genereteRandomsNumbers(5);
        int[] arr1 = enterNumbers(5);
        System.out.println(Arrays.toString(arr1));
        calculateSecondCondition(arr1);
    }

    static int[] enterNumbers(int lengthArr) {
        int[] arr = new int[lengthArr];
        for (int i = 1; i < lengthArr + 1; i++) {
            System.out.print("Enter number " + i + ":");
            arr[i - 1] = SCANNER.nextInt();
        }
        return arr;
    }

    ;

    static void calculateSecondCondition(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0) {
                count++;
                if (count == 2) {
                    System.out.println("position of second positive number:" + i);
                    break;
                }
            }
        }
        if (count < 2) System.out.println("no second positive number");

        int min = arr[0];
        int position = 0;
        for (int j = 1; j < arr.length - 1; j++) {
            if (min > arr[j]) {
                min = arr[j];
                position = j;
            }
        }
        System.out.println("min[" + position + "]=" + min);

        int res = 0;

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > 0) {
                if (res == 0) {
                    res = arr[j];

                } else if (arr[j] != 0) {
                    res *= arr[j];

                }

            }
        }
        System.out.println("product of positive numbers:" + res);
    }


    ;

    static void calculateFirstCondition(int[] arr) {
        int res = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                res = 0;
                break;
            }
            res += arr[i];
        }
        if (res == 0) {
            res = 1;
            for (int i = 5; i < 9; i++) {
                res *= arr[i];
            }
        }
        System.out.println("res:" + res);
    }


    static int[] genereteRandomsNumbers(int quntity) {
        Random rnd = new Random();
        int[] arr = new int[quntity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-10, 10);
        }
        return arr;
    }
}
