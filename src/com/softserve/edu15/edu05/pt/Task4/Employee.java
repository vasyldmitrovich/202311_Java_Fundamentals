package com.softserve.edu15.edu05.pt.Task4;

import java.util.Scanner;

public class Employee {
    private final String name;
    private final int departmentNumber;
    private final double salary;

    public static Scanner scanner = new Scanner(System.in);

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }


    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name : " + name +
                ", department number: " + departmentNumber +
                ", salary: " + salary;
    }

    public static void certainDepartment(Employee[] employees){

        // All employees of a certain department (input department number in the console);
        System.out.println("Enter department number");
        int input = scanner.nextInt();
        boolean notFound = true;

        for (Employee employee: employees) {
            if(employee.getDepartmentNumber() == input){
                System.out.println(employee.toString());
                notFound = false;
            }
        }
        if(notFound){
            System.out.printf("No employees found with number %d\n",input);
        }
    }

    public static void sortInDescendingOrder(Employee[] employees){

        //Arrange workers by the field salary in descending order.

        System.out.println("Workers by salary in descending order: ");

        //Bubble sort
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    // Swap arr[j] and arr[j+1]
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        //output
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }

}

