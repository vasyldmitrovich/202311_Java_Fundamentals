package com.softserve.edu06.pt.PracticalTask2;

public class Sedan extends Car {
    public Sedan(String model, int yearOfProduction, int maxSpeed) {
        super(model, yearOfProduction, maxSpeed);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " starts moving");
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " stops moving");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
