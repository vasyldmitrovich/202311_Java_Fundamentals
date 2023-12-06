package com.softserve.edu06.hw.Task1;

public class Penguin extends NonFlyingBird{

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return super.fly();
    }

    @Override
    public String toString() {
        return super.toString() + "Penguin.";
    }
}
