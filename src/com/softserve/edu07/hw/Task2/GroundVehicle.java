package com.softserve.edu07.hw.Task2;

public abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    @Override
    public void doSomething() {
        this.drive();
    }

    public void drive(){
        System.out.println("is driving,");
    }
}
