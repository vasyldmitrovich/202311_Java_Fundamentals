package com.softserve.edu07.hw.task2;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Bus(10, "Ukraine"),
                new Car(3, "BMWx6"),
                new Motorcycle(1, 340),
                new Boat(8, 50),
                new Liner(1000, 12),
                new Helicopter(12, 12000, 6000),
                new Plane(350, 40000)
        };

        for (var vehicle : vehicles) {
            vehicle.doSomething();
        }
    }
}
