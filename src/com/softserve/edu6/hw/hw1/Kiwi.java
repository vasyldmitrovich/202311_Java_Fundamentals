package com.softserve.edu6.hw.hw1;

public class Kiwi extends NonFlyingBird {
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Kiwi{} " + super.toString();
    }

    void Fly() {
        System.out.println("Kiwi not fly ");
    }
}
