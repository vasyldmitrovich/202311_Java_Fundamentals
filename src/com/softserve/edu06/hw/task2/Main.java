package com.softserve.edu06.hw.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ulli", 34, 100000);
        Employee employee2 = new Developer("Artur", 22, 7000, "Trainee Java Developer");
        Employee employee3 = new Developer("Maksym", 43, 40000, "FrontEnd Developer");
        Employee employee4 = new Employee("Jak", 25, 15000);

        Employee[] employees = new Employee[] {
                employee1, employee2, employee3, employee4
        };

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
