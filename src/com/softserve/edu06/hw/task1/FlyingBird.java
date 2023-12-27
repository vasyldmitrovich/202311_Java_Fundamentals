package com.softserve.edu06.hw.task1;

class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    void fly() {
        System.out.println(getClass().getSimpleName() + " can fly.");
    }
}
