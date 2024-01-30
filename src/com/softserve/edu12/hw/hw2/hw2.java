package com.softserve.edu12.hw.hw2;


import java.util.Arrays;
import java.util.Scanner;

public class hw2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        var numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = readNumber(start, end);
            start = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }

    static int readNumber(int start, int end) {
        int x=0;
        try {
            System.out.println("Enter integer number (" + start + ", " + end + "):");
            x = SCANNER.nextInt();

        } catch (Exception e) {
            throw new RuntimeException("invalid number format");

        }

        if (x < start || x > end) {
            throw new RuntimeException("number is not in range (" + start + ", " + end + "):");
        }
        return x;
    }
}
