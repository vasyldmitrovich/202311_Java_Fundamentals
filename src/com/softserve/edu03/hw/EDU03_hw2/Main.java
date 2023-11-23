package com.softserve.edu03.hw.EDU03_hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );
        NumberComparison nc = new NumberComparison();

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        nc.setNum1(num1);

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        nc.setNum2(num2);

        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        nc.setNum3(num3);

        int smallestNum = nc.findLeastNumber(nc.getNum1(), nc.getNum2(), nc.getNum3());

        System.out.println(smallestNum + " is the smallest of these three numbers.");

    }
}
