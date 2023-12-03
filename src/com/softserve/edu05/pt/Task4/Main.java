package com.softserve.edu05.pt.Task4;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe",1385,3000);
        Employee employee2 = new Employee("Mike",1251,2900);
        Employee employee3 = new Employee("Bob",1385,3900);
        Employee employee4 = new Employee("Max",2001,5000);
        Employee employee5 = new Employee("Alex",1251,1800);

        Employee[] employees = new Employee[]{
                employee1, employee2, employee3, employee4, employee5
        };
        Employee.certainDepartment(employees);
        Employee.sortInDescendingOrder(employees);
    }
}
