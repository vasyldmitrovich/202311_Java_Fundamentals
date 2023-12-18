package com.softserve.edu05.pt.Task3;

import java.util.Random;

public class Main {//Nice

    //Find array maximum
    public static int biggestNum(int[] array){
        int max = 0;

        for (int j : array) {

            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    //Find sum of positives
    public static int sumOfPositiveNumbers(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }

        return sum;
    }
    //Count negatives
    public static int countNegatives(int[] array){
        int count = 0;

        for (int j : array) {

            if (j < 0) {
                count++;
            }
        }
        return count;
    }

    //Determine whether there are more negative or positive values in the array.
    public static void checkNumbers(int[] array){
        int negatives = 0;
        int positives = 0;

        for (int j : array) {

            if (j < 0) {
                negatives++;
            } else {
                positives++;
            }
        }
        if(negatives > positives){
            System.out.println("There are more negative values in the array.");
        } else if (positives > negatives){
            System.out.println("There are more positives values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }

    }

    public static void main(String[] args) {

        int [] randomArray = new int[10];
        Random random = new Random();

        System.out.println("Array:");
        for (int i = 0; i < randomArray.length; i++) {

            randomArray[i] = random.nextInt(200)-100;
            System.out.print(randomArray[i] + " ");
        }

        System.out.println();
        System.out.println("Max value = " + biggestNum(randomArray));
        System.out.println("Sum of positive values = " + sumOfPositiveNumbers(randomArray));
        System.out.println("Count of negatives =  " + countNegatives(randomArray));
        checkNumbers(randomArray);


    }
}
