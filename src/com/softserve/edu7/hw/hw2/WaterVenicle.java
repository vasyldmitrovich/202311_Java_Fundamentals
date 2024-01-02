package com.softserve.edu7.hw.hw2;

abstract class WaterVenicle extends Passengers implements Vehicle {
    public WaterVenicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
