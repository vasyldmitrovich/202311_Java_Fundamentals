package com.softserve.edu07.hw.Task2;

public class Liner extends WaterVehicle{
    protected int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.print("The liner ");
        super.isSailing();
    }
}
