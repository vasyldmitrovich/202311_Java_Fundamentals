package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();
        var scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int inputInt = scanner.nextInt();
        System.out.println("Perimeter = " + (2 * 3.14 * inputInt));
        System.out.print("Circle = " + Math.pow((3.14 * inputInt), 2));

        // Task 2
        var scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String intName = scanner.nextLine();
        System.out.println("Hi, " + intName + "!");
        System.out.print("Where do you live? ");
        String intCity = scanner.nextLine();
        System.out.print(intCity + " is a beautiful city!");

        // Task 3
        var scanner = new Scanner(System.in);
        System.out.print("Enter the cost per minute 1: ");
        int inputCost1 = scanner.nextInt();
        System.out.print("Enter the cost per minute 2: ");
        int inputCost2 = scanner.nextInt();
        System.out.print("Enter the cost per minute 3: ");
        int inputCost3 = scanner.nextInt();
        System.out.print("Enter the call duration 1: ");
        int inputDuration1 = scanner.nextInt();
        System.out.print("Enter the call duration 2: ");
        int inputDuration2 = scanner.nextInt();
        System.out.print("Enter the call duration 3: ");
        int inputDuration3 = scanner.nextInt();
        System.out.println("Price for the first call = " + (inputCost1 * inputDuration1));
        System.out.println("Price for the second call = " + (inputCost2 * inputDuration2));
        System.out.print("Price for the third call = " + (inputCost3 * inputDuration3));
    }

    public static void task1 () {
        System.out.println("Input your name");
        String name = scanner.nextLine();

        System.out.println("Your name is: " + name);
    }
}
