package com.softserve.edu03.hw;

import com.softserve.edu03.hw.HomeTask3.HomeTask3;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Task 1");
        HomeTask1.run();

        System.out.println("\nTask2");
        HomeTask2.run();

        System.out.println("\nTask3");
        HomeTask3.run();
    }
}
