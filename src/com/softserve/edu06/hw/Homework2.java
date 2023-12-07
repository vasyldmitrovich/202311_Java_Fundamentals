package com.softserve.edu06.hw;

public class Homework2 {
    public static void main(String[] args) {
        Employee e = new Employee("Bob", 20, "Accountant", 20000);
        Developer d = new Developer("John", 25, "Developer", 25000);

        System.out.println(e.report());
        System.out.println(d.report());

    }
}
class Employee {
    private String name;
    private int age;
    private double salary;
    private String position;

    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " + "Salary: \u20B4 %.2f.", name, age, salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}

class Developer extends Employee {

    public Developer(String name, int age, String position, double salary) {
        super(name, age, position, salary);
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, " + "Salary: \u20B4 %.2f.", getName(), getAge(), getPosition(), getSalary());
    }
}
