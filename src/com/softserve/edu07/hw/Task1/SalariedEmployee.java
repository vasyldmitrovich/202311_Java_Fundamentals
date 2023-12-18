package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends Employee{
    protected String name;
    protected double salary;
    protected String socialSecurityNumber;

    protected double averageSalary;


    public SalariedEmployee( String name, double salary, String socialSecurityNumber) {
        super();
        this.name = name;
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
        this.averageSalary = getAverageSalary();
    }

    public String getName() {
        return name;
    }


    @Override
    public double getAverageSalary(){
        return this.salary / 12;
    }

    @Override
    public double calculatePay() {
     return this.salary;
    }

    @Override
    public String toString() {
        return "Salaried employee " + super.toString() +
                ", name = " + name +
                ", salary = " + salary +
                ", SSN = " + socialSecurityNumber + ";";
    }
}
