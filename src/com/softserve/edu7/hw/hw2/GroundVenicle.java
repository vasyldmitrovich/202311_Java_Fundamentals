package com.softserve.edu7.hw.hw2;

abstract class GroundVenicle extends Passengers implements Vehicle {
    public GroundVenicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
