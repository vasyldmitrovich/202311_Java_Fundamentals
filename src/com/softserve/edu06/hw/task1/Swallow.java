package com.softserve.edu06.hw.task1;

public class Swallow extends FlyingBird {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "name='" + name + '\'' +
                ", feathers='" + this.getFeathers() + '\'' +
                ", layEggs=" + this.getLayEggs() +
                '}';
    }
}
