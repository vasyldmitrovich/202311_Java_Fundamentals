package com.softserve.edu07.hw.task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }

    @Override
    void isSailing() {
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                '}';
    }
}
