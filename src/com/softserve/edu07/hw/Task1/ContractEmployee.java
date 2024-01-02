package com.softserve.edu07.hw.Task1;

public class ContractEmployee extends Employee {//Good

    protected String name;//If you do not need to have access to these fields from child, do fields private
    protected double rate;
    protected int hours;
    protected double salary;
    protected String federalTaxIdMember;

    protected double averageSalary;

    public ContractEmployee(String name, double rate, int hours, String federalTaxIdMember) {
        super();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        this.federalTaxIdMember = federalTaxIdMember;
        this.salary = calculatePay();
        this.averageSalary = getAverageSalary();

    }

    public double getSalary() {
        return calculatePay();
    }

    @Override
    public double getAverageSalary(){
        return salary / 12;
    }

    @Override
    public double calculatePay() {
        return this.hours * this.rate;
    }

    @Override
    public String toString() {
        return "Contract employee " + super.toString() +
                ", name = " + name +
                ", rate = " + rate +
                ", hours = " + hours +
                ", salary = " + salary +
                ", FTId : " + federalTaxIdMember + ";";
    }
}
