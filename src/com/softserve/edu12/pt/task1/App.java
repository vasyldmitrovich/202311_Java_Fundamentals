package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = -1;
        int b = -1;

        while (!(a > 0)) {
            System.out.println("Enter side a as positive integer: ");
            try {
                a = Integer.parseInt(scanner.nextLine());
            } catch (RuntimeException exception) {
                System.out.println("It is mistake! ");
                a = -1;
            }
        }
        while (!(b > 0)) {
            System.out.println("Enter side b as positive integer: ");
            try {
                b = Integer.parseInt(scanner.nextLine());
            } catch (RuntimeException exception) {
                System.out.println("It is mistake! ");
                b = -1;
            }
        }
        System.out.println("Erea of rectangle = " + areaRectangle(a, b));
    }

    public static int areaRectangle(int a, int b) {
        return a * b;
    }
}
