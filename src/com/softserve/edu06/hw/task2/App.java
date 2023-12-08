package com.softserve.edu06.hw.task2;

public class App {
    public static void main(String[] args) {
         Employee employee = new Employee("Taras", 36, 258956.25);
         Developer developer = new Developer("Petro", 32, 56989.56, "Average Java developer");
         System.out.println(employee.report());
         System.out.println(developer.report());
    }
}
