package com.softserve.edu10.hw.hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hw2 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Lee", "Brus");
        personMap.put("Alex", "Brus");
        personMap.put("Alice", "Kartner");
        personMap.put("Krot", "Orest");
        personMap.put("Rot", "Misha");
        personMap.put("Got", "Vasya");
        personMap.put("Lot", "Alex");
        personMap.put("Pet", "Kat");
        personMap.put("Ket", "Bret");
        personMap.put("Dem", "Vasya");

        System.out.println(personMap);
        for (Map.Entry entry : personMap.entrySet()) {
            if (personMap.containsValue(entry.getValue())) {
                System.out.println("The set contains pairs with the same names");
                break;
            }
        }
        System.out.println("Enter a name to remove from the set:");
        String name = SCANNER.nextLine();
        for (Map.Entry entry : personMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                personMap.remove(entry.getKey());
                break;
            }
        }
        System.out.println(personMap);
    }
}

