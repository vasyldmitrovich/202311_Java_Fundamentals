package com.softserve.edu6.hw.hw1;

abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    abstract void Fly();

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
