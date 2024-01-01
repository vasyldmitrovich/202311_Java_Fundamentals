package com.softserve.edu10.pt.pt2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class Employee implements Comparable<Employee>{
    Integer Id;
    String name;
    String position;
    double salary;
    Date dateofBirth;

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(Integer id, String name, String position, double salary, String dateofBirth) throws ParseException {
        this.Id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateofBirth = new SimpleDateFormat("d.M.yyyy").parse(dateofBirth);
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateofBirth=" + dateofBirth +
                "}\n";
    }


    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }
}
