package com.softserve.edu6.pt;

public abstract class Car {
    private int maxSpeed;
    private int yearOfProduction;


    public Car(int maxSpeed, int yearOfProduction) {
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;

    }


    public abstract void run();

    public abstract void stop();


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }



    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
