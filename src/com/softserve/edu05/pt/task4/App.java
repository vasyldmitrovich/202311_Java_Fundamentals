package com.softserve.edu05.pt.task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Petro", 3, 4500);
        employees[1] = new Employee("Nadia", 3, 5000);
        employees[2] = new Employee("Valia", 2, 2000);
        employees[3] = new Employee("Serg", 1, 2500);
        employees[4] = new Employee("Volodimir", 5, 4300);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of department: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartmentNumber() == num){
                System.out.println(employees[i].getName());
            }
        }

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        Employee[] employeesSorted = new Employee[5];
        for (int i=0; i<employees.length; i++) {
            employeesSorted[employees.length - 1 - i] = employees[i];
        }
        employees = employeesSorted;
        System.out.println(Arrays.toString(employees));
    }
}
