package com.softserve.edu03.hw;

import java.util.Scanner;

public class Triangle {

    public static Scanner scanner = new Scanner(System.in);

    public static double area (double a, double b, double c){

        double area;
        double p = (a + b + c) / 2.0;

        area = Math.sqrt( p * (p - a) * (p - b) * (p - c));

        return area;
    }
    public static void main(String[] args) {


        System.out.print("Input side 1: ");
        double a = scanner.nextDouble();
        System.out.print("Input side 2: ");
        double b = scanner.nextDouble();
        System.out.print("Input side 3: ");
        double c = scanner.nextDouble();

        System.out.printf("The area of the triangle is %.2f ", area(a,b,c));

    }
}
