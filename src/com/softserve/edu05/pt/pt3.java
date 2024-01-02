package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class pt3 {
    public static void main(String[] args) {
        int[] arr = genereteRandomsNumbers(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("max:" + max(arr));
        System.out.println("sum positive:" + sumOfPositives(arr));
        long countNegatives = countNegatives(arr);
        long countPositives = countPositives(arr);
        System.out.println("count negatives:" + countNegatives);
        System.out.println("count positives:" + countPositives);
        if (countPositives>countNegatives) {
            System.out.println("There are more positive values in the array");
        }else if((countPositives<countNegatives)){
            System.out.println("There are more negative values in the array.");
        }else{
            System.out.println("There are an equal number of positive and negative values in the array.");
        }

    }

    static int[] genereteRandomsNumbers(int quntity) {
        Random rnd = new Random();
        int[] arr = new int[quntity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-100, 100);
        }
        return arr;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static long sumOfPositives(int[] arr) {
        long sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    static long countNegatives(int[] arr) {
        long count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    static long countPositives(int[] arr) {
        long count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }
}
