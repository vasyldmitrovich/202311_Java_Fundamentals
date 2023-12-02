package com.softserve.edu03.pt;

public class Employee {
    String name;//Make all fields private
    double rate;
    int hours;
    static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getSalary() {
        double salary = this.hours * this.rate;
        totalSum += salary;
        return salary;
    }

    public double getBonuses(double sal) {
        double bonus = sal * 0.10;
        totalSum += bonus;
        return bonus;
    }


}
