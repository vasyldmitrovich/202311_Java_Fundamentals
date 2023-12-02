package com.softserve.edu03.pt.Task2;

import static com.softserve.edu03.pt.Task2.Employee.getTotalSum;

public class App {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Alex", 12, 23);
        Employee employee2 = new Employee("Nikolay", 34, 33);
        Employee employee3 = new Employee("Stepan", 27, 41);

        // Display information about each employee
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Total salary of all employees: " + getTotalSum());
    }
}
