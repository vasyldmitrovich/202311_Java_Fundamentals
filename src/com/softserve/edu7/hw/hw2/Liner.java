package com.softserve.edu7.hw.hw2;

class Liner extends WaterVenicle {
    int floors;

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
    void isSailing() {
        System.out.println("The liner is coming");
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                "} " + super.toString();
    }
}
