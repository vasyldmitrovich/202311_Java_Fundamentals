package com.softserve.edu07.hw.task1;

import java.util.Comparator;

public abstract class Employee {
    String employeeId;
    double salary;

    public static Comparator<Employee> SalaryComparator = new Comparator <Employee>(){
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getSalary() - o1.getSalary());
        }
    };

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
