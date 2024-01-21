package com.softserve.edu14.hw.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopularName = findMostPopularName(employees);

        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    public static Optional<String> findMostPopularName(List<Employee> employees) {
        if (employees.isEmpty()) {
            return Optional.empty();
        }

        Map<String, Long> nameCountMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostPopularEntry = nameCountMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));

        return mostPopularEntry.map(Map.Entry::getKey);
    }
}

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
