package com.softserve.edu07.hw.task2;

public abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    @Override
    public void doSomething() {
        this.drive();
    }

    void drive() {
        System.out.println("is driving, ");
    };
}
