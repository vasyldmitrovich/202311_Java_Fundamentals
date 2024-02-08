package com.softserve.edu6.pt;

class Truck extends Car {
    private int loadCapacity;

    public Truck(int maxSpeed, int yearOfProduction, int loadCapacity) {
        super(maxSpeed, yearOfProduction);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void run() {
        System.out.println("truck run");
    }

    @Override
    public void stop() {
        System.out.println("truck stop");

    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                "} " + super.toString();
    }
}
