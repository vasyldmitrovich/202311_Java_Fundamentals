package com.softserve.edu12.pt.pt1;

import java.util.Scanner;

public class pt1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        while (true) {
            try {
                System.out.println("Enter a:");
                a = Integer.parseInt(SCANNER.nextLine());

                System.out.println("Enter b:");
                b = Integer.parseInt(SCANNER.nextLine());
                int area = rectangleArea(a, b);
                System.out.println("The rectangle area is:" + area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("You should enter integer values");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides should be non negative but were:" +
                    " a = " + a + " b = " + b);
        }
        return a * b;
    }
}
