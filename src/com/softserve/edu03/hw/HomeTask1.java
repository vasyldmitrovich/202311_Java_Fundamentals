package com.softserve.edu03.hw;

import java.util.Scanner;

import static com.softserve.edu03.hw.App.SCANNER;

public class HomeTask1 {//Good
    private static int sideNumber = 1;


    public static void run() {
        int side1 = setSideOfTriangle();
        int side2 = setSideOfTriangle();
        int side3 = setSideOfTriangle();
        System.out.println("The area if the triangle is %.2f".formatted(triangleArea(side1, side2, side3)));
    }

    public static int setSideOfTriangle() {
        System.out.print("Enter side №" + sideNumber + ": ");
        sideNumber++;
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static double triangleArea(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
