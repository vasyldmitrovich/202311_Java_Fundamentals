package com.softserve.edu10.pt.pt1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pt1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Bob");
        employeeMap.put(2,"Alice");
        employeeMap.put(3,"Vasya");
        employeeMap.put(4,"Lee");
        employeeMap.put(5,"Jack");
        employeeMap.put(6,"Jonh");
        employeeMap.put(7,"Alex");
        employeeMap.put(8,"Akela");
        employeeMap.put(9,"Bob");
        System.out.println(employeeMap);

        System.out.println("Enter ID to search:");
        int idToSearch = SCANNER.nextInt();
        if (employeeMap.containsKey(idToSearch)){
            System.out.println("Emloyee with id " + idToSearch +
                    " is " + employeeMap.get(idToSearch));
        }else {
            System.out.println("There is no emloyee with id = " + idToSearch);
        };

        System.out.println("Enter name to search:");
        String nameToSearch = SCANNER.next();
        boolean found= false;
            for (var entry:employeeMap.entrySet()){
                if (entry.getValue().equals(nameToSearch)){
                    System.out.println("Emloyee with name " + nameToSearch +
                            " is id:" + entry.getKey());
                    found = true;
                }
            }
        if (!found) {
            System.out.println("There is no emloyee with name = " + nameToSearch);
        }




    }
}
