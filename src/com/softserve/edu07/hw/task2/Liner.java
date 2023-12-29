package com.softserve.edu07.hw.task2;

public class Liner extends WaterVehicle{
    int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.print("The liner ");
        super.isSailing();
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
