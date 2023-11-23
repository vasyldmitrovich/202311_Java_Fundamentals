package com.softserve.edu03.hw;
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();

        // Task 2...
        App.task2();

        // Task 3...
        // App.task3();
    }

    public static void task1 () {
        System.out.println("Enter the Side 1: ");
        double s1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the Side 2: ");
        double s2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the Side 3: ");
        double s3 = Double.parseDouble(scanner.nextLine());

        System.out.println("Area of the triangle: " + areaTriangle(s1, s2, s3));

    }

    public static double areaTriangle(double s1, double s2, double s3){
           double p = (s1 + s2 + s3)/2;
           double area = Math.pow(p*(p-s1)*(p-s2)*(p-s3), 1.0/2.0);
           return area;
    }

    public static void task2 () {

        System.out.println("Enter the first number: ");
        int a1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number: ");
        int a2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number: ");
        int a3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Smallest number: " + smallestNumber(a1, a2, a3));
    }

    public static int smallestNumber(int s1, int s2, int s3) {
        int firstmin = Math.min(s1, s2);
        return Math.min(firstmin, s3);
    }

    public static void task3 () {

    }
}
