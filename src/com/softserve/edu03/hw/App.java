package com.softserve.edu03.hw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();

        double area = calculateTriangleArea(side1, side2, side3);

        System.out.println("The area of the triangle is: " + area);

    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}