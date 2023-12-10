package com.softserve.edu06.pt.PracticalTask2;

public class Truck extends Car {
    public Truck(String model, int yearOfProduction, int maxSpeed) {
        super(model, yearOfProduction, maxSpeed);
    }

    @Override
    void run() {
        System.out.println("Truck " + getModel() + " starts moving");
    }

    @Override
    void stop() {
        System.out.println("Truck " + getModel() + " stops moving");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
