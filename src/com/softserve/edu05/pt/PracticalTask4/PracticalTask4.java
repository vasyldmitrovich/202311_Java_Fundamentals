package com.softserve.edu05.pt.PracticalTask4;

import java.util.Scanner;

public class PracticalTask4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 1, 10_000),
                new Employee("Bob", 2, 9_000),
                new Employee("Jack", 2, 12_000),
                new Employee("John", 3, 11_000),
                new Employee("Marc", 3, 15_000),
        };
        System.out.print("Enter department number: ");
        int departmentNumber = SCANNER.nextInt();
        boolean found = false;

        for (var emploee : employees) {
            if (emploee.getDepartmentNumber() == departmentNumber) {
                System.out.println(emploee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees from  department №" + departmentNumber);
        }

        System.out.println("==========Sorted array=============");
        sort(employees);
        for (var employee : employees) {
            System.out.println(employee);
        }

    }

    //Bubble sort
    static void sort(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
    }
}