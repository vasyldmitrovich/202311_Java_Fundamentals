package com.softserve.edu07.hw.Task1;

public abstract class Employee implements Payment{
    private static int nextEmployeeId = 1;

    protected String employeeId;

    public Employee() {
        this.employeeId = "E " + nextEmployeeId++;//automatic id for each employee
    }

    @Override
    public String toString() {
        return "Id : " + employeeId;
    }

    @Override
    public double getAverageSalary() {
        return 0;
    }
}
