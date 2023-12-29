package com.softserve.edu07.hw.task2;

public abstract class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    @Override
    public void doSomething() {
        this.isSailing();
    }

    public void isSailing() {
        System.out.println("is sailing, ");
    };
}
