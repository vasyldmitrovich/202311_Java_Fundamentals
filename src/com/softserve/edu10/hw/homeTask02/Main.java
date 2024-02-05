package com.softserve.edu10.hw.homeTask02;

import java.util.*;

public class Main {
    static Map<String, String> personMap = new HashMap<>();
    public static void main(String[] args) {

        personMap.put("Verstappen", "Max");
        personMap.put("Hamilton", "Lewis");
        personMap.put("Perez", "Sergio");
        personMap.put("Tsunoda", "Yuki");
        personMap.put("Leclerc", "Charles");
        personMap.put("Piastri", "Lewis");
        personMap.put("Norris", "Lando");
        personMap.put("Alonso", "Fernando");
        personMap.put("Ocon", "Orest");
        personMap.put("Russell", "George");

        displayMap(personMap);
        System.out.println("=".repeat(50));
        deleteWithName("Orest");
        displayMap(personMap);
        System.out.println("=".repeat(50));
        System.out.println("Are there at least two persons with the same first name among these ten people? Answer: " + isEqualNames());

    }

    private static boolean isEqualNames() {
        Set<String> names = new HashSet<>(personMap.values());
        if(names.size() < personMap.size()){
            return true;
        } else {
            return false;
        }
    }

    private static void deleteWithName(String name) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()){
            if(iterator.next().getValue().equals(name)){
                iterator.remove();
            }
        }
    }

    private static void displayMap(Map<String, String> personMap) {
        for(var el : personMap.keySet()){
            System.out.println(el + " " + personMap.get(el));
        }
    }
}
