package com.softserve.edu03.pt.Task2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static public final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        // Creating our three employees
        Employee employee1 = new Employee();
        Employee.askForParameters(employee1);

        Employee employee2 = new Employee();
        Employee.askForParameters(employee2);

        Employee employee3 = new Employee();
        Employee.askForParameters(employee3);

        //Calculating the total amount of salaries
        Employee.getSalary(employee1);
        Employee.getSalary(employee2);
        Employee.getSalary(employee3);

        //Outputting the results
        System.out.println("\nOur three employees are as follows:");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.printf("\nTotal amount of salaries for all three employees is %.2f dollars.\n", Employee.totalSum);

        System.out.printf("Our three employees are entitled to the following amount of bonuses: %.2f.", Employee.getBonuses());
    }
}
