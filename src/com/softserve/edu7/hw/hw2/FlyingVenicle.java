package com.softserve.edu7.hw.hw2;

abstract class FlyingVenicle extends Passengers implements Vehicle {
    public FlyingVenicle(int passengers) {
        super(passengers);
    }

    abstract void land();

    abstract void fly();
}
