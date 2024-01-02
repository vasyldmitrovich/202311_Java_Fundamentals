package com.softserve.edu07.hw.task1;

public abstract class Employee implements Payment{
    private String employeeId;//Make fields private and add getters and setters
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calculatePay() {
        return 0;
    }//If you do not do implementation you do must not implement this method in abstract class
}
