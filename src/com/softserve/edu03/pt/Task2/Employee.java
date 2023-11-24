package com.softserve.edu03.pt.Task2;

import static com.softserve.edu03.pt.Task2.Main.SCANNER;
public class Employee {
    private String name;
    private double rate;
    private double hours;
    static double totalSum;

    public Employee() {
        this("N/A", 0.0, 0.0);
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String number) {
        System.out.print("Enter the name of employee " + number + ": ");
        name = SCANNER.nextLine();
    }

    static void getSalary(Employee employee) {
        double gehalt = employee.getRate() * employee.getHours();
        totalSum += gehalt;
    }

    static double getBonuses() {
        return totalSum * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    // the name of the employee is obtained through the constructor
    // the below method deals with the hourly rate and the worked hours
    public static void askForParameters(Employee employee) {
        System.out.print("Enter the hourly remuneration rate for employee " + employee.name + ": ");
        double rate = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setRate(rate);

        System.out.print("Enter the number of hours worked by employee " + employee.name + ": ");
        double hours = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setHours(hours);

        System.out.println(); // just an empty line to please the eye
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
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
