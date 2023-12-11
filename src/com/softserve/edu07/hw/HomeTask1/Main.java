package com.softserve.edu07.hw.HomeTask1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Payment[] employees = {
                new SalariedEmployee("01", "Bob", 231835321, 5000),
                new SalariedEmployee("02", "John", 12355321, 7000),
                new ContractEmployee("03", "Jack", 88958, 20, 300),
                new ContractEmployee("04", "Abbaddon", 78958, 40, 280),
        };
        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees, Comparator.comparingDouble(Payment::calculatePay));
        System.out.println("====================");
        System.out.println(Arrays.toString(employees));
    }
}
