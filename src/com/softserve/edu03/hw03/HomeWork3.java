package com.softserve.edu03.hw03;

import java.util.Scanner;

public class HomeWork3 {
    static Scanner sc = new Scanner(System.in);

    public void calculateAreaOfATriangle() {
        double firstSide;
        double secondSide;
        double thirdSide;
        double semiPerimeter;
        double areaOfTriangle;
        System.out.println("Area of a triangle");
        System.out.println("Input the first side of a triangle  =");
        firstSide = sc.nextDouble();
        System.out.println("Input the second side of a triangle  =");
        secondSide = sc.nextDouble();
        System.out.println("Input the third side of a triangle  =");
        thirdSide = sc.nextDouble();
        semiPerimeter = ((firstSide + secondSide + thirdSide) / 2);
        System.out.println("semiPerimeter " + semiPerimeter);
        areaOfTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
        System.out.println("Area of a triangle = " + areaOfTriangle);
        sc.nextLine();
    }

    public void findTheSmallestNumber() {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int smallestNumber;
        System.out.println("find the smallest number");
        System.out.println("Input the first number =");
        firstNumber = sc.nextInt();
        System.out.println("Input the second number =");
        secondNumber = sc.nextInt();
        System.out.println("Input the third number =");
        thirdNumber = sc.nextInt();
        smallestNumber = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
        System.out.println("The smallest number is = " + smallestNumber);
        sc.nextLine();
    }

    public static void main(String[] args) {
        HomeWork3 homeWork2 = new HomeWork3();
        homeWork2.calculateAreaOfATriangle();
        homeWork2.findTheSmallestNumber();
    }


}
