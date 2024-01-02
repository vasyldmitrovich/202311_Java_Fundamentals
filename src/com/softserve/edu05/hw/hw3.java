/*
Create class called Car with fields: type, year of production and engine capacity.
        • Create and initialize in main() method four instances of class Car.
        • Output result for cars:
o certain model year (enter year in the console);
o sorted cars by the field “year of production ”.*/
package com.softserve.edu05.hw;


import java.util.Arrays;
import java.util.Scanner;

public class hw3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        Car[] arr = initialization();

        outputArray(arr);

        System.out.print("Enter the year of manufacture:");
        showByYear(SCANNER.nextInt(), arr);

        sortByYear(arr);
        outputArray(arr);

    }

    static void sortByYear(Car[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getYearOfProduction() < arr[j + 1].getYearOfProduction()) {
                    var swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;

                }
            }
        }
    }

    static void outputArray(Car[] arr) {
        for (Car car : arr) {
            System.out.println(car.toString());
        }
    }

    static void showByYear(int year, Car[] arr) {

        boolean found = false;

        System.out.println("Cars produced by year " + year + ":");

        for (Car car : arr) {
            if (car.getYearOfProduction() == year) {
                found = true;
                System.out.println(car.toString());
            }
        }
        if (!found) System.out.println("no cars of this year");
    }

    static Car[] initialization() {
        Car[] arr = new Car[4];
        arr[0] = new Car("SUV", 1964, 150);
        arr[1] = new Car("cargo", 2000, 500);
        arr[2] = new Car("CUV", 1977, 350);
        arr[3] = new Car("Pickup", 2023, 900);
        return arr;

    }

    ;
}



