package com.softserve.edu07.hw.Task2;

public class Bus extends GroundVehicle{

    protected String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.print("The bus ");
        super.drive();
    }
}
