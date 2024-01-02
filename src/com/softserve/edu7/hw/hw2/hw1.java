package com.softserve.edu7.hw.hw2;

public class hw1 {

    public static void main(String[] args) {

        Liner liner = new Liner(3, 5000);
        System.out.println(liner.toString());
        liner.isSailing();
        separator();

        Boats boat = new Boats(5, 1500);
        System.out.println(boat.toString());
        boat.isSailing();
        separator();

        Plane plane = new Plane(2, 1500);
        System.out.println(plane.toString());
        plane.fly();
        plane.land();
        separator();

        Helicopter helicopter = new Helicopter(2, 5000, 3000);
        System.out.println(helicopter.toString());
        helicopter.fly();
        helicopter.land();
        separator();

        Bus bus = new Bus(40, "Lviv - Kharkiv");
        System.out.println(bus.toString());
        bus.drive();
        separator();

        MotorCycle motorCycle = new MotorCycle(2, 300);
        System.out.println(motorCycle.toString());
        motorCycle.drive();
        separator();

        Car car = new Car(4, "ZAZ");
        System.out.println(car.toString());
        car.drive();
        separator();


    }

    static void separator() {
        System.out.println("________");
    }

    ;

}
