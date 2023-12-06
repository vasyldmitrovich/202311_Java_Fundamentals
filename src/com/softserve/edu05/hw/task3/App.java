package com.softserve.edu05.hw.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Car("Toyota", 2017, 3000);
        cars[1] = new Car("Lexus", 2017, 3500);
        cars[2] = new Car("Hundai", 2011, 1600);
        cars[3] = new Car("AUDI", 2011, 2000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of production: ");
        int num = Integer.parseInt(scanner.nextLine());
        int count = getCarOfYear(num, cars);
        sortCarByYear(cars);

    }

    static int getCarOfYear(int num, Car[] cars) {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                //nothing to do
            } else if (cars[i].getYearOfProduction() == num) {
                count++;
                System.out.println(cars[i].getType());
            }
        }
        return count;
    }

    static void sortCarByYear(Car[] cars) {
        Arrays.sort(cars, Comparator.comparing(Car::getYearOfProduction));
        System.out.println(Arrays.toString(cars));
    }

}
