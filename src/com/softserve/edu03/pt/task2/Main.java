package com.softserve.edu03.pt.task2;

import java.util.Scanner;

import static com.softserve.edu03.pt.task2.Employee.getTotalSum;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee("Steeve", 40, 160);
        Employee employee2 = new Employee("Maksym", 20, 80);
        Employee employee3 = new Employee("Anna", 90, 30);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total salary of all employees " + getTotalSum());
    }
}
