package com.softserve.edu6.hw.hw1;

class Eagle extends FlyingBird {
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "} " + super.toString();
    }

    void Fly() {
        System.out.println("Eagle fly ");
    }


}
