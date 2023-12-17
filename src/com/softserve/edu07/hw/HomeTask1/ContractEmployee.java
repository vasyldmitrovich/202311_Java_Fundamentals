package com.softserve.edu07.hw.HomeTask1;

public class ContractEmployee extends Employee implements Payment {//This interface should implement class Employee
    private long federalTaxIdMember;
    private double hourlyRate;
    private int numbersOfHoursWorked;

    public ContractEmployee(String employeeId, String name, long federalTaxIdMember, double hourlyRate, int numbersOfHoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numbersOfHoursWorked = numbersOfHoursWorked;
    }

    public long getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getNumbersOfHoursWorked() {
        return numbersOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numbersOfHoursWorked;
    }

    @Override
    public String toString() {
        return "\nContractEmployee -> " +
                "federalTaxIdMember: " + federalTaxIdMember +
                ", pay: " + calculatePay() +
                ", employeeId='" + employeeId + '\'' +
                ", Name='" + Name + '\''

                ;
    }
}
