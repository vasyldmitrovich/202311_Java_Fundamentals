package com.softserve.edu7.hw.hw2;

class Helicopter extends FlyingVenicle {
    private int weight;
    private int maxHeight;

    @Override
    void land() {
        System.out.println("above the ground");
    }

    @Override
    void fly() {
        System.out.println("helicopter flies");
    }

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }
}
