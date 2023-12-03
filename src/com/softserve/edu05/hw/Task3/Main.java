package com.softserve.edu05.hw.Task3;

public class Main {
    public static void main(String[] args) {

            /* Create an array of ten random integers using a random number generator. Output:
    • the biggest number in the array;
    • the sum of positive numbers;
    • count the number of negative numbers.
    • determine whether there are more negative or positive values in the array. If there are
    more negative values, output "There are more negative values in the array.
    " Otherwise,
    output "There are more positive values in the array.
    " If the counts are equal, output
    "There are an equal number of positive and negative values in the array.*/

        Car car1 = new Car("Truck",2019,3500);
        Car car2 = new Car("Offroad",2019,3000);
        Car car3 = new Car("SUV",2022,2000);
        Car car4 = new Car("Truck",1980,4500);

        Car[] cars = new Car[]{car1, car2, car3, car4};

        Car.showModelYear(cars);
        Car.sortByYearOfProduction(cars);

    }
}
