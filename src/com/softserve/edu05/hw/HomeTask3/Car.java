package com.softserve.edu05.hw.HomeTask3;

public class Car {
    private CarType type;
    private int year_of_production;
    private double engine_capacity;

    public Car(CarType type, int year_of_production, double engine_capacity) {
        this.type = type;
        this.year_of_production = year_of_production;
        this.engine_capacity = engine_capacity;
    }

    public CarType getType() {
        return type;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", year_of_production=" + year_of_production +
                ", engine_capacity=" + engine_capacity +
                "}";
    }
}
