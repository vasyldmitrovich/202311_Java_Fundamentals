package com.softserve.edu10.pt.practicalTask1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> eployeeMap = new HashMap<>();
        eployeeMap.put(1, "Alice");
        eployeeMap.put(2, "Alex");
        eployeeMap.put(3, "Bob");
        eployeeMap.put(4, "Jack");
        eployeeMap.put(5, "John");
        eployeeMap.put(6, "Alice");
        eployeeMap.put(7, "Bob");

        System.out.println(eployeeMap);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id to search: ");
        int id = scanner.nextInt();
        if (eployeeMap.containsKey(id)) {
            System.out.println("Employee with id " + id + " is " + eployeeMap.get(id));
        } else {
            System.out.println("There is no employee with id " + id);
        }
        System.out.print("Enter the name to search: ");
        String nameToSearch = scanner.next();
        boolean isFound = false;
            for(var entry : eployeeMap.entrySet()) {
                if (entry.getValue().equals(nameToSearch)) {
                    System.out.println("Employee with name " + nameToSearch + " is registered by id = " + entry.getKey());
                    isFound = true;
                }
            }
        if(!isFound){
            System.out.println("There is no employee with name " + nameToSearch);
        }

    }
}
