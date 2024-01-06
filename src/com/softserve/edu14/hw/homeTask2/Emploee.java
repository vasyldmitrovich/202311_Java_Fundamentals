package com.softserve.edu14.hw.homeTask2;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emploee {
    private String name;

    public Emploee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static Optional<String> mostPopularName(Stream<Emploee> employees) {
        return employees
                .collect(Collectors.groupingBy((Emploee::getName), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

}
