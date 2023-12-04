package com.softserve.edu05.hw;
import java.util.Scanner;

public class Homework3 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        Car[] cars = {
                new Car( "VW", 2003, 1800),
                new Car( "Renault", 2001, 1900),
                new Car( "Honda", 2002, 2000),
                new Car( "Toyota", 2004, 2100),
        };

        findModelByYear(cars);

        System.out.println();

        sortByYearOfProduction(cars);
    }

    // Output result for cars: certain model year  (enter year in the console);
    static void findModelByYear( Car[] cars ) {
        System.out.print("User, pls enter the year of the car's manufacture: ");
        int year = SCANNER.nextInt();
        SCANNER.nextLine();

        boolean find = false;
        for( Car car: cars ) {
            if( car.getYear() == year ) {
                System.out.println(car.getMake() + " was manufactured in " + car.getYear() + ".");
                find = true;
            }
        }
        if( !find ) {
            System.out.println("There are no cars that were manufactured in " + year + ".");
        }
    }

    // Output result for cars sorted cars by the field “year of production ”
    static void sortByYearOfProduction( Car[] cars ) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if( cars[j].getYear() > cars[j+1].getYear() ) {
                    Car temp = cars[j];
                    cars[j] = cars[j+1];
                    cars[j+1] = temp;
                }
            }
        }

        for( Car car: cars ) {
            System.out.println(car);
        }
    }
}

class Car {
    private String make;
    private int year;
    private int engine;

    public Car(String make, int year, int engine) {
        this.make = make;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}
