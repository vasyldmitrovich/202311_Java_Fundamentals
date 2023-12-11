package com.softserve.edu07.hw.task1;

public class SalariedEmployee extends Employee implements Payment {
    String name;
    double salary;
    String socialSecurityNumber;

    public SalariedEmployee(String Id, String name, double salary, String socialSecurityNumber) {
        this.employeeId = Id;
        this.name = name;
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
