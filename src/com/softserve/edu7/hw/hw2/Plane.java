package com.softserve.edu7.hw.hw2;

class Plane extends FlyingVenicle {
    private int maxDistance;

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
    void land() {
        System.out.println("above the ground");
    }

    @Override
    void fly() {
        System.out.println("glider plans");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                "} " + super.toString();
    }
}
