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
        System.out.println("Task 2");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live?");
        String address = scanner.nextLine();
        System.out.println("Your name is " + name + ". You live in " + address + ".");
    }

    public static void task3(){
        System.out.println("Task 3");
        System.out.print("Enter first call cost: ");
        double c1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter first call duration (min): ");
        int t1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter first call cost: ");
        double c2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter first call duration (min): ");
        int t2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter first call cost: ");
        double c3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter first call duration (min): ");
        int t3 = Integer.parseInt(scanner.nextLine());
        double firstCallCost = c1 * t1;
        double secondCallCost = c2 * t2;
        double thirdCallCost = c3 * t3;
        double totalCost = firstCallCost + secondCallCost + thirdCallCost;
        System.out.println("First call cost: " + firstCallCost);
        System.out.println("Second call cost: " + secondCallCost);
        System.out.println("Third call cost: " + thirdCallCost);
        System.out.println("Total cost: " + totalCost);
    }


}
