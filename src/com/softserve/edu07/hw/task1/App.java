package com.softserve.edu07.hw.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {

        Employee[] employess = new Employee[4];

        employess[0] = new ContractEmployee("1","Teacher", 30, 200, "123");
        employess[1] = new ContractEmployee("2","Driver", 20, 3000, "124");
        employess[2] = new SalariedEmployee("3","Cleaner", 90000, "125");
        employess[3] = new SalariedEmployee("4","Writer", 10000, "126");

        Arrays.sort(employess,Employee.SalaryComparator);

        for(Employee emp:employess){
            System.out.println(emp);
        }
    }
}
