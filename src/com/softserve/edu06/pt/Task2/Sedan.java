package com.softserve.edu06.pt.Task2;

public class Sedan extends Car{

    private final String model;
    private final int maxSpeed;
    private final int yearOfProduction;


        public Sedan(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Sedan :" +
                " model = " + model  +
                ", max speed = " + maxSpeed +
                ", year of production = " + yearOfProduction ;
    }

    @Override
    public String run() {
        return "*wroom*";
    }

    @Override
    public String stop() {
        return "*stop sounds*";
    }
}
