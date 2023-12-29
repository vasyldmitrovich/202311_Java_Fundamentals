package com.softserve.edu07.hw.task2;

public class Car extends GroundVehicle{
    String model;

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
    void drive() {
        System.out.print("The car ");
        super.drive();
    }
}
