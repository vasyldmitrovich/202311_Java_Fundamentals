package com.softserve.edu07.hw.task2;

public class Plane extends FlyingVehicle{
    int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.print("The plane ");
        super.fly();
    }

    @Override
    void land() {
        System.out.print("The plane");
        super.land();
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
