package com.softserve.edu10.pt.task1_2;

import java.util.Date;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String position;
    private int salary;
    private Date dateOfBirth;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.position = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.position.compareTo(o.position);
    }


}
