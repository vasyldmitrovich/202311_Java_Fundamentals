package com.softserve.edu07.hw.task2;

public class Motorcycle extends GroundVehicle{
    int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.print("The motorcycle ");
        super.drive();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
