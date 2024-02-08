package com.softserve.edu05.hw;

class Car {
    public String type;
    private int yearOfProduction;
    private int engineCapacity;



    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
