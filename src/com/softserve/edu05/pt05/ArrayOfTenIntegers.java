package com.softserve.edu05.pt05;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfTenIntegers {
    public static void main(String[] args) {
        int[] arr = generateRandomNumbers();
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value is " + max(arr));
        System.out.println("The sum of positives value is " + sumOfPositives(arr));
        System.out.println("The number of negatives value is " + countOfNegatives(arr));
        int countPositives = countOfPositives(arr);
        int countNegatives = countOfNegatives(arr);
        if (countPositives < countNegatives) {
            System.out.println("There are more negatives values in the array");
        } else if (countPositives > countNegatives) {
            System.out.println("There are more positives values in the array");
        } else {
            System.out.println("There are an equal number of positives and negatives values in the array");
        }
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int[] generateRandomNumbers() {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-99, 100);
        }
        return arr;
    }


    static long sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int countOfNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    static int countOfPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i >= 0) {
                count++;
            }
        }
        return count;
    }


}
