package com.softserve.edu10.hw.task2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Shevchenko", "Taras");
        personMap.put("Bandera", "Stepan");
        personMap.put("Petlura", "Simon");
        personMap.put("Bagreaniy", "Ivan");
        personMap.put("Vinnichenko", "Volodimir");
        personMap.put("Subtelniy", "Orest");
        personMap.put("Oles'", "Oleksandr");
        personMap.put("Zelenskiy", "Volodimir");


        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("======================================");
        findDoubleFirstname(personMap);//Good
        System.out.println("======================================");
        removeForName("Orest", personMap);

    }

    public static void findDoubleFirstname(HashMap<String, String> personMap) {
        HashSet<String> setDoubleFirstname = new HashSet<>();
        boolean founded = false;
        for (String v : personMap.values()) {
            int count = Collections.frequency(personMap.values(), v);
            if ((count > 1) & (!setDoubleFirstname.contains(v))) {
                founded = true;
                setDoubleFirstname.add(v);
            }
        }
        if (founded) {
            for (var s : setDoubleFirstname) {
                System.out.println(s + " count > 1");
            }
        }
    }

    public static void removeForName(String firstName, HashMap<String, String> personMap) {
        ArrayList<String> arr = new ArrayList<>();
        for (var v : personMap.entrySet()) {
            if (v.getValue().equals(firstName)) {
                arr.add(v.getKey());
            }
        }
        for (var a : arr) {
            personMap.remove(a);
        }
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
