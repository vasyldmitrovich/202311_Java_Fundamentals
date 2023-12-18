package com.softserve.edu07.hw.Task2;

public class Motorcycle extends GroundVehicle{

    protected int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.print("The motorcycle ");
        super.drive();
    }
}
