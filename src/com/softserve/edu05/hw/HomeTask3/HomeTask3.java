package com.softserve.edu05.hw.HomeTask3;

import java.util.Scanner;

public class HomeTask3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Car[] cars = {
                new Car(CarType.SUV, 2005, 2.0),
                new Car(CarType.BUS, 2000, 3.5),
                new Car(CarType.COUPE, 1998, 2.5),
                new Car(CarType.CABRIOLET, 2005, 2.0),
        };

        //Certain model year
        System.out.print("Enter model year: ");
        int year = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Cars manufactured in " + year + ":");
        outAllCarsWithSameYear(year, cars);

        //Sorting by year of production
        System.out.println("\n==================Unsorted array==================");
        printArray(cars);
        sortByYearOfProduction(cars);
        System.out.println("\n==================Sorted array==================");
        printArray(cars);


    }

    private static void printArray(Car[] cars) {
        for (var car : cars) {
            System.out.println(car);
        }
    }

    private static void outAllCarsWithSameYear(int year, Car[] cars) {
        boolean haveAtLeastOne = false;
        for (var car : cars) {
            if (car.getYear_of_production() == year) {
                System.out.println(car);
                haveAtLeastOne = true;
            }
        }
        if (!haveAtLeastOne) {
            System.out.println("There is no car that manufactured in " + year + " year");
        }
    }

    private static void sortByYearOfProduction(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYear_of_production() > cars[j + 1].getYear_of_production()) {
                    swap(cars, j);
                }
            }
        }
    }

    private static void swap(Car[] cars, int j) {
        Car temp = cars[j];
        cars[j] = cars[j + 1];
        cars[j + 1] = temp;
    }
}
