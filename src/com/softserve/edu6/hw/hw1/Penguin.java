package com.softserve.edu6.hw.hw1;

public class Penguin extends NonFlyingBird {
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{} " + super.toString();
    }

    void Fly() {
        System.out.println("Penguin not fly ");
    }
}
