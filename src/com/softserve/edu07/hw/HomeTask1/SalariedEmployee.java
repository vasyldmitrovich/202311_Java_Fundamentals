package com.softserve.edu07.hw.HomeTask1;

public class SalariedEmployee extends Employee implements Payment {
    private long socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, long socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "\nSalariedEmployee ->" +
                "socialSecurityNumber: " + socialSecurityNumber +
                ", pay: " + calculatePay() +
                ", employeeId: '" + employeeId + '\'' +
                ", Name='" + Name
                ;
    }
}
