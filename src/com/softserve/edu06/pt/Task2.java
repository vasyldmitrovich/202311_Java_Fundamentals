package com.softserve.edu06.pt;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // In the code below I play with the Random function to create trucks and sedans

        // "database" to be used by Random for creating objects
        String[] truckModel = {"MAN", "Renault", "DAF", "Tatra", "Volvo", "Mercedes", "Iveco", "Scania"};
        String[] sedanModel = {"Camry", "Passat", "Polo", "MazdaC3", "MazdaC6", "Megan", "Accent", "Sonata", "RIO"};
        int[] maxSpeedT = {110, 120, 130};
        int[] maxSpeedS = {200, 210, 220, 230, 240};

        // create five objects of each of Trucks and Sedans
        Truck[] trucks = new Truck[5];
        Sedan[] sedans = new Sedan[5];

        Random r = new Random();

        for (int i = 0; i < trucks.length; i++) {
            int model = r.nextInt(0, truckModel.length - 1 );
            String modelT = truckModel[model];
            int speed = r.nextInt(0, maxSpeedT.length - 1 );
            int speedT = maxSpeedT[speed];
            int year = r.nextInt(2000, 2023);
            trucks[i] = new Truck( modelT, speedT, year );
        }

        for (int i = 0; i < sedans.length; i++) {
            int model = r.nextInt(0, sedanModel.length - 1 );
            String modelS = sedanModel[model];
            int speed = r.nextInt(0, maxSpeedS.length - 1 );
            int speedS = maxSpeedS[speed];
            int year = r.nextInt(2000, 2023);
            sedans[i] = new Sedan( modelS, speedS, year );
        }

        for(Truck t : trucks ) {
            System.out.println(t);
        }

        System.out.println();

        for(Sedan s : sedans ) {
            System.out.println(s);
        }
    }
}
abstract class Car{//All ok but do not make inner classes. Each class should be in own file
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();
    public abstract void stop();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
