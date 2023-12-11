package com.softserve.edu07.hw.task2;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[7];
        vehicles[0] = new Liner();
        ((Liner) vehicles[0]).setFloors(2);
        ((Liner) vehicles[0]).setPassengers(100);

        vehicles[1] = new Boat();
        ((Boat) vehicles[1]).setVolume(500);
        ((Boat) vehicles[1]).setPassengers(5);

        vehicles[2] = new Plane();
        ((Plane) vehicles[2]).setMaxDistance(9000);
        ((Plane) vehicles[2]).setPassengers(280);

        vehicles[3] = new Helicopter();
        ((Helicopter) vehicles[3]).setWeight(5000);
        ((Helicopter) vehicles[3]).setMaxHeight(2000);
        ((Helicopter) vehicles[3]).setPassengers(24);

        vehicles[4] = new Bus();
        ((Bus) vehicles[4]).setRoute("Long route");
        ((Bus) vehicles[4]).setPassengers(50);

        vehicles[5] = new Motorcycle();
        ((Motorcycle) vehicles[5]).setMaxSpeed(180);
        ((Motorcycle) vehicles[5]).setPassengers(50);

        vehicles[6] = new Car();
        ((Car) vehicles[6]).setModel("Lexus XR350");
        ((Car) vehicles[6]).setPassengers(5);

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
