package com.softserve.edu12.pt.pt2;

import java.util.Scanner;

public class pt1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the plant type:");
        String type = SCANNER.nextLine();

        System.out.println("Enter the plant color:");
        String color = SCANNER.nextLine();

        System.out.println("Enter the plant size:");
        int size = SCANNER.nextInt();

        var plant = new Plant(size,color,type);

        System.out.println(plant);

    }
}

