package com.softserve.edu03.pt.task2;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    static public int totalSum;

    public Employee() {
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public int getSalary() {
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

    public static int getTotalSum() {
        return totalSum;
    }
}
