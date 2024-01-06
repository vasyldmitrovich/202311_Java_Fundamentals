package com.softserve.edu14.pt.practicalTask1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        //Print how many empty strings are in this list
        var countOfEmptyStrings = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Count of empty strings " + countOfEmptyStrings);
        //Remove all empty Strings from list and print the result
        var listWithoutEmptyStrings = list.stream()
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.println(listWithoutEmptyStrings);
        //Convert String to uppercase and Join them with coma. Print the result
        var upperCaseString = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(upperCaseString);

    }
}
