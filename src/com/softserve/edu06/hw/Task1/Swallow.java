package com.softserve.edu06.hw.Task1;

public class Swallow extends FlyingBird{
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return super.fly();
    }

    @Override
    public String toString() {
        return super.toString() + "Swallow.";
    }
}
