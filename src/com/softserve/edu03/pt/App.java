package com.softserve.edu03.pt;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Practical tasks

        // Task 1
        App.task1();

        // Task 2
        App.task2();

    }

    public static void task1() {

        System.out.println("Enter the first number: ");
        double a1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number: ");
        double a2 = Double.parseDouble(scanner.nextLine());
        System.out.println(a1);
        System.out.println("The sum of " + a1 + " and " + a2 + " is "+ App.getTotal(a1,a2));
        System.out.println("The average of " + a1 + " and " + a2 + " is "+ App.getAverage(a1,a2));

        System.out.println("Enter the number as a string: ");
        String a = scanner.nextLine();
        System.out.println("String as number: " + App.getNumber(a));

    }

    public static double getTotal(double a1, double a2) {
        return a1 + a2;
    }

    public static double getAverage(double a1, double a2) {
        return (a1 + a2)/2;
    }

    public static double getNumber(String a) {
        return Double.parseDouble(a);
    }




    public static void task2() {

        for (int i=0; i<=2; i++) {
            System.out.println("Enter the name of employee: ");
            String name = scanner.nextLine();
            System.out.println("Enter the rate of employee: ");
            double rate = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the hours of employee: ");
            int hours = Integer.parseInt(scanner.nextLine());
            Employee employee = new Employee(name, rate, hours);
            System.out.println(employee);
            double salary = employee.getSalary();
            System.out.println("Salary of " + employee.getName() + " is " + salary +
                    " bonuses is " + employee.getBonuses(salary));
            System.out.println(Employee.totalSum);
        }
        System.out.println("Total salary with bonuses: " + Employee.totalSum);

    }

}
