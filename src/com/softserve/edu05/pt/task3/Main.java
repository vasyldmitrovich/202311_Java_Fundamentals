package com.softserve.edu05.pt.task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomNum(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value is " + getMax(arr));
        System.out.println("The sum of all values of the array is equal to " + getSum(arr));
        System.out.println("The number of negative value is " + getNegatives(arr));
        System.out.println("The number of positive value is " + getPositives(arr));

        int countPositives = getPositives(arr);
        int countNegativies = getNegatives(arr);
        if (countNegativies > countPositives) {
            System.out.println("There are more negative values in the array.");
        } else if (countPositives > countNegativies) {
            System.out.println("There are more positive values in the array. ");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }

    }
    static int[] generateRandomNum (int quantity) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-100, 100);
        }
        return arr;
    }
    static int getMax (int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    static long getSum (int [] arr) {
        int sum = 0;
        for (int v : arr) {
            if (v > 0) {
                sum += v;
            }
        }
        return sum;
    }

    static int getNegatives (int [] arr) {
        int count = 0;
        for (int v : arr) {
            if (v < 0) {
                count ++;
            }
        }
        return count;
    }

    static int getPositives (int [] arr) {
        int count = 0;
        for (int v : arr) {
            if (v > 0) {
                count++;
            }
        }
        return count;
    }
}