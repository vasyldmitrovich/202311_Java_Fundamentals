package com.softserve.edu7.hw.hw1;

import java.util.Arrays;

public class hw1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Lee", "DS123456", 15, 160),
                new SalariedEmployee("Alex", "XA123456", 17, 162),
                new SalariedEmployee("Bob", "KA123456", 14.5, 168),
                new ContractEmployee("Alisa", "12345678941645", 15000.00),
                new ContractEmployee("Lisa", "62345678941645", 17000.00)
        };

        for (var employee : employees) {
            employee.calculatePay();
        }

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].getAverageMonthlySalary() < employees[j+1].getAverageMonthlySalary()) {
                    Employee swap = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = swap;
                }
            }
        }
        for (var employee : employees) {
            System.out.println(employee.toString());
        }
    }
}

