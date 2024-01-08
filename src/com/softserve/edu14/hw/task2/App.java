package com.softserve.edu14.hw.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Olena"));
        employees.add(new Employee("Dmitro"));
        employees.add(new Employee("Semen"));
        employees.add(new Employee("Maxim"));
        employees.add(new Employee("Dmitro"));
        employees.add(new Employee("Petro"));

        Optional<String> mostPopularName = mostPopularName(employees.stream());
        mostPopularName.ifPresent(System.out::println);

    }

    static Optional<String> mostPopularName(Stream<Employee> employeesStream) {
        Map<String, Long> employeeMap = employeesStream
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return employeeMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
