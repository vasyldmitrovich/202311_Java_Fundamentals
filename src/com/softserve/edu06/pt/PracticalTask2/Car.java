package com.softserve.edu06.pt.PracticalTask2;

abstract class Car {
    private String model;
    private int yearOfProduction;
    private int maxSpeed;

    abstract void run();

    abstract void stop();

    public Car(String model, int yearOfProduction, int maxSpeed) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
