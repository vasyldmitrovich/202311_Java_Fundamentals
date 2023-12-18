package com.softserve.edu05.hw05.task03;

import java.util.Scanner;

public class CarMenu {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Car[] cars = {
                new Car(TypeOffCar.CROSSOVER, 2015, 4.8),
                new Car(TypeOffCar.BUS, 2008, 4.6),
                new Car(TypeOffCar.PICKUP, 2015, 2.8),
                new Car(TypeOffCar.SEDAN, 2023, 3.5),
        };

        outputAllCarsWithSameYear(menu(), cars);
        System.out.println("\n" + "*".repeat(10) + "Unsorted array" + "*".repeat(10));
        printArray(cars);
        sortByYearOfProduction(cars);
        System.out.println("\n" + "*".repeat(10) + "Sorted array" + "*".repeat(10));
        printArray(cars);

    }

    public static int menu() {
        System.out.print("Enter model year: ");
        int year = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Cars manufactured in " + year + ":");
        return year;
    }


    private static void printArray(Car[] cars) {
        for (var car : cars) {
            System.out.println(car);
        }
    }


    private static void outputAllCarsWithSameYear(int year, Car[] cars) {
        boolean contains = false;

        for (var car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car);
                contains = true;
            }
            if (!contains) {
                System.out.println("There is no car of this year of production");
                break;
            }
        }
    }

    private static void sortByYearOfProduction(Car[] car) {
        for (int i = 0; i < car.length - 1; i++) {
            for (int j = 0; j < car.length - 1 - i; j++) {
                if (car[j].getYearOfProduction() > car[j + 1].getYearOfProduction()) {
                    swap(car, j);
                }
            }
        }
    }

    private static void swap(Car[] cars, int j) {
        Car tmp = cars[j];
        cars[j] = cars[j + 1];
        cars[j + 1] = tmp;
    }
}