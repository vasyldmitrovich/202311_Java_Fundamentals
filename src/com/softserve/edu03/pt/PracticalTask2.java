package com.softserve.edu03.pt;

public class PracticalTask2 {
    public static void run() {
        Employee employee1 = new Employee();
        employee1.setName("John");
        employee1.setHours(5);
        employee1.setRate(2);
        System.out.println(employee1);
        Employee employee2 = new Employee("Alex", 10, 2);
        System.out.println(employee2);
        Employee employee3 = new Employee("Bob", 15, 2);
        System.out.println(employee3);
        System.out.println("Total sum of salary: " + Employee.getTotalSum());
        System.out.println("Total sum of salary with bonuses: " + Employee.getTotalSumWithBonuses());
    }

}
