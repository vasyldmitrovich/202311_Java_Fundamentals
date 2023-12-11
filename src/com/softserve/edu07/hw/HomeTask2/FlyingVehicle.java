package com.softserve.edu07.hw.HomeTask2;

abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    abstract void fly();

    abstract void land();
}
