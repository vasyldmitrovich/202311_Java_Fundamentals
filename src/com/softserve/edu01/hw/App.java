package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();
        // Task 2
        task2();
        //Task 3
        task3();
    }

    public static void task1(){
        System.out.println("Task 1");
        System.out.print("Enter radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Perimeter is " + (2 * radius * Math.PI));
        System.out.println("Area is " + (Math.PI * Math.pow(radius, 2)));
    }

    public static void task2 (){

    }

    public static void task3(){

    }


}
