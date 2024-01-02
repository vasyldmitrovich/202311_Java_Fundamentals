package com.softserve.edu12.pt.Task2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter plant info");
        System.out.println("Enter size :");
        int size = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Enter colour :");
        String colour = SCANNER.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("Enter type :");
        String type = SCANNER.nextLine().toUpperCase(Locale.ROOT);

        Plant plant1 = new Plant(size,colour,type);

        System.out.println(plant1);

    }
}
