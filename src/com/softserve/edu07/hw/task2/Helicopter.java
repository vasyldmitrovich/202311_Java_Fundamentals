package com.softserve.edu07.hw.task2;

public class Helicopter extends FlyingVehicle{
    int weight;
    int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        System.out.print("The helicopter ");
        super.fly();
    }

    @Override
    void land() {
        System.out.print("The helicopter ");
        super.land();
    }
}
