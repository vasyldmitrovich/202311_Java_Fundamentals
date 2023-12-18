package com.softserve.edu03.pt03;

public class PracticalTask03 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Lilya");
        employee1.setRate(8.5);
        employee1.setHours(5);
        Employee employee2 = new Employee("Max", 7.15);
        employee2.setHours(10);
        Employee employee3 = new Employee("Gigy", 6.87, 20);
        System.out.println("Total salary for all employees is " + Employee.getTotalSum());
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }

}
