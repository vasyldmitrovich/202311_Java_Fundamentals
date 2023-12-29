package com.softserve.edu07.hw.task1;

public abstract class Employee implements Payment{
    String employeeId;
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
