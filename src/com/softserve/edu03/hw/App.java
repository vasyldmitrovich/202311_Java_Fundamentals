package com.softserve.edu03.hw;
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();

        // Task 2...
        App.task2();
    }

    public static void task1 () {
        System.out.println("Input your name");
        String name = scanner.nextLine();

        System.out.println("Your name is: " + name);
    }

    public static void task2 () {
        System.out.println("Enter the radius of the circle: ");
        int rad = scanner.nextInt();
        double p = 3.14;
        System.out.println("Area of the circle: " + (rad*rad*p));
        System.out.println("Perimeter of the cicle: " + (rad*2*p));
    }
}
