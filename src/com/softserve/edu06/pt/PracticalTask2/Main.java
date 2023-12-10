package com.softserve.edu06.pt.PracticalTask2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("BMW X6", 2020, 200),
                new Truck("MAN", 2015, 110),
        };
        for (var car : cars) {
            car.run();
        }
        for (var car : cars) {
            car.stop();
        }
        for (var car : cars) {
            System.out.println(car);
        }

    }


}
