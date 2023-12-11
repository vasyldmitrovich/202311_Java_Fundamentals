package com.softserve.edu07.hw.HomeTask1;

public class Employee {
    protected String employeeId;
    protected String Name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        Name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return Name;
    }
}
