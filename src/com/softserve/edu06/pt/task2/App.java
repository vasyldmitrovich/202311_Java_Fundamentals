package com.softserve.edu06.pt.task2;

public class App {
    public static void main(String[] args) {

        Car[] cars = new Car[5];

        Truck truck1 = new Truck();
        truck1.maxSpeed = 250;
        truck1.model = "Toyota";
        truck1.yearOfProduction = 2011;

        Truck truck2 = new Truck();
        truck2.maxSpeed = 280;
        truck2.model = "Toyota";
        truck2.yearOfProduction = 2021;

        Truck truck3 = new Truck();
        truck3.maxSpeed = 300;
        truck3.model = "Toyota";
        truck3.yearOfProduction = 2017;

        Sedan sedan1 = new Sedan();
        sedan1.maxSpeed = 180;
        sedan1.model = "Toyota";
        sedan1.yearOfProduction = 2018;

        Sedan sedan2 = new Sedan();
        sedan2.maxSpeed = 180;
        sedan2.model = "BMW";
        sedan2.yearOfProduction = 2018;

        cars[0] = truck1;
        cars[1] = truck2;
        cars[2] = truck3;
        cars[3] = sedan1;
        cars[4] = sedan2;

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
