package com.softserve.edu01.hw01;

import java.util.Scanner;

public class HomeWork1 {
    static double pi = Math.PI;
    static Scanner sc = new Scanner(System.in);

    public static void circleCalculation(){
        System.out.println("input radius = ");
        double radius = sc.nextDouble();
        double perimeter = 2 * pi * radius;
        double area = pi * Math.pow(radius,2);
        System.out.println("perimeter = " + (Math.round(perimeter * 100.0) / 100.0));
        System.out.println("area = " + (Math.round(area * 100.0) / 100.0));
        sc.nextLine();
    }

    public static void inputInformationAboutPeople(){
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Where do you live " + name + "?");
        String address = sc.nextLine();
        System.out.println(name + " lives in " +  address);
        sc.nextLine();
    }

    public static void calculateTheCostOfCalls(){
        System.out.println("Input the tariff of a minute from the first country = ");
        double tariff1 =sc.nextDouble();
        System.out.println("Input the duration of the call = ");
        double time1 =sc.nextDouble();
        double fullCost1 = tariff1 * time1;
        System.out.println("The cost of a call from the first country = " + fullCost1);
        System.out.println("Input the tariff of a minute from the second country = ");
        double tariff2 =sc.nextDouble();
        System.out.println("Input the duration of the call = ");
        double time2 =sc.nextDouble();
        double fullCost2 = tariff2 * time2;
        System.out.println("The cost of a call from the second country = " + fullCost2);
        System.out.println("Input the tariff of a minute from the third country = ");
        double tariff3 =sc.nextDouble();
        System.out.println("Input the duration of the call = ");
        double time3 =sc.nextDouble();
        double fullCost3 = tariff3 * time3;
        System.out.println("The cost of a call from the third country = " + fullCost3);
        double fullCost = fullCost1 + fullCost2 + fullCost3;
        System.out.println("The full cost of a calls = " + fullCost);
    }


    public static void main(String[] args) {
       circleCalculation();
       System.out.println();
       inputInformationAboutPeople();
       System.out.println();
       calculateTheCostOfCalls();
    }
}
