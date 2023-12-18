package com.softserve.edu07.hw.Task2;

public class Plane extends FlyingVehicle{

    protected int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.print("The plane ");
        super.fly();
    }

    @Override
    public void land() {
        System.out.print("The plane ");
        super.land();
    }

}
