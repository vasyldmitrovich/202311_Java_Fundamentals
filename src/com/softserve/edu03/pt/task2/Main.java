package com.softserve.edu03.pt.task2;

import java.util.Scanner;

import static com.softserve.edu03.pt.task2.Employee.getTotalSum;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Artur");
        employee1.setRate(12.5);
        employee1.setHours(10);

        Employee employee2 = new Employee("Maksym", 10.0);
        employee2.setHours(20);

        Employee employee3 = new Employee("Anna", 5.0, 10);

        System.out.println("Total salary for all employee is " + getTotalSum());

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee3.setHours(30);
        System.out.println(employee3);
        System.out.println(getTotalSum());
    }
}
