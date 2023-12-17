package com.softserve.edu05.pt.task4;


import java.util.Scanner;

public class Main {//Move to App.java
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Artur", 3, 400),
                new Employee("Marta", 1, 600),
                new Employee("Anna", 3, 760),
                new Employee("Orest", 1, 66),
                new Employee("Maksym", 4, 150),
        };

        System.out.print("Enter department number: ");
        int num = scanner.nextInt();
        boolean found = false;
        for (var v : employees) {
            if (v.getDepartmentNumber() == num) {
                System.out.println(v.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees from department " + num);
        }
    }
}
class Employee {//This class should be in Employee.java file not here
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
