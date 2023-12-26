package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task4 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Bob", 1, 50),
                new Employee("Sam", 2, 51),
                new Employee("Bill", 2, 52),
                new Employee("Pedro", 3, 49),
                new Employee("Juan", 3, 48),
        };

        findEmployeesByDepartmentNumber(employees);

        System.out.println("=".repeat(40));

        sortingBySalary(employees);

    }

    // Output results for all employees of a certain department (input department number in the console);
    static void findEmployeesByDepartmentNumber( Employee[] employees ) {
        System.out.print("Enter department number: ");
        int abteilung = SCANNER.nextInt();
        SCANNER.nextLine();

        boolean fund = false;
        for( var emp: employees ) {
            if( emp.getDepartmentNumber() == abteilung ) {
                System.out.println(emp);
                fund = true;
            }
        }

        if( !fund ) {
            System.out.println("None of our five employees are in department #" + abteilung + ".");
        }
    }

    // arrange workers by the field salary in descending order
    static void sortingBySalary( Employee[] employees ) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if( employees[j].getSalary() < employees[j + 1].getSalary() ) {
                    Employee temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;
                }
            }
         }

        for( Employee emp: employees ) {
            System.out.println(emp);
        }
    }
}

class Employee {//Move to Employee.java do not do inner
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
