package com.softserve.edu06.hw.task1;

class NonFlyingBird extends Bird{

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    void fly() {
        System.out.println(getClass().getSimpleName() + " cannot fly.");
    }
}
