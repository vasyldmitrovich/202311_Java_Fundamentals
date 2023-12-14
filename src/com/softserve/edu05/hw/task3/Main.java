package com.softserve.edu05.hw.task3;


import java.util.Scanner;

import static com.softserve.edu05.hw.task3.Car.sort;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Coupe", 1999, 2.0),
                new Car("Sedan", 2001, 1.9),
                new Car("Supercar", 2018, 6.0),
                new Car("Micro", 2009, 1.0),
        };
        System.out.print("Enter the year of production: ");
        int numYear = scanner.nextInt();
        boolean found = false;
        for (var i : cars) {
            if (i.getYearOfProduction() == numYear) {
                System.out.println(i.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no cars from year of production " + numYear);
        }
        //I sort cars from old to new
        System.out.println("=".repeat(60));
        sort(cars);
        for (var car : cars) {
            System.out.println(car);;
            break;
        }

    }
}

