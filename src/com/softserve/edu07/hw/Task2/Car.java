package com.softserve.edu07.hw.Task2;

public class Car extends GroundVehicle{

    protected String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.print("The car ");
        super.drive();
    }
}
