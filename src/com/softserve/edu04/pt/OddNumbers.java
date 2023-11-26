package com.softserve.edu04.pt;

import java.util.Scanner;

public class OddNumbers {
    public static Scanner scanner = new Scanner(System.in);

    public static int checkOdd(int [] numbers){

        int count = 0;

        for (int number : numbers) {

            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int [] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {

            System.out.printf("Input %d number \n",i+1);
            numbers[i] = scanner.nextInt();
        }

        System.out.printf("Count of odds = %d", checkOdd(numbers));

    }
}
