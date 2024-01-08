package com.softserve.edu12.pt.practicalTask1;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

        while (true) {
            try {
                System.out.print("Enter a: ");
                a = Integer.parseInt(SCANNER.nextLine());
                System.out.print("Enter b: ");
                b = Integer.parseInt(SCANNER.nextLine());
                int area = rectangleArea(a, b);
                System.out.println("The rectangle area is " + area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("You should enter int values!");
                //empty
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Size should be not negative but where: a = " + a + " b = " + b);
        }
        return a * b;
    }
}
