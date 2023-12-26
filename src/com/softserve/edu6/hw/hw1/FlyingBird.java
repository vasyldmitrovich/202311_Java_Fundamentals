package com.softserve.edu6.hw.hw1;

class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    void Fly() {
        System.out.println("Fly");
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "} " + super.toString();
    }
}
