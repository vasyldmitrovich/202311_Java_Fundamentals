package com.softserve.edu6.hw.hw1;

public class Swallow extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow{} " + super.toString();
    }

    void Fly() {
        System.out.println("Swallow fly ");
    }
}
