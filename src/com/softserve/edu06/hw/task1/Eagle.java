package com.softserve.edu06.hw.task1;

public class Eagle extends FlyingBird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Eagle() {
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", feathers='" + this.getFeathers() + '\'' +
                ", layEggs=" + this.getLayEggs() +
                '}';
    }
}
