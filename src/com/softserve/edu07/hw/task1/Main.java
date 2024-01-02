package com.softserve.edu07.hw.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("1", "Artur", "SSN1", 5000),
                new ContractEmployee("2", "Marta", "FTI2", 20, 120),
                new SalariedEmployee("3", "Anna", "SSN3", 6000),
                new ContractEmployee("4", "Oleg", "FTI4", 25, 80)
        };

        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.calculatePay(), e1.calculatePay()));

        for (var employee : employees) {
            System.out.println("ID: " + ((Employee) employee).getEmployeeId() +
                    ", Name: " + employee.getName() +
                    ", Salary: " + employee.calculatePay());
        }
    }
}
