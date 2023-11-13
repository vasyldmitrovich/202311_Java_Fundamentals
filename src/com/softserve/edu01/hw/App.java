package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();

        // Task 2...
    }

    public static void task1 () {
        System.out.println("Input your name");
        String name = scanner.nextLine();

        System.out.println("Your name is: " + name);
    }
}
