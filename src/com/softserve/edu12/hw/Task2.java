package com.softserve.edu12.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 10) {
            try {
                System.out.println("Enter start number of range: ");
                int start = Integer.parseInt(scanner.nextLine());
                if ((start < 1) || (start >= 100)) {
                    throw new IllegalArgumentException("Number must be more than 1, and less than 100!");
                }
                System.out.println("Enter end number of range: ");
                int end = Integer.parseInt(scanner.nextLine());
                if ((end >= 100) || (end < start)) {
                    throw new IllegalArgumentException("Number must be less than 100 and start must be less than end!");
                }
                System.out.println(readNumber(start, end));
                counter++;
            } catch (NumberFormatException exception) {
                System.out.println("Please, enter integer number." + exception.getMessage());
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }


    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            arrNumbers.add(i);
        }
        System.out.println("Enter the integer number for the checking: ");
        int a = Integer.parseInt(scanner.nextLine());
        if (arrNumbers.contains(a)) {
            return a;
        } else throw new RuntimeException("Number is not in the range!");
    }
}
