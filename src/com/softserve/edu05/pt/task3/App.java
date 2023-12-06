package com.softserve.edu05.pt.task3;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-1000, 1000);
        }

        int countNegative = getCountNegative(arr);
        int countPositive = getCountPositive(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max number is: " + getMax(arr));
        System.out.println("The sum of positive numbers is: " + getSumPositive(arr));
        System.out.println("The count of negative numbers is: " + countNegative);
        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array.");
        } else if (countNegative < countPositive) {
            System.out.println("There are more positive values in the array.");
        } else System.out.println("There are an equal number of positive and negative values in the array.");

    }

    static int getMax(int[] arr) {
        int maxN = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxN) {
                maxN = arr[i];
            }
        }
        return maxN;
    }

    static int getSumPositive(int[] arr) {
        int sumP = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumP += arr[i];
            }
        }
        return sumP;
    }

    static int getCountNegative(int[] arr) {

        int countNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countNegative += 1;
            }
        }
        return countNegative;
    }

    static int getCountPositive(int[] arr) {

        int countPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                countPositive += 1;
            }
        }
        return countPositive;
    }


}
