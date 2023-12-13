package com.softserve.edu07.hw;

public class Homework2 {
}

abstract class Passengers {
    private int passengers;

    public Passengers() {}

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

interface Vehicle {}

abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle() {
    }
    abstract void isSailing();
}
abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }
    abstract void fly();
    abstract void land();
}
abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle() {
    }
    abstract void drive();
}
class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {

    }
}
class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
    }

    @Override
    void isSailing() {}

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxWeight;

    @Override
    void fly() {

    }

    @Override
    void land() {

    }
}
class Bus extends GroundVehicle {
    private String route;

    public Bus() {
    }

    @Override
    void drive() {

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {
    }

    @Override
    void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
class Car extends GroundVehicle {
    private String model;

    public Car() {
    }

    @Override
    void drive() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}