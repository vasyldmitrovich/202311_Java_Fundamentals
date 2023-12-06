package com.softserve.edu06.hw.Task1;

public class FlyingBird extends Bird{


    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "I believe, I can fly...";
    }

    @Override
    public String toString() {
        return super.toString() + "\nType : Flying bird, ";
    }
}
