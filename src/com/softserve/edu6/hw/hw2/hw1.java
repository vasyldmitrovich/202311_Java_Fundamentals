package com.softserve.edu6.hw.hw2;

public class hw1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Vasya", 28, 25000.10),
                new Developer("Petya", 28, 55000.10, "middle Java developer"),
        };

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }

}
