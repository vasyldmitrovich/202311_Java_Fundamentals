package com.softserve.edu06.hw.Task1;

public abstract class Bird {

    boolean feathers;
    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract String fly();

    @Override
    public String toString() {
        return "Bird : " +
                "feathers = " + feathers +
                ", lay eggs = " + layEggs +
                ".";
    }
}
