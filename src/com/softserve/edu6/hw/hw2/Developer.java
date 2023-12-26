package com.softserve.edu6.hw.hw2;

class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, position: %s" +
                "Salary: \u2084 %.2f.", getName(), getAge(), position, getSalary());
    }
}
