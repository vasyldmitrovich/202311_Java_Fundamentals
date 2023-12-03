package com.softserve.edu05.hw.Task3;

import java.util.Scanner;

public class Car {

    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    public static Scanner scanner = new Scanner(System.in);

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }


    @Override
    public String toString() {
        return "Car: " +
                "type = " + type +
                ", year of production = " + yearOfProduction +
                ", engine capacity = " + engineCapacity;
    }

    public static void showModelYear (Car[] cars){
        System.out.println("Enter the model year ");
        int input = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        for (Car car : cars) {
            if (car.getYearOfProduction() == input) {
                flag = true;
                break;
            }
        }

        if(flag){
        for (Car car : cars) {
            if(car.getYearOfProduction() == input){
                System.out.println(car.toString());
            }
        }
        }else{
            System.out.printf("Cars from %s not found\n",input);
        }
    }

    public static void sortByYearOfProduction (Car[] cars){

        System.out.println("Cars sorted by year of production: ");
        //Bubble sort
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    // Swap arr[j] and arr[j+1]
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
        //output
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }


}
