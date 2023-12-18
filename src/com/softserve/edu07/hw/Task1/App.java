package com.softserve.edu07.hw.Task1;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.sort;

public class App {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
                new SalariedEmployee("Ben",2000,"UHSd77"),
                new ContractEmployee("Kate",23,33,"iaush77"),
                new SalariedEmployee("Zack",3444,"UKJCS8"),
                new ContractEmployee("Sanya",12,100,"LKASU3"),
                new SalariedEmployee("Sergo",8223,"Udlkamc"),
                new ContractEmployee("Leha",211,123,"(*#dkds"),
                new SalariedEmployee("Misha",23,"I989ux"),
                new ContractEmployee("Danu",532,33,"HIxias8")

        };


        Arrays.sort(employees,(e1,e2)->Double.compare(e2.getAverageSalary(), e1.getAverageSalary()));

        for (Employee employee : employees){
            System.out.println(employee.toString());
        }


    }

//    public static double getAverageSalary (Employee[] employees){
//        double total = 0;
//        double count = 0;
//
//        for (Employee employee : employees){
//            total += employee.calculatePay();
//            count++;
//
//        }
//        return total / count;
//    }
}
