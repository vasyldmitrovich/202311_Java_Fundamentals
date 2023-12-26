package com.softserve.edu10.pt.Task2;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Employee { //Class created for additional info like position, salary,date of birth

    private String name;
    private String position;
    private double salary;
    private String dob;

    public Employee(String name, String position, double salary, String dob) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dob = dob;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


    public static Employee getEmployee(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Position: ");
        String position = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Date of Birth: ");
        String dob = scanner.nextLine();

        return new Employee(name, position, salary, dob);
    }



    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position +
                ", Salary: " + salary + ", Date of Birth: " + dob;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employeeInfo = (Employee) obj;
        return Objects.equals(name, employeeInfo.name);
    }


}
