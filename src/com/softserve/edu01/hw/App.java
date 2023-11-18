package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int choice;

        //Some user friendly interface

        System.out.println("Homework tasks menu");
        System.out.println("0- Exit");
        System.out.println("1- First task");
        System.out.println("2- Second task");
        System.out.println("3- Third task");

        System.out.println("Your choice : ");
        choice = Integer.parseInt(scanner.nextLine());



        //This part switches a task user want to try
        switch (choice) {
            case 1 -> task1();
            case 2 -> task2();
            case 3 -> task3();
            default -> System.out.println("Unknown number!");

        }


    }

    public static void task1 () {


        // This function calculates flower bed's perimeter and area
        System.out.println("Enter flower bed's radius: ");
        double radius = Double.parseDouble(scanner.nextLine());

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius*radius);

        System.out.printf("Flower bed's perimeter = %.2f\n", perimeter);
        System.out.printf("Flower bed's area = %.2f\n", area);


    }

    public static void task2 () {

        // This function collects info about user and outputs it
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.printf("Where do you live, %s ?\n ", name);
        String address = scanner.nextLine();

        System.out.printf("%s is living at %s \n", name,address);

    }

    public static void task3 () {

        // This function collects info about user and outputs it

        double [] prices = new double[3];
        double [] durations = new double[3];
        double totalPrice = 0;


        for (int i = 0; i < 3; i++) {

            System.out.println("Enter price per call from "+ (i+1) +" country: ");
            prices[i] = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter call duration from "+ (i+1) +" country: ");
            durations[i] = Double.parseDouble(scanner.nextLine());
        }


        for (int i = 0; i < 3; i++) {

            System.out.printf("Total call price from "+ (i+1) +" country:\n %.2f \n",(durations[i] * prices[i]));

            totalPrice += durations[i] * prices[i];
        }

        System.out.printf("Total price = %.2f",totalPrice);


    }


}
