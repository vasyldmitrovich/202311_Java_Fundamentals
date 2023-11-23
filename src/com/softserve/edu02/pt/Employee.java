package com.softserve.edu02.pt;

import java.util.Scanner;

public class Employee {

    private String name;
    private double rate;
    private double hours;

    private static double totalSum = 0;

    public Employee() {

    }
    public Employee(String name,double rate,double hours) {

        this.name = name;
        this.rate = rate;
        this.hours = hours;

        totalSum += getSalary();
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name : " + name +
                ", rate = " + rate +
                ", hours = " + hours +
                ", salary = " + getSalary() +
                ", bonus = " + getBonuses();
    }

    public double getSalary() {
        return rate * hours;
    }
    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public static double getTotalSum(){
        return totalSum;
    }


    public static void main(String[] args) {

        Employee employee1 = new Employee("Alex", 12, 23);
        Employee employee2 = new Employee("Nikolay", 34, 33);
        Employee employee3 = new Employee("Stepan", 27, 41);

        // Display information about each employee
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Total salary of all employees: " + getTotalSum());


    }
}
