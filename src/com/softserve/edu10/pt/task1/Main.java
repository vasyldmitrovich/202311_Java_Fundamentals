package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Artur Ivanov");
        employeeMap.put(2, "Maksym Brynza");
        employeeMap.put(3, "Olga Harlamova");
        employeeMap.put(4, "Svitlana Nikitiuk");
        employeeMap.put(5, "Mykola Lysenko");
        employeeMap.put(6, "Olena Sarahman");
        employeeMap.put(7, "Andriy Nakonechnyi");

        System.out.println("Map contents:");
        for (Integer id : employeeMap.keySet()) {
            System.out.println("ID: " + id + ", fullname: " + employeeMap.get(id));
        }

        System.out.println("Enter the ID:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        if (employeeMap.containsKey(id)) {
            System.out.println("Fullname of the employee with ID " + id + ": " + employeeMap.get(id));
        } else {
            System.out.println("Employee with such ID not found");
        }

        System.out.println("Enter the fullname of the employee:");
        String name = scanner.next();

        if (employeeMap.containsValue(name)) {
            System.out.println("ID of the employee with fullname " + name + ": " +
                    employeeMap.entrySet().stream().filter(entry ->
                            entry.getValue().equals(name)).findFirst().get().getKey());
        } else {
            System.out.println("Employee with such fullname not found");
        }
    }
}

