package com.softserve.edu05.pt.PracticalTask3;

import java.util.Arrays;
import java.util.Random;

/* Create an array of ten random integers using a random number generator. Output:
 • the biggest number in the array;
 • the sum of positive numbers;
 • count the number of negative numbers.
 • determine whether there are more negative or positive values in the array. If there are
 more negative values, output "There are more negative values in the array." Otherwise,
 output "There are more positive values in the array." If the counts are equal, output
"There are an equal number of positive and negative values in the array*/
public class PracticalTask3 {
    public static void main(String[] args) {
        int[] arr = generateRandomNumbers(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value is " + max(arr));
        System.out.println("The sum of positive values is " + sumOfPositives(arr));
        System.out.println("The count of negatives values is " + countNegatives(arr));
        int countNegatives = countNegatives(arr);
        int countPositives = arr.length - countNegatives;
        if (countNegatives > countPositives) {
            System.out.println("There are more negative values in the array.");
        } else if (countNegatives < countPositives) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }


    }

    //Generate random array;
    static int[] generateRandomNumbers(int quantity) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-99, 100);
        }
        return arr;
    }

    //The biggest number in the array;
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //The sum of positive numbers
    static long sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int countNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

}
