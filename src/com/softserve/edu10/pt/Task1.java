package com.softserve.edu10.pt;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Alice");
        employeeMap.put(2, "Bod");
        employeeMap.put(3, "Pedro");
        employeeMap.put(4, "Pablo");
        employeeMap.put(5, "Juan");
        employeeMap.put(6, "Iker");
        employeeMap.put(7, "Mike");
        employeeMap.put(8, "John");

        System.out.println(employeeMap);

        Scanner sc = new Scanner( System.in );
        System.out.print("User, enter the ID you want to search for: ");
        int id = sc.nextInt();

        if( employeeMap.containsKey(id) ) {
            System.out.println("Employee with ID " + id +
                    " is " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with ID " + id + ".");
        }

        System.out.print("User, enter the name of the employee you want to search for: ");
        String name = sc.next();
        sc.nextLine();
        if( employeeMap.containsValue(name) ) {
            for( var entry : employeeMap.entrySet() ) {
                if( entry.getValue().equals(name) ) {
                    System.out.println("Employee with the name " + name +
                            " has id " + entry.getKey());
                }
            }
        } else {
            System.out.println("There is not employee with name " + name + ".");
        }

        List<Map.Entry<Integer, String>> employeeList = new ArrayList<>();
        for( var entry : employeeMap.entrySet() ) {
            employeeList.add(entry);
        }
        employeeList.sort( Map.Entry.comparingByValue());

        Map<Integer, String > sortedEmployeeMap = new LinkedHashMap<>();
        for( var entry: employeeList ) {
            sortedEmployeeMap.put( entry.getKey(), entry.getValue() );
        }
        System.out.println(sortedEmployeeMap);
    }
}
