package com.softserve.edu07.hw.Task2;

public class App {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[]{
          new Bus(12,"Padova"),
          new Car(3,"Model S"),
          new Motorcycle(2,200),
          new Boat(300,500),
          new Liner(3000,10),
          new Helicopter(6,1000,1500),
          new Plane(200,35000)
        };

        for (Vehicle vehicle : vehicles){
            vehicle.doSomething();
        }
    }


}
