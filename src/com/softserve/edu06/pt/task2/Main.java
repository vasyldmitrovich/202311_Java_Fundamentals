package com.softserve.edu06.pt.task2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Truck("Scania", 130, 2020, 1000);
        cars[1] = new Sedan("Mazda", 220, 2022, "fabric");
        cars[2] = new Truck("Volvo", 110, 2014, 1200);
        cars[3] = new Sedan("Skoda", 260, 2023, "leather");
        cars[4] = new Sedan("Mercedes", 160, 2001, "leather");

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}

abstract class Car {
    String model;
    int maxSpeed;
    int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();
    public abstract void stop();
}

class Truck extends Car {
    int cargoCapacity;

    public Truck(String model, int maxSpeed, int yearOfProduction, int cargoCapacity) {
        super(model, maxSpeed, yearOfProduction);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void run() {
        System.out.println("Truck is running.");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }

    @Override
    public String toString() {
        return "Truck, " +
                "model " + model + ", " +
                "max speed " + maxSpeed + ", " +
                "year of production " + yearOfProduction + ", " +
                "cargo capacity " + cargoCapacity
                ;
    }
}

class Sedan extends Car {
    String interior;

    public Sedan(String model, int maxSpeed, int yearOfProduction, String interior) {
        super(model, maxSpeed, yearOfProduction);
        this.interior = interior;
    }

    @Override
    public void run() {
        System.out.println("Sedan is running.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan has stopped.");
    }

    @Override
    public String toString() {
        return "Sedan, " +
                "model " + model + ", " +
                "max speed " + maxSpeed + ", " +
                "year of production " + yearOfProduction + ", " +
                "type interior " + interior
                ;
    }
}