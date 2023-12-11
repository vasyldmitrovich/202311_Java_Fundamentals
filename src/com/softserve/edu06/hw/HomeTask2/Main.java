package com.softserve.edu06.hw.HomeTask2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Lina", 20, 2000),
                new Developer("Pudge", 18, 2000, "Java junior developer"),
                new Employee("Tusk", 19, 2000),
                new Developer("Meepo", 30, 2000, "Project manager"),
        };

        for (var employee : employees) {
            System.out.println(employee.report());
        }
    }


}
