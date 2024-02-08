package com.softserve.edu6.hw.hw1;

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    void Fly() {
        System.out.println("not fly ");
    }

    @Override
    public String toString() {
        return "NonFlyingBird{} " + super.toString();
    }
}
