package com.softserve.edu03.pt.Task2;

public class Employee {

    private final String name;
    private final double rate;
    private final double hours;

    private static double totalSum = 0;

//    public Employee() {
//        //default constructor
//
//        this.name = null;
//        this.rate = 0;
//        this.hours = 0;
//
//    }
    public Employee(String name,double rate,double hours) {

        this.name = name;
        this.rate = rate;
        this.hours = hours;

        totalSum += getSalary();
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

}
