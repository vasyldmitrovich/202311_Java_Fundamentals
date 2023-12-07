package com.softserve.edu03.pt.task2;

public class Employee {
    private static double totalSum = 0;

    private String name;
    private double rate;
    private int hours;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        setRate(rate);
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
        //totalSum += getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += (newSalary - oldSalary);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += (newSalary - oldSalary);
    }

    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name : " + name +
                ", rate = " + rate +
                ", hours = " + hours +
                ", salary = " + getSalary() +
                ", bonus = " + getBonus();
    }

    public double getBonus() {
        return getSalary() * 0.1;
    }

    public static double getTotalSum() {
        return totalSum;
    }
}
