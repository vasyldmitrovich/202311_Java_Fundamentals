package com.softserve.edu06.hw.HomeTask1;

abstract class AFlyingBird extends ABird {
    @Override
    public void fly() {
        System.out.print("This is " + getClass().getSimpleName() + ". ");
        System.out.println("This bird can fly =)");
    }
}
