package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee implements Payment{
    String name;
    int hours;
    double rate;
    double salary;

    String federalTaxIdMember;

    public ContractEmployee(String Id, String name, int hours, double rate, String federalTaxIdMember) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.federalTaxIdMember = federalTaxIdMember;
        this.employeeId = Id;
        this.salary = calculatePay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return this.hours * this.rate;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
