package com.softserve.edu03.pt03;

public class Employee {

    private static double totalSum = 0;
    private static final double BONUS_RATE = 0.1;
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
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses= " + getBonuses() +
                '}';
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return BONUS_RATE * getSalary();
    }

    private double getTotalSalary() {
        return getSalary() + getBonuses();
    }

    public static double getTotalSum() {
        return totalSum;
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
        double oldSalary = getTotalSalary();
        this.rate = rate;
        double newSalary = getTotalSalary();
        totalSum += (newSalary - oldSalary);
    }

    public int getHours(int hours) {
        return hours;
    }

    public void setHours(int hours) {
        double oldSalary = getTotalSalary();
        this.hours = hours;
        double newSalary = getTotalSalary();
        totalSum += (newSalary - oldSalary);
    }


}
