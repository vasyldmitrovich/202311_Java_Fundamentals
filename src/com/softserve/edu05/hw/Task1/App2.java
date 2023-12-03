package com.softserve.edu05.hw.Task1;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        //Create a program (in different java documents) that prompts the user to enter:
        //10 integers numbers and calculates the sum of the first five elements if they are
        //positive, or the product of the last five elements if they are not and output the result.

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int leftSum = 0;
        int rightSum = 0;
        boolean leftFlag = false;

        //Input numbers
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        //Check if range of first five numbers contains negative.
        for (int i = 0; i < 5; i++) {
            if(numbers[i] <= 0){
                leftFlag = true;
            }
            leftSum += numbers[i];
            // Sum calculating while searching negative number, if flag is valid it will be used

        }

        if(leftFlag){ // Flag is still not valid. Calculating the sum of last 5 elements
            for (int i = 5; i < numbers.length; i++) {
                rightSum += numbers[i];
            }
            System.out.println("In range of first 5 elements is found negative number.\n " +
                    "Sum of last 5 elements = " + rightSum + ".");
        } else {
            System.out.println("Sum of first five numbers = " + leftSum + ".");
        }
    }
}
