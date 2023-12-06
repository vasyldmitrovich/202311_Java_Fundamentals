package com.softserve.edu06.hw.Task1;

public class NonFlyingBird extends Bird {


    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "I have paws, i can't fly(";
    }

    @Override
    public String toString() {
        return super.toString() + "\nType : Non flying bird, ";
    }
}
