package com.softserve.edu06.hw.task1;

public abstract class Bird {
    private String feathers;
    private int layEggs;

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public int setLayEggs(int layEggs) {
        return this.layEggs = layEggs;

    }

    public abstract String fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
