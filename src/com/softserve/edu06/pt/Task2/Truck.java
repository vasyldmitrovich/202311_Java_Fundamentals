package com.softserve.edu06.pt.Task2;

 class Truck extends Car{

     private final String model;
     private final int maxSpeed;
     private final int yearOfProduction;


     public Truck(String model, int maxSpeed, int yearOfProduction) {
         this.model = model;
         this.maxSpeed = maxSpeed;
         this.yearOfProduction = yearOfProduction;
     }

     @Override
     public String toString() {
         return "Truck :" +
                 " model = " + model +
                 ", max speed = " + maxSpeed +
                 ", year of production = " + yearOfProduction ;
     }

     @Override
         public String run() {
             return "*WROOOM-WROOOM*";
         }

         @Override
         public String stop() {
             return "*SOME SERIOUSLY LOUD STOP SOUNDS*";
         }

 }
