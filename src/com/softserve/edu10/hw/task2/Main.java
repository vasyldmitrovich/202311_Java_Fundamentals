package com.softserve.edu10.hw.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanov", "Artur");
        personMap.put("Mykolenko", "Mykola");
        personMap.put("Maksymovych", "Kateryna");
        personMap.put("Semehen", "Oleksiy");
        personMap.put("Shavel", "Iryna");
        personMap.put("Antonischak", "Pavlo");
        personMap.put("Dvoretska", "Khrystyna");
        personMap.put("Nertinova", "Iryna");
        personMap.put("Bidon", "Baden");
        personMap.put("Jesin", "Artur");

        System.out.println("The initial content of the card: ");
        printMap(personMap);

        boolean hasDuplicateNames = hasDuplicateNames(personMap);
        System.out.println("Whether there are persons with the same name: " + hasDuplicateNames);

        String nameToRemove = "Artur";
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(nameToRemove));

        System.out.println("Card contents after deleting a person with a name '" + nameToRemove + "':");
        printMap(personMap);
    }

    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    private static boolean hasDuplicateNames(Map<String, String> map) {
        Set<String> uniqueNames = new HashSet<>();

        for (String name : map.values()) {
            if (!uniqueNames.add(name)) {
                return true;
            }
        }

        return false;
    }
}
