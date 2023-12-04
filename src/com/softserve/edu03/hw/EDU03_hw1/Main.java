package com.softserve.edu03.hw.EDU03_hw1;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ){//Good
        Scanner scanner = new Scanner( System.in );

        AreaOfATriangle areaOfTriangle = new AreaOfATriangle();

        System.out.println("Enter the length of side one of the triangle: ");
        int side1 = scanner.nextInt();
        areaOfTriangle.setLengthSide1(side1);

        System.out.println("Enter the length of side two of the triangle: ");
        int side2 = scanner.nextInt();
        areaOfTriangle.setLengthSide2(side2);

        System.out.println("Enter the length of side three of the triangle: ");
        int side3 = scanner.nextInt();
        areaOfTriangle.setLengthSide3(side3);

        double dreieck = AreaOfATriangle.triangleArea(
                areaOfTriangle.getLengthSide1(),
                areaOfTriangle.getLengthSide2(),
                areaOfTriangle.getLengthSide3());

        System.out.printf("Area of the triangle is %.2f%n", dreieck);

    }
}
