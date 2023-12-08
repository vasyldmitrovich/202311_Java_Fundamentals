package com.softserve.edu06.pt.task2;

public class App {
    public static void main(String[] args) {

        Car[] cars = new Car[5];

        Truck truck1 = new Truck();
        truck1.setMaxSpeed(250);
        truck1.setModel("Toyota");
        truck1.setYearOfProduction(2011);

        Truck truck2 = new Truck();
        truck2.setMaxSpeed(280);
        truck2.setModel("Toyota");
        truck2.setYearOfProduction(2021);

        Truck truck3 = new Truck();
        truck3.setMaxSpeed(300);
        truck3.setModel("Toyota");
        truck3.setYearOfProduction(2017);

        Sedan sedan1 = new Sedan();
        sedan1.setMaxSpeed(180);
        sedan1.setModel("Toyota");
        sedan1.setYearOfProduction(2018);

        Sedan sedan2 = new Sedan();
        sedan2.setMaxSpeed(180);
        sedan2.setModel("BMW");
        sedan2.setYearOfProduction(2018);

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
