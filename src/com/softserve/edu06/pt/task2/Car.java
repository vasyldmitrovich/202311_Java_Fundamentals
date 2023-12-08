package com.softserve.edu06.pt.task2;

public abstract class Car {
    String model;
    int maxSpeed;
    int yearOfProduction;

    static void run(){
    }

    static void stop(){
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction;
    }
}
