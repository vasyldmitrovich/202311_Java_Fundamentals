package com.softserve.edu07.hw.task2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {

    }

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' +
                '}';
    }
}
