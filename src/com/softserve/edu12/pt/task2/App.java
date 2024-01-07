package com.softserve.edu12.pt.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Plant> plants = new ArrayList<>();
        while (plants.size() < 5) {
            System.out.println("Enter plant's size, type and color with comma:");
            String params = scanner.nextLine();
            String[] arrOfParams = params.split(",");
            int size = Integer.parseInt(arrOfParams[0].replace(" ", ""));
            String type = arrOfParams[1].replace(" ", "");
            String color = arrOfParams[2].replace(" ", "");
            try {
                plants.add(new Plant(size, type, color));
            } catch (ColorException | TypeException | SizeException e) {
                System.err.println(e.getMessage());
            }
        }
        for (var p : plants) {
            System.out.println(p);
        }

    }
}
