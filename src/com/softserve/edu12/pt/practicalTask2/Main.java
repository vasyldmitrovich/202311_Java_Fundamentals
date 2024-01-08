package com.softserve.edu12.pt.practicalTask2;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter plant type: ");
        String type = SCANNER.nextLine();
        System.out.print("Enter plant color: ");
        String color = SCANNER.nextLine();
        System.out.print("Enter plant size: ");
        int size = Integer.parseInt(SCANNER.nextLine());
        var plant = new Plant(size,color,type);
        System.out.println("Your plant is " + plant);

    }
}
