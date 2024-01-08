package com.softserve.edu12.hw.homeTask2;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int start;
        int end;
        int[] numbers = new int[10];
        String[] result = new String[10];

        while (true) {
            try {
                System.out.print("Enter range start: ");
                start = Integer.parseInt(SCANNER.nextLine());
                System.out.print("Enter range end: ");
                end = Integer.parseInt(SCANNER.nextLine());

                break;
            } catch (NumberFormatException e) {
                //continue;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.print("Enter number [" + i + "]: ");
                numbers[i] = Integer.parseInt(SCANNER.nextLine());
                result[i] = String.valueOf(readNumber(start, end, numbers[i]));
            } catch (NumberFormatException e) {
                result[i] = "Entered not a number";
            } catch (IllegalArgumentException e) {
                result[i] = e.getMessage();
            }
        }

        System.out.println("===================================");

        for (int i = 0; i < result.length; i++) {
            System.out.println("Number [" + i + "]: " + result[i]);
        }
    }

    static int readNumber(int start, int end, int number) {
        if (number >= start && number <= end) {
            return number;
        } else {
            throw new IllegalArgumentException("Number is not in range [" + start + " - " + end + "]");
        }
    }
}
