package com.softserve.edu07.hw.task1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private double monthlySalary;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double monthlySalary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
