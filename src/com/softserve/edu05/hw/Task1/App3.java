package com.softserve.edu05.hw.Task1;

import java.util.Scanner;

public class App3 {


    public static void checkPositionOfSecondPositive(int[] numbers) {

        int checkPosition = 0;
        int positiveCount = 0;

        for (int i = 0; i < numbers.length; i++) {


            if(numbers[i] >= 1){
            positiveCount++;//Count how much positives was found
            }
            //If second positive is found - get out from loop
            if(positiveCount == 2){
                checkPosition = i;
                break;
            }
        }

        if(positiveCount == 0){
            System.out.println("There is no positive numbers");
        }else if(positiveCount == 1){
            System.out.println("Second positive number not found");
        } else {
            System.out.printf("Position of second positive number %d\n", checkPosition + 1);
        }

    }

    public static void checkMinPosition(int[] numbers) {

        int checkPosition = 0;
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] < min){
                min = numbers[i];
                checkPosition = i + 1;
            }
        }

        System.out.printf("Min value = %d, at position %d.\n", min, checkPosition);
    }
    public static int sumOfEven(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 == 0 && numbers[i] != 0){
                sum += numbers[i];
            }
        }

        return sum;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integer numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        checkPositionOfSecondPositive(numbers);//First point
        checkMinPosition(numbers);//Second point
        System.out.printf("Sum of even numbers =  %d\n", sumOfEven(numbers));//Third point

    }
}
