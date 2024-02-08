package com.softserve.edu7.hw.hw2;

class Car extends GroundVenicle {
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
        System.out.println("car rides");
    }
}
