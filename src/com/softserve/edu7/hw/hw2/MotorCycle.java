package com.softserve.edu7.hw.hw2;

class MotorCycle extends GroundVenicle {
    private int maxSpeed;

    public MotorCycle(int passengers, int maxSpeed) {
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
    void drive() {
        System.out.println("motorcycle rides");
    }
}
