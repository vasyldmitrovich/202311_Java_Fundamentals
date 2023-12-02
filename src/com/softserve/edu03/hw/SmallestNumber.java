package com.softserve.edu03.hw;

import java.util.Scanner;

public class SmallestNumber {

    public  static Scanner scanner = new Scanner(System.in);

    public static int smallestNumber(int a, int b, int c) {

        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {

            if(array[i] < smallest){
                smallest = array[i];
            }

        }

        return smallest;
    }

    public static void main(String[] args) {

        System.out.println("Input the first number: ");
        int a = scanner.nextInt();
        System.out.println("Input the second number: ");
        int b = scanner.nextInt();
        System.out.println("Input the third number: ");
        int c = scanner.nextInt();

        System.out.printf("The smallest number is %d",smallestNumber(a,b,c));//Good
    }
}
