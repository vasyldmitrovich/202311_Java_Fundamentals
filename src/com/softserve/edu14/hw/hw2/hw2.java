package com.softserve.edu14.hw.hw2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hw2 {
    public static void main(String[] args) {
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Din"));
        employees.add(new Employee("Sam"));
        employees.add(new Employee("Bob"));

        //var streamEmployees = Stream.of("Bob", "Din", "Sam","Bob");
       // System.out.println(mostPopularName(streamEmployees));

    }
    /*static Optional<String> mostPopularName(Stream< Employee> employees) {
        Map<String, Long> frequency =employees.collect(Function.identity(),Collectors.counting());
                //.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        return Optional.empty();
    }*/

}
