package com.softserve.edu14.hw.Task2;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        Stream<Employee> employees = Stream.of(

                new Employee("Sam","Manager",30000),
                new Employee("Bob","DevOps",3500),
                new Employee("Sara","DevOps",3500),
                new Employee("Sam","Mid",5000),
                new Employee("Sara","Junior",1500),
                new Employee("Sara","Senior",7000),
                new Employee("Stew","Mid",4000)
        );

       Optional<String> mostPopular =  mostPopularName(employees);
       mostPopular.ifPresent(name -> {
           System.out.println("Most popular name : " + name);
       });

    }
    static Optional<String> mostPopularName(Stream< Employee> employees) {

        Map<String, Long> nameFrequencyMap = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return nameFrequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
