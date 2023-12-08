package com.softserve.edu06.hw.task1;

public class Kiwi extends NonFlyingBird {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "name='" + name + '\'' +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
