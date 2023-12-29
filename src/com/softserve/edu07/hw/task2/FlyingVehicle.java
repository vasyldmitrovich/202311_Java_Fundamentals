package com.softserve.edu07.hw.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    @Override
    public void doSomething() {
        this.fly();
        this.land();
    }

    void fly() {
        System.out.println("is flying, ");
    };
    void land() {
        System.out.println("is landing, ");
    };
}
