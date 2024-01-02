package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class pt4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        initialization(employees);
        getDepartmentEmployees(employees);

        sort(employees);

    }

    static void getDepartmentEmployees(Employee[] employees) {
        System.out.println("Department:");
        boolean found = false;
        int numberDemartment = SCANNER.nextInt();
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == numberDemartment) {
                System.out.println(employee.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("no employees in the department #" + numberDemartment);
        }
        ;
    }

    ;

    static void initialization(Employee[] employees) {
        employees[0] = new Employee("Sara", 5, 120.50);
        employees[1] = new Employee("Jo", 3, 140.49);
        employees[2] = new Employee("Lee", 7, 110.49);
        employees[3] = new Employee("Po", 33, 50.00);
        employees[4] = new Employee("Jou", 5, 140.49);
    }


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
        for (var employee : employees) {
            System.out.println(employee.toString());
        }
    }

}

