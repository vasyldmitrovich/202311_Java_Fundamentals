package com.softserve.edu05.hw;

import java.util.Objects;
import java.util.Scanner;

public class hw2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        calculateSum(2);
    }

    static void calculateSum(int length) {
        int count = 0;
        int[] arr = new int[length];
        while (count != length) {
            count++;
            System.out.print("Enter number " + count + ":");
            arr[count - 1] = SCANNER.nextInt();
        }
        System.out.println("sum:" + sumArray(arr) + "\n");
        SCANNER.nextLine();

        System.out.println("continue ?(y/n)");
        String response = SCANNER.nextLine();
        if (Objects.equals(response, "y")) calculateSum(2);

    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    ;
}
