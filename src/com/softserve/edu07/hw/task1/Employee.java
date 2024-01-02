package com.softserve.edu07.hw.task1;

public abstract class Employee implements Payment{
    String employeeId;//Make fields private and add getters and setters
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public double calculatePay() {
        return 0;
    }//If you do not do implementation you do must not implement this method in abstract class
}
