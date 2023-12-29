package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxId;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
