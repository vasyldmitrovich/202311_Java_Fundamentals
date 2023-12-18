package com.softserve.edu07.hw.Task2;

public class Helicopter extends FlyingVehicle{

    protected int weight;
    protected int maxWeight;

    public Helicopter(int passengers, int weight, int maxWeight) {
        super(passengers);
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void fly() {
        System.out.print("The helicopter ");
        super.fly();
    }

    @Override
    public void land() {
        System.out.print("The helicopter ");
        super.land();
    }
}
