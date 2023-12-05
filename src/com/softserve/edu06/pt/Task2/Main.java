package com.softserve.edu06.pt.Task2;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Truck("Cherokee",180,2019);
        Car car2 = new Sedan("Peugeot 206",280,2002);
        Car car3 = new Sedan("Golf 3",160,1998);
        Car car4 = new Truck("RAM 1500",200,2020);
        Car car5 = new Truck("G500 BRABUS",250,2021);
        Car car6 = new Sedan("Galant",220,2005);

        Car [] cars = new Car[]{
                car1, car2, car3, car4, car5, car6};

        System.out.println("Cars info: ");

        for (Car car : cars){
            System.out.println(car.toString());
            System.out.println(car.run());//Test drive
            System.out.println("*A few moments later...*");
            System.out.println(car.stop());
        }

    }
}
