package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> idName = new HashMap<>();
        idName.put(1, "Artur");
        idName.put(2, "Maksym");
        idName.put(3, "Anna");
        idName.put(4, "Olga");
        idName.put(5, "Kateryna");
        idName.put(6, "Anton");
        idName.put(7, "Artur");

        System.out.println(idName);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int inputId = scanner.nextInt();
        System.out.println(idName.getOrDefault(inputId, "ID not found"));

        System.out.print("Enter the name: ");
        String inputName = scanner.next();
        if (idName.containsValue(inputName)) {
            for (var entry : idName.entrySet()) {
                if (entry.getValue().equals(inputName)) {
                    System.out.println(inputName + ", id = " + entry.getKey());
                }
            }
        } else {
            System.out.println("Name not found");
        }
    }
}
