package com.softserve.edu7.hw.hw1;

abstract class Employee implements Payment{
    private String employeeld;
    private double averageMonthlySalary;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
        this.averageMonthlySalary = 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                '}';
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }
}
