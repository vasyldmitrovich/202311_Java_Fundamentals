package com.softserve.edu07.hw.Task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    @Override
    public void doSomething() {
        this.fly();
        this.land();
    }

    public void fly(){
        System.out.println("is flying,");
    }
    public void land(){
        System.out.println("is landing,");
    }
}
